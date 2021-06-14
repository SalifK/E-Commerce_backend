package com.electro.Electronic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electro.Electronic.repositories.EmployerRepository;

@Service
public class EmployerService {
private final EmployerRepository employerRep;

@Autowired
public EmployerService(EmployerRepository employerRep) {
	super();
	this.employerRep = employerRep;
}

}
