package com.electro.Electronic.services;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electro.Electronic.models.Categorie;
import com.electro.Electronic.repositories.CategorieRepository;

@Service
public class CategorieService {
private final CategorieRepository categorieRep;

@Autowired
public CategorieService(CategorieRepository categorieRep) {
	super();
	this.categorieRep = categorieRep;
}

public String addCategorie(Categorie categorie) {
	
	Optional<Categorie> categorieOptional= categorieRep.findCategorieByName(categorie.getName());
	if(categorieOptional.isPresent()) {

		System.out.println("OOops erreur");
		return "OOops erreur";
	}
	else {
		System.out.println("New Categorie Added");
		categorieRep.save(categorie);
	return "New Categorie Added";
	}
}

public List<Categorie> getListeDesCategories(){
	
	if(categorieRep.count()>0) {
		return categorieRep.findAll();
	}
	else
		return categorieRep.findAll();
}

//get categorie  by name
public Categorie getCategorieByName(String name) {
	Optional<Categorie> categorieOptional= categorieRep.findCategorieByName(name);
	System.out.println("Welcome service" +name);
	if(categorieOptional.isPresent()) {
		return  categorieRep.findByName(name);
	}else
		return  categorieRep.findByName(name);
}

//get categorie  by id
public Categorie getCategorieById(Long id) {
	//Optional<Categorie> categorieOptional= categorieRep.findCategorieByName(name);
	System.out.println("Welcome service" +id);
	if(categorieRep.existsById(id)) {
		return  categorieRep.findById(id).orElseThrow(null);
	}else
		return  categorieRep.findById(id).orElseThrow(null);
}
	
//update 
@Transactional
public void UpdateCategorie(Long id,String name,String desc) {
	Categorie categorie= categorieRep.findById(id).orElseThrow(()->new IllegalStateException("Categorie invalide"));
	
	if(name!=null && name.length()>0 && !Objects.equals(categorie.getName()  ,name)) {
		if(categorieRep.findCategorieByName(name).isPresent()) {
			System.out.println("name exist deja");
		}else {
		categorie.setName(name);
		System.out.print("Update");}
	
	}
	if(desc!=null && desc.length()>0 && !Objects.equals(categorie.getDescription()  ,desc)) {
		categorie.setDescription(desc);
		System.out.print("Update");
	
	}
	
	
}

//delete
public String deleteCategorie(Long id) {
	if(categorieRep.existsById(id)) {
		 categorieRep.deleteById(id);
		 return"Removed";
	}
	return "Not found";
}



//deactivate

}
