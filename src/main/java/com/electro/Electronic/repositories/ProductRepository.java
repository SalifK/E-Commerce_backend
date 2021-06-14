package com.electro.Electronic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.electro.Electronic.models.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
