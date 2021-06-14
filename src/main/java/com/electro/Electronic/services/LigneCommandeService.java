package com.electro.Electronic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electro.Electronic.repositories.LigneCommandeRepository;

@Service
public class LigneCommandeService {
private final LigneCommandeRepository LigneCommadeRep;

@Autowired
public LigneCommandeService(LigneCommandeRepository ligneCommadeRep) {
	super();
	LigneCommadeRep = ligneCommadeRep;
}


	
}
