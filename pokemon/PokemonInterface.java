package com.codingdojo.pokemon;

public interface PokemonInterface {

	abstract Pokemon createPokemon(String name, String type, Integer health);
	abstract void attackPokemon(Pokemon target);
	abstract String pokemonInfo(Pokemon pokemon);
	
	default void defaultTest() {
		System.out.println("Hello from the Poke interface");
	}
	
	static void staticTest() {
		System.out.println("Goodbye from the Poke interface");
	}
}
