package com.ayasyashoppingcart.services.impl;

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
		if(req != null)
		{
			Optional<Category> findByCatId = categoryRepo.findById(req.getCategoryId());
			if(findByCatId.isPresent())
			{
				category = findByCatId.get();
				category.setUpdatedBy("ADMIN");
			}
			else
			{
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
		// TODO Auto-generated method stub
		return null;
	}

}
