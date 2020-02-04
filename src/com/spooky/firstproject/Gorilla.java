package com.spooky.firstproject;

public class Gorilla extends Mammal{
	public void throwSomething() {
		energy = energy - 5;
		System.out.println("The gorilla throws some dookie.");
	}
	public void climb() {
		System.out.println("The gorilla climbs a tree real good.");
		energy = energy - 10;
	}
	public void eatBanana() {
		System.out.println("The gorilla DESTROYED that banana.");
		energy = energy + 10;
}

}
