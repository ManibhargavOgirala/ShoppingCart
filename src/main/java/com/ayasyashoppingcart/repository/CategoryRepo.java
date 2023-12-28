package com.ayasyashoppingcart.repository;

import com.ayasyashoppingcart.response.CategoryResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ayasyashoppingcart.entity.Category;

import java.util.Optional;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {

    Optional<Category> findBycategoryNameAndIsActive(String categoryName,String isActive);
// com/ayasyashoppingcart/response/CategoryResponse.java
    @Query(value = "select new com.ayasyashoppingcart.response.CategoryResponse(categoryId,categoryName,createdBy,createdDate,updatedBy,isActive)" +
            " from Category")
    Page<CategoryResponse> findAllCategory(Pageable pageRequest);
    //" AND to_char(cw.createdDate, 'mm/dd/yyyy') like :createdDate "
    @Query(value = "select new com.ayasyashoppingcart.response.CategoryResponse(categoryId,categoryName,createdBy,createdDate,updatedBy,isActive)" +
            " from Category where concat(categoryName) like :category " +
            " AND DATE_FORMAT(createdDate, 'MM/dd/yyyy') like :date ")
    Page<CategoryResponse> findAllCategory(Pageable pageRequest, String category,String date);
}
