package com.spooky.firstproject;

public class Wizard extends Human{
	int health = 50;
	int intelligence = 8;
	public void heal(Human param) {
		param.health += this.intelligence;
	}
	public void fireball(Human param) {
		param.health -= this.intelligence*3;
	}
}
