package com.ayasyashoppingcart.services;

import com.ayasyashoppingcart.entity.SubCategory;
import com.ayasyashoppingcart.request.SubCategoryRequest;
import com.ayasyashoppingcart.request.SubCategorySearchRequest;
import com.ayasyashoppingcart.response.SubCategoryResponse;
import com.ayasyashoppingcart.response.SubCategorySearchResponse;

import java.util.List;

public interface SubCategoryService {
    SubCategory addSubCategory(SubCategoryRequest subcategoryRequest);

    List<SubCategoryResponse> findAll();

    SubCategoryResponse findById(Long id);

    SubCategoryResponse findBySubcategoryName(String name);

    SubCategory deleteSubCategorybyId(Long id);

    SubCategorySearchResponse advanceSearch(SubCategorySearchRequest subCategorySearchRequest);
}
