package com.electro.Electronic.models;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

//import com.example.demo.entity.Employer;
@Entity
public class Categorie {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	
	//@Column(unique=true)
	//private String code;  
	@Column(unique=true)
	private String name;//le nom du categorie est unique
	private String description;
//	private String libelle;
	//@Column(columnDefinition = "timestamp default CURRENT_TIMESTAMP")
	//private Date dateAjout;
	private Boolean Active=true;  // en cas ou cette categorie n'est plus disponible nous pouvons le desactiver

	private String image ;
	private String imageBanner;
	 
	 @OneToMany(mappedBy="Categorie") 
	 private Collection<Product> Product;
	 
	 public Categorie() {
			super();
		}

	 public Categorie(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	 }

	 public Categorie(String name, String description, Boolean active, String image, String imageBanner) {
		super();
		this.name = name;
		this.description = description;
		//this.dateAjout = dateAjout;
		Active = active;
		this.image = image;
		this.imageBanner = imageBanner;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getActive() {
		return Active;
	}

	public void setActive(Boolean active) {
		Active = active;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	public String getImageBanner() {
		return imageBanner;
	}

	public void setImageBanner(String imageBanner) {
		this.imageBanner = imageBanner;
	}

	@Override
	public String toString() {
		return "Categorie [id=" + id + ", name=" + name + ", description=" + description + ", Active=" + Active
				+ ", product=" + Product + ", image=" + image + ", imageBanner=" + imageBanner + "]";
	}

	 
	
   
	    
}
