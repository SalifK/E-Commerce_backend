 package com.electro.Electronic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.electro.Electronic.models.Commande;

public interface CommandeRepository extends JpaRepository<Commande,Long> {

}
