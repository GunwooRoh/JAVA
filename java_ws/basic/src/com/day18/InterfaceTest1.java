package com.day18;

import java.util.Scanner;

interface IAnimal {
	public abstract void sound();
	void display();
	}

class Cat implements IAnimal {
	public void sound() {
		System.out.println("야옹");
	}
	public void display() {
		System.out.println("Cat 클래스");
	}
}
abstract class Dog implements IAnimal {
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cow implements IAnimal {
	public void sound() {
		System.out.println("음메");
	}
	public void display() {
		System.out.println("Cow 클래스");
	}
}
public class InterfaceTest1 {

	public static void main(String[] args) {
		//IAnimal a = new IAnimal(); << 인터페이스는 객체 생성불가
		IAnimal a = new Cat(); // 다형성
		a.sound();
		a.display();
		
		a = new Cow();
		a.sound();
		a.display();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 고양이 2. 소 3. 종료");
		int type = sc.nextInt();
		
		IAnimal a2 = null;
		switch (type) {
		case 1 : 
			a2 = new Cat();
			break;
		case 2 :
			a2 = new Cow();
			break;
		case 3 :
			return;
		default :
			System.out.println("잘못 입력");
			return;
		}
		
		a2.sound();
		a2.display();
	}

}
