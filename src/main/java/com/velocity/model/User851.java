package com.velocity.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="users851")
public class User851 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name ;
	private String email;
	//one user has multiple premiumDetails 
	@OneToMany(mappedBy =  "userid")
	private List<PremiumDetails851> premiumDetailsList;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<PremiumDetails851> getPremiumDetailsList() {
		return premiumDetailsList;
	}
	public void setPremiumDetailsList(List<PremiumDetails851> premiumDetailsList) {
		this.premiumDetailsList = premiumDetailsList;
	}
	@Override
	public String toString() {
		return "User851 [id=" + id + ", name=" + name + ", email=" + email + ", premiumDetailsList="
				+ premiumDetailsList + "]";
	}
	
	
}
	
	