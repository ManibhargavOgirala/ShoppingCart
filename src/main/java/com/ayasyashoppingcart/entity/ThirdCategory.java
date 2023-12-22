package com.ayasyashoppingcart.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "third_category")
public class ThirdCategory extends BaseClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "thirdcategory_id")
	private Long thirdCategoryId;

	@Column(name = "subcat_id")
	private Long subcatId;

	@Column(name = "thirdcategory_name")
	private String thirdCategoryName;

	public ThirdCategory(Long thirdCategoryId, Long subcatId, String thirdCategoryName) {
		this.thirdCategoryId = thirdCategoryId;
		this.subcatId = subcatId;
		this.thirdCategoryName = thirdCategoryName;
	}

	public ThirdCategory() {

	}

	public Long getThirdCategoryId() {
		return thirdCategoryId;
	}

	public void setThirdCategoryId(Long thirdCategoryId) {
		this.thirdCategoryId = thirdCategoryId;
	}

	public Long getSubcatId() {
		return subcatId;
	}

	public void setSubcatId(Long subcatId) {
		this.subcatId = subcatId;
	}

	public String getThirdCategoryName() {
		return thirdCategoryName;
	}

	public void setThirdCategoryName(String thirdCategoryName) {
		this.thirdCategoryName = thirdCategoryName;
	}

}
