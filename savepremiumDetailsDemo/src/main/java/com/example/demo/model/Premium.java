package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="premium")
public class Premium {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
private int premiumamount;
	
	private String username;
	
	private String coverage;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPremiumamount() {
		return premiumamount;
	}

	public void setPremiumamount(int premiumamount) {
		this.premiumamount = premiumamount;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCoverage() {
		return coverage;
	}

	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}

	@Override
	public String toString() {
		return "Premium [id=" + id + ", premiumamount=" + premiumamount + ", username=" + username + ", coverage="
				+ coverage + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
