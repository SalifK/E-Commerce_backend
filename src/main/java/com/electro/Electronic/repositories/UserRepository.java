package com.electro.Electronic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.electro.Electronic.models.User;

public interface UserRepository extends JpaRepository<User,Long> {

}


