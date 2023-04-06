package com.day17;

abstract class Animal {
	public abstract void sound();
}

class Dog extends Animal{
	public void sound() { 
		System.out.println("멍멍"); 
	}
}

class Cow extends Animal{
	public void sound() {
		System.out.println("음메"); 
	}
}

abstract class Mammal extends Animal {
	public void breed (int n) {
		System.out.println(n + "마리 새끼를 낳는다.");
	}
}

class Cat extends Mammal {
	public void sound() {
		System.out.println("야옹");
	}
}

public class AbstractTest {

	public static void main(String[] args) {
		Animal a = new Dog();
		a.sound();
		
		a = new Cow();
		a.sound();
		
		a = new Cat();
		a.sound();
		
		//Animal a2 = new Mammal();
		
		Mammal m = new Cat(); //다형성
		m.sound();
		m.breed(3);
	}

}
