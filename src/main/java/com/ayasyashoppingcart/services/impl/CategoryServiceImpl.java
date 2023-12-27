package com.ayasyashoppingcart.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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

}
