package com.electro.Electronic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.electro.Electronic.services.ClientService;

@RestController
public class ClientController {
private final ClientService ClientServ;

@Autowired
public ClientController(ClientService clientServ) {
	super();
	ClientServ = clientServ;
}

}
