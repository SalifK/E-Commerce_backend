package com.electro.Electronic.models;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

//import com.example.demo.entity.User;
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    @Column(unique=true)
    private String reference;
    private String name;
    private String marque;
    private String description;
    private String image;
    private String color; 
    private float price;
    private int quantity;
    
   // private User addBy;
    //private String addBy; //code employer
    @ManyToOne
    @JoinColumn(name="id_categorie",nullable=false)
    private Categorie Categorie;

    @ManyToOne
    @JoinColumn(name="id_promotion",nullable=true)
    private Promotion Promotion;
    
    @OneToMany(mappedBy="Product")
    private Collection<LigneCommande> LigneCommande;
    
    @ManyToOne
    @JoinColumn(name="TVA",nullable=false)
    private TVA TVA;/// a revoir 


	public Product(String reference, String name, String marque, String description, String image, String color,
			float price, int quantity, Categorie categorie, Promotion promotion, TVA tva) {
		super();
		this.reference = reference;
		this.name = name;
		this.marque = marque;
		this.description = description;
		this.image = image;
		this.color = color;
		this.price = price;
		this.quantity = quantity;
		this.Categorie = categorie;
		this.Promotion = promotion;
		this.TVA = tva;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getReference() {
		return reference;
	}


	public void setReference(String reference) {
		this.reference = reference;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMarque() {
		return marque;
	}


	public void setMarque(String marque) {
		this.marque = marque;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Categorie getCategorie() {
		return Categorie;
	}


	public void setCategorie(Categorie categorie) {
		this.Categorie = categorie;
	}


	public Promotion getPromotion() {
		return Promotion;
	}


	public void setPromotion(Promotion promotion) {
		this.Promotion = promotion;
	}


	public TVA getTva() {
		return TVA;
	}


	public void setTva(TVA tva) {
		this.TVA = tva;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", reference=" + reference + ", name=" + name + ", marque=" + marque
				+ ", description=" + description + ", image=" + image + ", color=" + color + ", price=" + price
				+ ", quantity=" + quantity + ", categorie=" + Categorie + ", promotion=" + Promotion + ", tva=" + TVA
				+ "]";
	}
    
    
    
   
	

}
