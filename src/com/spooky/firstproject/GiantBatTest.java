package com.spooky.firstproject;

public class GiantBatTest {

	public static void main(String[] args) {
		GiantBat b = new GiantBat();
		int energy=b.energyLevel();
		b.displayEnergy();
		b.attackTown(energy);
		b.attackTown(energy);
		b.attackTown(energy);
		b.displayEnergy();
		b.eatHumans(energy);
		b.eatHumans(energy);
		b.fly(energy);
		b.fly(energy);
		b.displayEnergy();

	}

}
