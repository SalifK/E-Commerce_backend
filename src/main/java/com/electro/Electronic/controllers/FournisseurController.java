package com.electro.Electronic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.electro.Electronic.services.FournisseurService;

@RestController
public class FournisseurController {

	private final FournisseurService fournisseurServ;
	@Autowired
	public FournisseurController(FournisseurService fournisseurServ) {
		super();
		this.fournisseurServ = fournisseurServ;
	}
	
	
	
	
}
