package com.electro.Electronic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electro.Electronic.repositories.ClientRepository;

@Service
public class ClientService  {
private final ClientRepository ClientRep;

@Autowired
public ClientService(ClientRepository clientRep) {
	super();
	ClientRep = clientRep;
}

}
