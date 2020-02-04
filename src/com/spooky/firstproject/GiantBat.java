package com.spooky.firstproject;

public class GiantBat extends Mammal{
	int energy = 300;
	public void fly(int energy) {
		energy = energy - 50;
		System.out.println("The bat fly real loud.");
	}
	public void eatHumans(int energy) {
		System.out.println("The bat eat 'em up.");
		energy = energy + 25;
	}
	public void attackTown(int energy) {
		System.out.println("The bat DESTROYED that town.");
		energy = energy - 100;
}

}
