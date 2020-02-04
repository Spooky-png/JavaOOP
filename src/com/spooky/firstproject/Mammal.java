package com.spooky.firstproject;

public class Mammal {
	private int energy = 100;
	public int energyLevel() {
		return energy;
	}
	public int displayEnergy() {
		System.out.println("My energy level is: " +energy);
		return energy;
	}

}
