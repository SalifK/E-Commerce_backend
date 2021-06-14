package com.electro.Electronic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electro.Electronic.repositories.PromotionRepository;

@Service
public class PromotionService {
private final PromotionRepository promotionRep;

@Autowired
public PromotionService(PromotionRepository promotionRep) {
	super();
	this.promotionRep = promotionRep;
}

}
