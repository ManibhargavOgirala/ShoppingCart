package com.ayasyashoppingcart.services;

import com.ayasyashoppingcart.entity.Category;
import com.ayasyashoppingcart.request.CategoryRequest;

public interface CategoryService {
	Category addCategory(CategoryRequest req);
	Category deleteCategory(CategoryRequest req);
}
