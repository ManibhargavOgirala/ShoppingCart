package com.ayasyashoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayasyashoppingcart.entity.OrdersList;

@Repository
public interface OrdersListRepo extends JpaRepository<OrdersList, Long> {

}
