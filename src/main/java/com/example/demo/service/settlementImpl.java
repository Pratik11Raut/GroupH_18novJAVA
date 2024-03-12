package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Settlement;
import com.example.demo.repository.SettlementRepository;
@Service
public class settlementImpl implements Settlementservice {
	
	@Autowired
	private SettlementRepository settlementrepo;
	

	

	@Override
	public void deletesettlementdetail() {
		     settlementrepo.deleteAll();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
