package com.electro.Electronic.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.electro.Electronic.models.TVA;
import com.electro.Electronic.repositories.TVARepository;


	@Configuration
	public class TVAConfig {

		@Bean("TVA")
		CommandLineRunner CommandeLineRunner(TVARepository Repository) {
			return args->{
				TVA c1= new TVA(15);
				
	Repository.save(c1);
				
			};
		}
}
