package com.electro.Electronic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electro.Electronic.repositories.TVARepository;

@Service
public class TVAService {
private final TVARepository TVARep;

@Autowired
public TVAService(TVARepository tVARep) {
	super();
	TVARep = tVARep;
}


}
