package com.electro.Electronic.models;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Commande {
	 	@Id
	 	@GeneratedValue(strategy=GenerationType.AUTO)
	    private long id;
	 	private float montantTotal=0;
	 	
	 	@Enumerated(EnumType.ORDINAL)
	 	private EtatCommande etatCommande;
		
	 	

		@ManyToOne 
	 	@JoinColumn(name="id_client", nullable=false) 
	 	private Client Client;
	 	
//	 	@ManyToOne
//		@JoinColumn(name="id_commande", nullable=false) 
//	 	private Product product; 

	 	@OneToMany(mappedBy="Commande") 
	 	private Collection<LigneCommande> LigneCommande ;
	 	
		public Commande(float montantTotal, Client client) {
			super();
			this.montantTotal = montantTotal;
			this.Client = client;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public float getMontantTotal() {
			return montantTotal;
		}

		public void setMontantTotal(float montantTotal) {
			this.montantTotal = montantTotal;
		}

		public Client getClient() {
			return Client;
		}

		public void setClient(Client client) {
			this.Client = client;
		}

	
	 	
		@Override
		public String toString() {
			return "Commande [id=" + id + ", montantTotal=" + montantTotal + ", etatCommande=" + etatCommande
					+ ", client=" + Client + ", LigneCommande=" + LigneCommande + "]";
		}

}
