package com.electro.Electronic.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ElectController {
    @GetMapping(value = "/")
    public String index(){
        return "hello";
    }
}
