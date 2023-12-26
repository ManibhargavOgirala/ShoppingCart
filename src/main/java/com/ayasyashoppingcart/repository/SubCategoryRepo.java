package com.ayasyashoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayasyashoppingcart.entity.SubCategory;

@Repository
public interface SubCategoryRepo extends JpaRepository<SubCategory, Long> {

}
