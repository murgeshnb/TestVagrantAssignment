package com.testvagrant.model;

import java.io.Serializable;
import java.util.List;


public class Team implements Serializable {
	private String name;
	private String location;
	private List<Player> player;
	
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
	 * getters and Setters method for updating the Player location
	 * @return
	 */
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	/**
	 * getters and Setters method for updating the Players list
	 * @return
	 */
	public List<Player> getPlayer() {
		return player;
	}
	public void setPlayer(List<Player> player) {
		this.player = player;
	}
	

}
