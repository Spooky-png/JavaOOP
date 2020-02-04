package com.spooky.firstproject;

public class Samurai {
	int health = 200;
	public void deathBlow(Human param) {
		this.health /= 2;
		param.health = 0;
	}
	public void meditate() {
		this.health += this.health/2;
	}
	public void howMany() {
		
	}
}
