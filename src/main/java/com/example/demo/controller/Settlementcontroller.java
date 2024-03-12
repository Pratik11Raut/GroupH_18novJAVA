package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Settlementservice;

@RestController
public class Settlementcontroller {
@Autowired
private Settlementservice settlementservice;

@DeleteMapping("/deletesettlementdetail")
public void deletesettlementdetail() {
	
	settlementservice.deletesettlementdetail();
}
	
	
	
	
	
	
	
	
	
	
	
	
}
