package com.ayasyashoppingcart.services.impl;

import com.ayasyashoppingcart.entity.Category;
import com.ayasyashoppingcart.entity.SubCategory;
import com.ayasyashoppingcart.repository.CategoryRepo;
import com.ayasyashoppingcart.repository.SubCategoryRepo;
import com.ayasyashoppingcart.request.SubCategoryRequest;
import com.ayasyashoppingcart.response.SubCategoryResponse;
import com.ayasyashoppingcart.services.SubCategoryService;
import com.ayasyashoppingcart.utils.Constants;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SubcategoryServiceImpl implements SubCategoryService {
    @Autowired
    private SubCategoryRepo subCategoryRepo;
    @Autowired
    private CategoryRepo categoryRepo;


    @Override
    public SubCategory addSubCategory(SubCategoryRequest subcategoryRequest) {

        SubCategory subCategory = null;

        Optional<Category> categoryNameOptional = categoryRepo.findBycategoryNameAndIsActive(subcategoryRequest.getCategoryName(), Constants.ACTIVE);
        if(categoryNameOptional.isEmpty())
        {
            return null;
        }


        if (subcategoryRequest != null) {
            Optional<SubCategory> findBySubCatId = subCategoryRepo.findById(subcategoryRequest.getSubCategoryId());
            if (findBySubCatId.isPresent()) {
                subCategory = findBySubCatId.get();
                subCategory.setUpdatedBy("ADMIN");
            } else {
                subCategory = new SubCategory();
                subCategory.setCreatedBy("ADMIN");
            }
            subCategory.setIsActive("true");
            subCategory.setCatId(categoryNameOptional.get().getCategoryId());
            subCategory.setSubCategoryName(subcategoryRequest.getSubCategoryName());



            subCategory.setIsActive("true");
        }
        return subCategoryRepo.save(subCategory);
    }

    @Override
    public List<SubCategoryResponse> findAll() {

        return subCategoryRepo.findAllSubCategory();
    }

    @Override
    public SubCategoryResponse findById(Long id) {

        return subCategoryRepo.findbySubCategoryId(id);
    }

    @Override
    public SubCategoryResponse findBySubcategoryName(String name) {
        if(name.isEmpty())
            return null;


        return subCategoryRepo.findbySubCategoryName(name);
    }

    @Override
    public SubCategory deleteSubCategorybyId(Long id) {
        Optional<SubCategory> subCategoryOptional = subCategoryRepo.findById(id);

        if(subCategoryOptional.isPresent())
        {
            SubCategory subCategory = subCategoryOptional.get();
            subCategory.setIsActive("false");
            return subCategoryRepo.save(subCategory);

        }

        return null;
    }

}

