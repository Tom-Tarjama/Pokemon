package com.codingdojo.pokemon;

public class Pokedex extends AbstractPokemon {

	public String pokemonInfo(Pokemon pokemon) {
		return "Pokemon name: "+pokemon.getName()+"; Pokemon type: "+pokemon.getType()+"; Pokemon health: "+pokemon.getHealth();
	}
}
