package com.electro.Electronic.models;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String fName;
	private String lName;
	@Column(unique=true)
	private int numTel;
	private int codePostal;
	private String adressePhysique;
	private String ville;
	private String image;
	
	@OneToOne
	private User User;
	//private Collection<User> user;
	
	@OneToMany(mappedBy="Client") 
 	private Collection<Commande> Commande ;
	
	@OneToMany(mappedBy="Client") 
 	private Collection<Comment> Comment ;
	
	public Client(long id, String fName, String lName, int numTel, int codePostal, String adressePhysique,
			String ville, String image) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.numTel = numTel;
		this.codePostal = codePostal;
		this.adressePhysique = adressePhysique;
		this.ville = ville;
		this.image = image;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getNumTel() {
		return numTel;
	}

	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getAdressePhysique() {
		return adressePhysique;
	}

	public void setAdressePhysique(String adressePhysique) {
		this.adressePhysique = adressePhysique;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", fName=" + fName + ", lName=" + lName + ", numTel=" + numTel + ", codePostal="
				+ codePostal + ", adressePhysique=" + adressePhysique + ", ville=" + ville + ", image=" + image + "]";
	}
	
	
	
}
