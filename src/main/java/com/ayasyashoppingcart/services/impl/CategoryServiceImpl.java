package com.ayasyashoppingcart.services.impl;

import java.util.List;
import java.util.Optional;

import com.ayasyashoppingcart.request.CategorySearchRequest;
import com.ayasyashoppingcart.response.CategoryResponse;
import com.ayasyashoppingcart.response.CategorysearchResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ayasyashoppingcart.entity.Category;
import com.ayasyashoppingcart.handler.CategoryNotFoundException;
import com.ayasyashoppingcart.handler.NoCategoryFoundException;
import com.ayasyashoppingcart.repository.CategoryRepo;
import com.ayasyashoppingcart.request.CategoryRequest;
import com.ayasyashoppingcart.request.DelCategoryRequest;
import com.ayasyashoppingcart.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepo categoryRepo;

	@Override
	public Category addCategory(CategoryRequest req) {
		Category category = null;
		if (req != null) {
			Optional<Category> findByCatId = categoryRepo.findById(req.getCategoryId());
			if (findByCatId.isPresent()) {
				category = findByCatId.get();
				category.setUpdatedBy("ADMIN");
			} else {
				category = new Category();
				category.setCreatedBy("ADMIN");
			}
			BeanUtils.copyProperties(req, category);
			category.setIsActive("true");
		}
		return categoryRepo.save(category);
	}

	@Override
	public Category deleteCategory(DelCategoryRequest req) {
		Optional<Category> findByCatId = categoryRepo.findById(req.getCategoryId());
		Category category = null;
		if (findByCatId.isPresent()) {
			category = new Category();
			BeanUtils.copyProperties(findByCatId.get(), category);
			category.setUpdatedBy("ADMIN");
			category.setIsActive("false");
			categoryRepo.save(category);
		}

		if (findByCatId.isEmpty()) {
			throw new CategoryNotFoundException("Category Id " + req.getCategoryId() + " Not Found !!");
		}
		return category;
	}

	@Override
	public List<Category> findAll() {

		return categoryRepo.findAll();
	}

	@Override
	public Category findById(Long id) {
		Optional<Category> findByCatId = categoryRepo.findById(id);
		Category category = new Category();
		if (findByCatId.isPresent()) {
			category = findByCatId.get();
		}

		if (findByCatId.isEmpty()) {
			throw new NoCategoryFoundException("Category Id " + id + " Not Found !!");
		}

		return category;
	}

	@Override
	public CategorysearchResponse advanceSearch(CategorySearchRequest categorySearchRequest) {

          CategorysearchResponse categorysearchResponse = new CategorysearchResponse();

		  Page<CategoryResponse> categoryPageResponse = null;

		Pageable pageRequest = PageRequest.of(categorySearchRequest.getPage() - 1, categorySearchRequest.getLimit(),
				Sort.by(Sort.Direction.fromString(categorySearchRequest.getOrderDirection()), categorySearchRequest.getOrderBy()));

		if((categorySearchRequest.getCategoryName()==null|| categorySearchRequest.getCategoryName().isEmpty())
		&& (categorySearchRequest.getCreatedDate()==null|| categorySearchRequest.getCreatedDate().isEmpty()))


		{
			categoryPageResponse=	categoryRepo.findAllCategory(pageRequest);
		}
		else
		{
			String category = (categorySearchRequest.getCategoryName()==null || categorySearchRequest.getCategoryName().isEmpty())?
					"%":categorySearchRequest.getCategoryName().trim()+"%";
			String date = (categorySearchRequest.getCreatedDate()==null || categorySearchRequest.getCreatedDate().isEmpty())?
					"%":categorySearchRequest.getCreatedDate().trim()+"%";
			categoryPageResponse = categoryRepo.findAllCategory(pageRequest,category,date);
		}
               BeanUtils.copyProperties(categorySearchRequest,categorysearchResponse);
		categorysearchResponse.setCount(categoryPageResponse.getTotalElements());
		categorysearchResponse.setResultObjects(categoryPageResponse.getContent());

		return categorysearchResponse;
	}


}
