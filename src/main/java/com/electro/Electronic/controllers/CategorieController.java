package com.electro.Electronic.controllers;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

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

@RequestMapping(path="api/v1/categorie")
public class CategorieController {

	private final CategorieService categorieServ;
	
	@Autowired
	public CategorieController(CategorieService categorieServ) {
		super();
		this.categorieServ = categorieServ;
	}
	
	//on recupe la liste des cateogories
	@GetMapping
	public List<Categorie> getListeDesCategorie() {
		
		return categorieServ.getListeDesCategories();
	}
	
	@GetMapping(path= "{categorieName}")
	public Categorie getCategorieByName(@PathVariable("categorieName" ) String name) {
		System.out.println(name);
		return categorieServ.getCategorieByName(name);
	}
	
	
	// ajout new categorie
	@PostMapping
	public String AddCategorie(@RequestBody Categorie categorie) {
		return categorieServ.addCategorie(categorie);
		
	}
	
	// update Categorie
	@PutMapping(path= "{categorieId}")
	public String UpdateCategorie(@PathVariable("categorieId" ) Long id,
			@RequestParam(required=false)  String name,
			@RequestParam(required=false)  String desc
			) {
		
		categorieServ.UpdateCategorie(id, name, desc);
		return"done";
	}
	
	@DeleteMapping(path= "{categorieId}")
	public String deleteCategorieByName(@PathVariable("categorieId") Long id){
		System.out.println(id);
		return categorieServ.deleteCategorie(id);
	}
	
	/*@PutMapping(path="{studentId}")
	public String UpdateStudent(@PathVariable("studentId") Long id,
			@RequestParam(required=false)  String name,
			 @RequestParam(required=false)  String email) {
		return "done";
	//	studentService.UpdateStudent(id,name,email);
	}	*/
	
}
