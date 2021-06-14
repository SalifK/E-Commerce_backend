package com.electro.Electronic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.electro.Electronic.services.CategorieService;
import com.electro.Electronic.models.Categorie;
@RestController

@RequestMapping(path="api/categorie")
public class LigneCommandeController {

	private final CategorieService categorieServ;
@Autowired
	public LigneCommandeController(CategorieService categorieServ) {
		super();
		this.categorieServ = categorieServ;
	}
	
}
	