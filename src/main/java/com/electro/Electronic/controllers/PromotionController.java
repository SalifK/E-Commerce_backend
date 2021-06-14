package com.electro.Electronic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electro.Electronic.services.PromotionService;

@RestController
@RequestMapping(path="api/promotion")
public class PromotionController {

	private final PromotionService promotionServ;
	@Autowired
	public PromotionController(PromotionService promotionServ) {
		super();
		this.promotionServ = promotionServ;
	}
	
}
