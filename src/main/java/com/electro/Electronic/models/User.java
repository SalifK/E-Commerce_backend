package com.electro.Electronic.models;

import javax.persistence.*;



import java.util.Collection;
import java.util.List;

@Entity
@Table(name="utilisateur")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    @Column(unique=true)
    private String username;
    private String password;
    @Enumerated(EnumType.ORDINAL)
    private Role role;
    private String email;
    
    @OneToOne(mappedBy="User")
 	private Client Client;
    
    @OneToOne(mappedBy="User")
 	private Employer Employer;
    
    public User() {
		super();
	}


	public User(String username, String password, String email, Role role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        
    }


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role + ", email="
				+ email + "]";
	}
    
    
    
 
    }


 
