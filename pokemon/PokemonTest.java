package com.codingdojo.pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon a = new Pokemon();
		Pokemon b = new Pokemon("Bob", "Flying", 100);
		System.out.println(Pokemon.getCount());
		a.setName("Tim");
		PokemonInterface.staticTest();
		Pokedex c = new Pokedex();
		System.out.println(c.pokemonInfo(a));
		a.setType("furry");
		System.out.println(c.pokemonInfo(a));
		a.setHealth(100);
		c.attackPokemon(a);
		System.out.println(c.pokemonInfo(a));
		Pokemon d = c.createPokemon("Nate", "whatever", 50);
		System.out.println(d.getHealth());	
		c.attackPokemon(d);
		System.out.println(d.getHealth());
		System.out.println(d.getType());
		System.out.println(d.getName());
		d.setName("Jim");
		System.out.println(d.getName());
		c.createPokemon("Ian", "Bulba", 5);
		System.out.println(c.pokemonInfo(b));
		Pokemon q = c.createPokemon("DDD", "whatver", 25);
		System.out.println(c.pokemonInfo(q));
		System.out.println(Pokemon.getCount());
		
		
		
		
	}

}
