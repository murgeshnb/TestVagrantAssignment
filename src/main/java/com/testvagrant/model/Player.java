package com.testvagrant.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Player implements Serializable {
	private String name; 
	private String country;
	 private String role;
	 @JsonAlias("price-in-crores")
	 private String priceInCrores;
	 
	/**
	 * getters and Setters method for updating the Player name
	 * @return
	 */
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * getters and Setters method for updating the Player Country
	 * @return
	 */
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	/**
	 * getters and Setters method for updating the Player Role
	 * @return
	 */
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	/**
	 * getters and Setters method for updating the Player priceInCrores
	 * @return
	 */
	public String getPriceInCrores() {
		return priceInCrores;
	}
	public void setPriceInCrores(String priceInCrores) {
		this.priceInCrores = priceInCrores;
	}
	
	
	/**
	 * This overridden toString() will return updated players name, Country, role and PriceInCrores.
	 */
	@Override
	public String toString() {
		return "Player [name=" + name + ", country=" + country + ", role=" + role + ", priceInCrores=" + priceInCrores
				+ "]";
	}
}
