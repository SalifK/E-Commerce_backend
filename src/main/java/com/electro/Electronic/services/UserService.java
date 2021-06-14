
package com.electro.Electronic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electro.Electronic.repositories.UserRepository;

@Service
public class UserService {
private final UserRepository userRep;

@Autowired
public UserService(UserRepository userRep) {
	super();
	this.userRep = userRep;
}


	
	
	
}

