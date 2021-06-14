package com.electro.Electronic.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.electro.Electronic.models.Categorie;
import com.electro.Electronic.repositories.CategorieRepository;

@Configuration
public class CategorieConfig {

	@Bean("Categorie")
	CommandLineRunner CommandeLineRunner(CategorieRepository Repository) {
		return args->{
			Categorie c1= new Categorie("TestName","Bla bla bla");
			
Repository.save(c1);
			
		};
	}
}
