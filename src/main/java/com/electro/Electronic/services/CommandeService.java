package com.electro.Electronic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electro.Electronic.repositories.CommandeRepository;

@Service
public class CommandeService {
private final CommandeRepository CommandeRep;

@Autowired
public CommandeService(CommandeRepository commandeRep) {
	super();
	CommandeRep = commandeRep;
}

}
