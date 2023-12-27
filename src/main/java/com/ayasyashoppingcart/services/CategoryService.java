package com.ayasyashoppingcart.services;

import com.ayasyashoppingcart.entity.Category;
import com.ayasyashoppingcart.request.CategoryRequest;
import com.ayasyashoppingcart.request.CategorySearchRequest;
import com.ayasyashoppingcart.response.CategorysearchResponse;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CategoryService {
	Category addCategory(CategoryRequest req);
	Category deleteCategory(CategoryRequest req);

    List<Category> findAll();

	Category findById(Long id);

	CategorysearchResponse advanceSearch(CategorySearchRequest categorySearchRequest);
}
