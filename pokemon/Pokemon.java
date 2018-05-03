package com.codingdojo.pokemon;

public class Pokemon {
	
	//name
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//health
	private Integer health;
	
	public Integer getHealth() {
		return health;
	}
	
	public void setHealth(Integer health) {
		this.health = health;
	}
	
	//type
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	//count
	private static Integer count =0;

	public static Integer getCount() {
		return count;
	}
	
	//constructors
	public Pokemon(String name, String type, Integer health) {
		this.name = name;
		this.type = type;
		this.health = health;
		count++;
	}
	
	public Pokemon() {
		count++;
	};
	
	
}
