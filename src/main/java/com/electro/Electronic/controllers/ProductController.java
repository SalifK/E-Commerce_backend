package com.electro.Electronic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electro.Electronic.services.ProductService;

@RestController
@RequestMapping(path="api/product")
public class ProductController {
	
	private final ProductService productServ;
	@Autowired
	public ProductController(ProductService productServ) {
		super();
		this.productServ = productServ;
	}
	
	
	
	
}
