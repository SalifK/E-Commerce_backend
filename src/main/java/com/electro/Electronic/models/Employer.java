package com.electro.Electronic.models;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Employer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String fName;
	private String lName;
	@Column(unique=true)
	private int numTel;
	private int codePostal;
	private String ville;
	private String adressePhysique;
	private String image;
	
	@OneToOne
	private User User;
	//private Collection<User> user;
	
	
	public Employer(long id, String fName, String lName, int numTel, int codePostal, String ville,
			String adressePhysique, String image, Collection<User> user) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.numTel = numTel;
		this.codePostal = codePostal;
		this.ville = ville;
		this.adressePhysique = adressePhysique;
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
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getAdressePhysique() {
		return adressePhysique;
	}
	public void setAdressePhysique(String adressePhysique) {
		this.adressePhysique = adressePhysique;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public User getUser() {
		return User;
	}
	public void setUser(User user) {
		this.User = user;
	}
	@Override
	public String toString() {
		return "Employer [id=" + id + ", fName=" + fName + ", lName=" + lName + ", numTel=" + numTel + ", codePostal="
				+ codePostal + ", ville=" + ville + ", adressePhysique=" + adressePhysique + ", image=" + image
				+ ", user=" + User + "]";
	}
	
	
}
