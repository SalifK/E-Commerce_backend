package com.electro.Electronic.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TVA {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long	 id;
	private int pourcentage;
    @OneToMany(mappedBy="TVA")
	private Collection<Product> Product;
    
	public TVA(long id, int pourcentage) {
		super();
		this.id = id;
		this.pourcentage = pourcentage;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getPourcentage() {
		return pourcentage;
	}
	public void setPourcentage(int pourcentage) {
		this.pourcentage = pourcentage;
	}
	@Override
	public String toString() {
		return "TVA [id=" + id + ", pourcentage=" + pourcentage + "]";
	}
	
	

}
