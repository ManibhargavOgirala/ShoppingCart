package com.ayasyashoppingcart.services;

import com.ayasyashoppingcart.entity.Category;
import com.ayasyashoppingcart.request.CategoryRequest;

import java.util.List;

public interface CategoryService {
	Category addCategory(CategoryRequest req);
	Category deleteCategory(CategoryRequest req);

    List<Category> findAll();

	Category findById(Long id);
}
