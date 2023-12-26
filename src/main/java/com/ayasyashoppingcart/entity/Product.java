package com.ayasyashoppingcart.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product extends BaseClass {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Long productId;

	@Column(name = "cat_id")
	private Long catId;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "product_image")
	private byte[] productImage;

	@Column(name = "product_price")
	private Double productPrice;

	@Column(name = "dimension")
	private String dimension;

	@Column(name = "discount_percentage")
	private Long discountPercentage;

	@Column(name = "quantity")
	private Integer quantity;

	public Product() {
	}

	public Product(Long productId, Long catId, String productName, byte[] productImage, Double productPrice,
			String dimension, Long discountPercentage, Integer quantity) {
		this.productId = productId;
		this.catId = catId;
		this.productName = productName;
		this.productImage = productImage;
		this.productPrice = productPrice;
		this.dimension = dimension;
		this.discountPercentage = discountPercentage;
		this.quantity = quantity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Long getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(Long discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public byte[] getProductImage() {
		return productImage;
	}

	public void setProductImage(byte[] productImage) {
		this.productImage = productImage;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public Long getCatId() {
		return catId;
	}

	public void setCatId(Long catId) {
		this.catId = catId;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
}
