package com.ayasyashoppingcart.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "sub_category")
public class SubCategory extends BaseClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "subcategory_id")
	private Long subCategoryId;

	@Column(name = "cat_id")
	private Long catId;

	@Column(name = "subcategory_name")
	private String subCategoryName;

	public SubCategory(Long subCategoryId, Long catId, String subCategoryName) {
		this.subCategoryId = subCategoryId;
		this.catId = catId;
		this.subCategoryName = subCategoryName;
	}

	public SubCategory() {
	}

	public Long getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(Long subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public Long getCatId() {
		return catId;
	}

	public void setCatId(Long catId) {
		this.catId = catId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	@Override
	public String toString() {
		return "SubCategory [subCategoryId=" + subCategoryId + ", catId=" + catId + ", subCategoryName="
				+ subCategoryName + "]";
	}
}
