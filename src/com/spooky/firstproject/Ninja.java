package com.spooky.firstproject;

public class Ninja {
	int health = 100;
	int stealth = 10;
	public void steal(Human param) {
		param.health -= this.stealth;
		this.health += this.stealth;
	}
	public void runAway() {
		this.health -= 10;
	}

}
