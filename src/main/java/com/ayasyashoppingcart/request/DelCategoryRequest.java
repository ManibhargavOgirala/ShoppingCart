package com.ayasyashoppingcart.request;

public class DelCategoryRequest {
	private Long categoryId;

	public DelCategoryRequest(Long categoryId) {
		this.categoryId = categoryId;
	}

	public DelCategoryRequest() {

	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

}
