package com.ayasyashoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayasyashoppingcart.entity.ThirdCategory;

@Repository
public interface ThirdCategoryRepo extends JpaRepository<ThirdCategory, Long>{

}
