package com.electro.Electronic.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;
@Entity
public class Promotion {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String name;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private int pourcentage;
 
    @OneToMany(mappedBy="Promotion")
    private Collection<Product> Product;

	public Promotion() {
		super();
	}

	

	
	
	public Promotion(LocalDateTime dateDebut, String name, LocalDateTime dateFin, int pourcentage) {
		super();
		this.name = name;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.pourcentage = pourcentage;
		
	}
	public Promotion(LocalDateTime dateDebut, String name, LocalDateTime dateFin, int pourcentage, Collection<Product> product) {
		super();
		this.name = name;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.pourcentage = pourcentage;
		this.Product = product;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDateTime getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDateTime dateDebut) {
		this.dateDebut = dateDebut;
	}

	public LocalDateTime getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDateTime dateFin) {
		this.dateFin = dateFin;
	}

	public int getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(int pourcentage) {
		this.pourcentage = pourcentage;
	}

	public Collection<Product> getProduct() {
		return Product;
	}

	public void setProduct(Collection<Product> product) {
		this.Product = product;
	}


	@Override
	public String toString() {
		return "Promotion [id=" + id + ", name=" + name + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin
				+ ", pourcentage=" + pourcentage + ", product=" + Product + "]";
	}

	
    
    
}
