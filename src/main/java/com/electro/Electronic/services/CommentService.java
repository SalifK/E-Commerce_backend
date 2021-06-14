package com.electro.Electronic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electro.Electronic.repositories.CommentaireRepository;

@Service
public class CommentService {
private final CommentaireRepository CommentRep;

@Autowired
public CommentService(CommentaireRepository commentRep) {
	super();
	CommentRep = commentRep;
}

}
