package com.ayasyashoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayasyashoppingcart.entity.CartItem;

@Repository
public interface CartItemRepo extends JpaRepository<CartItem, Long> {

}
