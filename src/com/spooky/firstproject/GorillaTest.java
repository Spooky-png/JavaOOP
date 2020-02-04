package com.spooky.firstproject;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla g = new Gorilla();
		int energy=g.energyLevel();
		g.displayEnergy();
		g.throwSomething(energy);
		g.throwSomething(energy);
		g.throwSomething(energy);
		g.displayEnergy();
		g.eatBanana(energy);
		g.eatBanana(energy);
		g.climb(energy);
		g.displayEnergy();
		

	}

}
