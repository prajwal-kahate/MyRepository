package com.DemoCollection;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Player {
	
	private int PlayerId;
	private String name;
	private String role;
	private String price;
	
	
	public Player(int playerId, String name, String role, String price) {
		PlayerId = playerId;
		this.name = name;
		this.role = role;
		this.price = price;
	}


	
	@Override
	public String toString() {
		return "PlayerId=" + PlayerId + ", name=" + name + ", role=" + role + ", price=" + price;
	}



	public int getPlayerId() {
		return PlayerId;
	}


	public void setPlayerId(int playerId) {
		PlayerId = playerId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}
	
	
	

}
