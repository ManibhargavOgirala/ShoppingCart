package com.ayasyashoppingcart.services;

import java.util.List;

import com.ayasyashoppingcart.entity.Category;
import com.ayasyashoppingcart.request.CategoryRequest;
import com.ayasyashoppingcart.request.DelCategoryRequest;

public interface CategoryService  {
	Category addCategory(CategoryRequest req);
	Category deleteCategory(DelCategoryRequest req);

    List<Category> findAll();

	Category findById(Long id);
}
