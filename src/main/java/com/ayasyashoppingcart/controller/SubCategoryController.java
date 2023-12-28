package com.ayasyashoppingcart.controller;

import com.ayasyashoppingcart.entity.Category;
import com.ayasyashoppingcart.entity.SubCategory;
import com.ayasyashoppingcart.request.CategoryRequest;
import com.ayasyashoppingcart.request.CategorySearchRequest;
import com.ayasyashoppingcart.request.SubCategoryRequest;
import com.ayasyashoppingcart.request.SubCategorySearchRequest;
import com.ayasyashoppingcart.response.CategorysearchResponse;
import com.ayasyashoppingcart.response.SubCategoryResponse;
import com.ayasyashoppingcart.response.SubCategorySearchResponse;
import com.ayasyashoppingcart.services.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/subcategory")
public class SubCategoryController {
    @Autowired
    private SubCategoryService subCategoryService;

    @PostMapping("savesubcategory")
    public SubCategory saveCategory(@RequestBody SubCategoryRequest subcategoryRequest) {
        try {
            SubCategory addSubCategory = subCategoryService.addSubCategory(subcategoryRequest);
            return addSubCategory;
        } catch (Exception e) {
            return new SubCategory();
        }

    }

    @GetMapping("findAll")
    private List<SubCategoryResponse> findAllSubcategory()
    {
        return subCategoryService.findAll();
    }

    @GetMapping("findbyId/{id}")
    private SubCategoryResponse findById(@PathVariable Long id)
    {
        return subCategoryService.findById(id);
    }

    @GetMapping("findbyname/{name}")
    private SubCategoryResponse findBySubcategoryName(@PathVariable String name)
    {
        return subCategoryService.findBySubcategoryName(name);
    }
     @DeleteMapping("/delete/{id}")
     private SubCategory deletecategoryById(@PathVariable Long id)
     {
         return subCategoryService.deleteSubCategorybyId(id);
     }

  /*  @PostMapping("/advanceSearch")
    public SubCategorySearchResponse advanceSearch(@RequestBody SubCategorySearchRequest subCategorySearchRequest)
    {
        return subCategoryService.advanceSearch(subCategorySearchRequest);
    }
*/

}
