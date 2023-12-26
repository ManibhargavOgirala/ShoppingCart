package com.ayasyashoppingcart.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayasyashoppingcart.entity.Category;
import com.ayasyashoppingcart.repository.CategoryRepo;
import com.ayasyashoppingcart.request.CategoryRequest;
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
	public Category deleteCategory(CategoryRequest req) {
		Category category = null;
		if (req != null) {
			Optional<Category> findByCatId = categoryRepo.findById(req.getCategoryId());
			if (findByCatId.isPresent()) {
				category = new Category();
				category.setUpdatedBy("ADMIN");
				category.setIsActive("false");
				BeanUtils.copyProperties(req, category);
			}
		}
		return categoryRepo.saveAndFlush(category);
	}

	@Override
	public List<Category> findAll() {

		return categoryRepo.findAll();
	}

	@Override
	public Category findById(Long id) {
		Optional<Category> findByCatId = categoryRepo.findById(id);
		Category category = new Category();
		if(findByCatId.isPresent())
		{
			category = findByCatId.get();
		}


		return category;
	}

}
