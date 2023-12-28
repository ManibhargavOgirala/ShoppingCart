package com.ayasyashoppingcart.response;

public class SubCategoryResponse {
    private Long subCategoryId;
    private String subCategoryName;

    private String categoryName;

    private String isActive;

    public SubCategoryResponse(Long subCategoryId, String subCategoryName, String categoryName,String isActive) {
        this.subCategoryId = subCategoryId;
        this.subCategoryName = subCategoryName;
        this.categoryName = categoryName;
        this.isActive=isActive;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public Long getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(Long subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
