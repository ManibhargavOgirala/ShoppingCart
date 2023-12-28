package com.ayasyashoppingcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayasyashoppingcart.entity.Category;
import com.ayasyashoppingcart.request.CategoryRequest;
import com.ayasyashoppingcart.request.DelCategoryRequest;
import com.ayasyashoppingcart.services.CategoryService;

@RestController
@RequestMapping(value = "api/v1/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@PostMapping(value = "/saveCategory")
	public Category saveCategory(@RequestBody CategoryRequest categoryRequest) {
		try {
			Category addCategory = categoryService.addCategory(categoryRequest);
			return addCategory;
		} catch (Exception e) {
			return new Category();
		}

	}

	@PostMapping(value = "/delCategory")
	public Category deleteCategory(@RequestBody DelCategoryRequest req) {
		Category delCategory = categoryService.deleteCategory(req);
		return delCategory;
	}

	@GetMapping(value = "/findAll")
	public List<Category> findAll() {
		return categoryService.findAll();
	}

	@GetMapping(value = "/findbyId/{id}")
	public Category findbyId(@PathVariable Long id) {
		return categoryService.findById(id);
	}

	@PostMapping("/advanceSearch")
	public CategorysearchResponse advanceSearch(@RequestBody CategorySearchRequest categorySearchRequest)
	{
		return categoryService.advanceSearch(categorySearchRequest);
	}

}
