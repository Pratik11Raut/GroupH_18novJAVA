package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Premium;
import com.example.demo.service.Premiumservice;

@RestController
public class Premiumcontroller {

@Autowired	
private Premiumservice premiumservice;	
	
	@PostMapping("/savepremiumdetails")
public Premium savepremiumdetails(@RequestBody Premium premium) {
	
	               
Premium premium12=premiumservice.savepremiumdetails(premium);
	
	
	return premium12;
		
}}
