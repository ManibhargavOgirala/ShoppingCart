package com.ayasyashoppingcart.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "ordersList")
public class OrdersList extends BaseClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private Long orderId;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "product_id")
	private Long productId;

	@Column(name = "quantity")
	private Integer quantity;

	@Column(name = "delivery_date")
	private Date deliveryDate;

	public OrdersList(Long orderId, Long userId, Long productId, Integer quantity, Date deliveryDate) {
		this.orderId = orderId;
		this.userId = userId;
		this.productId = productId;
		this.quantity = quantity;
		this.deliveryDate = deliveryDate;
	}

	public OrdersList() {
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	@Override
	public String toString() {
		return "OrdersList{" + "orderId=" + orderId + ", userId=" + userId + ", productId=" + productId + ", quantity="
				+ quantity + ", deliveryDate=" + deliveryDate + '}';
	}
}
