package com.electro.Electronic.models;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

//@Entity
public class Fournisseur {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nom;
	private String email;
	private Date dateContrat, dateFinContrat=null;
	private String Tel;
	private String description;
	private String localisation;
	
//	@OneToMany(mappedBy="fournisseur")
//	private Collection<Product> Product;
	
	
	
}
