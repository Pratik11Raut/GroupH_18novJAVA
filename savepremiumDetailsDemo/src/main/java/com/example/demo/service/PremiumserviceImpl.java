package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Premium;
import com.example.demo.repository.Premiumrepository;

@Service
public class PremiumserviceImpl implements Premiumservice{
	
	@Autowired
	private Premiumrepository premiumrepo;

	@Override
	public Premium savepremiumdetails(Premium premium) {
	Premium premium11	=premiumrepo.save(premium);
			return premium11;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
