package com.spooky.firstproject;

public class HumanTest {

	public static void main(String[] args) {
		Human a = new Human();
		Human b = new Human();
		a.attack(b);
		Samurai sam = new Samurai();
		Samurai jack = new Samurai();
		System.out.println(sam.health);
		sam.deathBlow(jack);
		System.out.println(jack.health);
		Ninja ned = new Ninja();
		System.out.println(ned.stealth);
		Wizard wiz = new Wizard();
		System.out.println(wiz.intelligence);
		

	}

}
