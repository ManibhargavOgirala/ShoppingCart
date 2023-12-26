package com.ayasyashoppingcart.response;

import java.util.Date;

public class CategoryResponse {
	private Long categoryId;
	private String categoryName;
	private String createdBy;
	private Date createdDate;
	private String updatedBy;
	private String isActive;

	public Long getCategoryId() {
		return categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public String getIsActive() {
		return isActive;
	}

	@Override
	public String toString() {
		return "CategoryResponse [categoryId=" + categoryId + ", categoryName=" + categoryName + ", createdBy="
				+ createdBy + ", createdDate=" + createdDate + ", updatedBy=" + updatedBy + ", isActive=" + isActive
				+ "]";
	}

}
