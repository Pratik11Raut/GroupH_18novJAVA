package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="settlement")
public class Settlement {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;

private int settlementamount ;

private String period ;

private String username;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getSettlementamount() {
	return settlementamount;
}

public void setSettlementamount(int settlementamount) {
	this.settlementamount = settlementamount;
}

public String getPeriod() {
	return period;
}

public void setPeriod(String period) {
	this.period = period;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

@Override
public String toString() {
	return "Settlement [id=" + id + ", settlementamount=" + settlementamount + ", period=" + period + ", username="
			+ username + "]";
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
