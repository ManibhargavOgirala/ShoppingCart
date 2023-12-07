package com.ayasyashoppingcart.entity;

import jakarta.persistence.*;

@Entity
@Table(name="sub_category")
public class SubCategory  extends BaseClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subCategory_id")
    private Long subCategoryId;

    @Column(name = "cart_id")
    private Long cartId;

    @Column(name="subcategory_name")
    private String subCategoryName;

    public SubCategory(Long subCategoryId, Long cartId, String subCategoryName) {
        this.subCategoryId = subCategoryId;
        this.cartId = cartId;
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

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    @Override
    public String toString() {
        return "SubCategory{" +
                "subCategoryId=" + subCategoryId +
                ", cartId=" + cartId +
                ", subCategoryName='" + subCategoryName + '\'' +
                '}';
    }
}
