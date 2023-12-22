package com.ayasyashoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayasyashoppingcart.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
