package com.ayasyashoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayasyashoppingcart.entity.Category;
import com.ayasyashoppingcart.request.CategoryRequest;
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
	public Category deleteCategory(@RequestBody CategoryRequest categoryRequest) {
		try {
			Category delCategory = categoryService.deleteCategory(categoryRequest);
			return delCategory;
		} catch (Exception e) {
			return new Category();
		}

	}

}
