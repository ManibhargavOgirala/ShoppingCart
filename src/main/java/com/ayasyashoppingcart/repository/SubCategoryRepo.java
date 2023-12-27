package com.ayasyashoppingcart.repository;

import com.ayasyashoppingcart.response.SubCategoryResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ayasyashoppingcart.entity.SubCategory;

import java.util.List;

@Repository
public interface SubCategoryRepo extends JpaRepository<SubCategory, Long> {

   // com/ayasyashoppingcart/response/SubCategoryResponse.java
    @Query(value = "select new com.ayasyashoppingcart.response.SubCategoryResponse(sc.subCategoryId,sc.subCategoryName,cat.categoryName,sc.isActive)" +
            "from SubCategory sc inner join Category cat on cat.categoryId=sc.catId where sc.isActive='true'")
    List<SubCategoryResponse> findAllSubCategory();
    @Query(value = "select new com.ayasyashoppingcart.response.SubCategoryResponse(sc.subCategoryId,sc.subCategoryName,cat.categoryName,sc.isActive)" +
            "from SubCategory sc inner join Category cat on cat.categoryId=sc.catId where sc.isActive='true' and sc.subCategoryId=:id")
    SubCategoryResponse findbySubCategoryId(Long id);
 @Query(value = "select new com.ayasyashoppingcart.response.SubCategoryResponse(sc.subCategoryId,sc.subCategoryName,cat.categoryName,sc.isActive)" +
         "from SubCategory sc inner join Category cat on cat.categoryId=sc.catId where sc.isActive='true' and sc.subCategoryName=:name")
    SubCategoryResponse findbySubCategoryName(String name);
}
