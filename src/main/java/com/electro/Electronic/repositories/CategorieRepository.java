package com.electro.Electronic.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.electro.Electronic.models.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie,Long> {

//	Optional<Categorie> findCategorieByCode(String code);

	Optional<Categorie> findCategorieByName(String name);
	public Categorie findByName(String name);
}
