package com.electro.Electronic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.electro.Electronic.services.CommentService;

@RestController
public class CommentController {
private final CommentService CommentServ;

@Autowired
public CommentController(CommentService commentServ) {
	super();
	CommentServ = commentServ;
}
}
