package com.electro.Electronic.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class LigneCommande {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private int quantity;
	//private String color;
	//private float price;
	//private String marque;
	
	//@OneToMany(mappedBy="Commande") // a revoir 
	@ManyToOne
	@JoinColumn(name="id_commande", nullable=false) 
	private Commande Commande;
	
	/*
	 * @OneToMany(mappedBy="Commande") private Product product;
	 */
	
	@ManyToOne
	@JoinColumn(name="id_product", nullable=false) 
	private Product Product;

	public LigneCommande() {
		super();
	}
	
	
}
