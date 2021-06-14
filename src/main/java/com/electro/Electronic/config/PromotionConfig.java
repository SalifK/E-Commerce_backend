package com.electro.Electronic.config;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.electro.Electronic.models.Promotion;
import com.electro.Electronic.repositories.PromotionRepository;

@Configuration
public class PromotionConfig {

	@Bean("Promotion")
	CommandLineRunner CommandeLineRunner(PromotionRepository Repository) {
		return args->{
			Promotion c1= new Promotion(LocalDateTime.parse("2015-02-20T06:30:00")  ,"Promo1",LocalDateTime.parse("2015-02-20T06:30:00"),40);
			
Repository.save(c1);
			
		};
	}
}
