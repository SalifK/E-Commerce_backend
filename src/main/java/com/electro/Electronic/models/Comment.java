package com.electro.Electronic.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Comment {
    //user name
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String email;
	private String description;
    private Date date;
    
    @ManyToOne
    @JoinColumn(name="id_client",nullable=false)
    private Client Client;

	public Comment() {
		super();
	}

	public Comment(String email, String description) {
		super();
		this.email = email;
		this.description = description;
	}
    
    
}
