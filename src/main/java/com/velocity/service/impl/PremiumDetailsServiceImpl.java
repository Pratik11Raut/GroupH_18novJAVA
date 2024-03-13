package com.velocity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.PremiumDetails851;
import com.velocity.repository.PremiumDetailsRepository851;
import com.velocity.service.PremiumDetailsService;
@Service
public class PremiumDetailsServiceImpl implements PremiumDetailsService {
    // inject the repository
	@Autowired
	private PremiumDetailsRepository851 premiumDetailsRepository851;

	@Override
	public PremiumDetails851 savePremiumDetails(PremiumDetails851 premiumDetails851) {
		// TODO Auto-generated method stub
		 return premiumDetailsRepository851.save(premiumDetails851);
		
	}
	
	}


