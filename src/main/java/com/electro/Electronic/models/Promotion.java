package com.electro.Electronic.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.Collection;
import java.util.Date;
@Entity
public class Promotion {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String name;
    private Date dateDebut;
    private Date dateFin;
    private int pourcentage;
 
    @OneToMany(mappedBy="Promotion")
    private Collection<Product> Product;

	public Promotion(Date dateDebut, String name, Date dateFin, int pourcentage, Collection<Product> product) {
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

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
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
