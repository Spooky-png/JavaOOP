package com.spooky.firstproject;

public class Samurai extends Human{
	int health = 200;
	public int deathBlow(Samurai param) {
		this.health /= 2;
		param.health = 0;
		return param.health;
	}
	public void meditate() {
		this.health += this.health/2;
	}
	public void howMany() {
		
	}
}
