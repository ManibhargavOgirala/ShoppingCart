package com.ayasyashoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayasyashoppingcart.entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Long> {

}
