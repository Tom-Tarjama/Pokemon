package com.codingdojo.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {
	
	public Pokemon createPokemon(String name, String type, Integer health) {
		return new Pokemon(name, type, health);
	}
	
	public void attackPokemon(Pokemon target) {
		Integer x = target.getHealth();
		x -=10;
		target.setHealth(x);
	}
}
