package com.ayasyashoppingcart.entity;

import jakarta.persistence.*;

@Entity
@Table(name="master_table")
public class MasterClass    extends BaseClass{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mst_id")
    private Long id;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "category_name")
    private String categoryName;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "price")
    private Double price;

    public MasterClass(Long id, String productName, String categoryName, Integer quantity, Double price) {
        this.id = id;
        this.productName = productName;
        this.categoryName = categoryName;
        this.quantity = quantity;
        this.price = price;
    }

    public MasterClass() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MasterClass{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
