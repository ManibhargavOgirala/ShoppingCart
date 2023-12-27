package com.ayasyashoppingcart.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "shop_by_brand")
public class Brand extends BaseClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "brand_id")
	private Long brandId;

	@Column(name = "subcat_id")
	private Long subcatId;

	@Column(name = "brand_name")
	private String brandName;

	public Brand(Long brandId, Long subcatId, String brandName) {
		this.brandId = brandId;
		this.subcatId = subcatId;
		this.brandName = brandName;
	}

	public Brand() {

	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public Long getSubcatId() {
		return subcatId;
	}

	public void setSubcatId(Long subcatId) {
		this.subcatId = subcatId;
	}

	public String getThirdCategoryName() {
		return brandName;
	}

	public void setBrandNameName(String brandName) {
		this.brandName = brandName;
	}

}
