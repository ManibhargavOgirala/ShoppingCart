package com.ayasyashoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayasyashoppingcart.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

}
