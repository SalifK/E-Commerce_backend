package com.electro.Electronic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electro.Electronic.repositories.ProductRepository;

@Service
public class ProductService {
private final ProductRepository productRep;

@Autowired
public ProductService(ProductRepository productRep) {
	super();
	this.productRep = productRep;
}

}
