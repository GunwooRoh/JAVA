package com.day16;

import java.util.Scanner;

class Animal{
	   public void bark(){
	      System.out.println("울다");
	   }
	   public void parent(){
	      System.out.println("난 부모-동물");
	   }
	}

	class Cat extends Animal{
	   public void bark()   {
	      System.out.println("야옹야옹");
	   }
	   public void child()   {
	      System.out.println("난 자식-고양이");
	   }
	}

	class Cow extends Animal{
	   public void bark()   {
	      System.out.println("음메음메");
	   }
	}

	class Dog extends Animal{
	   public void bark()   {
	      System.out.println("멍멍");
	   }
	}
	
public class PolymoTest3 {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.parent();
		
		a = new Cat();
		a.bark();
		
		a = new Cow();
		a.bark();
		
		a = new Dog();
		a.bark();
		
		System.out.println("----------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 고양이 2. 소 3. 개");
		
		int input = sc.nextInt();
		
		Animal a2 = null;
		
		if (input == 1) {
			a2 = new Cat();
		} else if (input == 2) {
			a2 = new Cow();
		} else if (input == 3) {
			a2 = new Dog();
		} else {
			System.out.println("잘못 입력");
			return;
		}
		a2.bark();

		
		System.out.println("----------------------");
		
		Animal arr[] = new Animal[3];
		arr[0] = new Cat();
		arr[1] = new Cow();
		arr[2] = new Dog();
		
		//for문
		for (int i = 0; i < arr.length; i++) {
			arr[i].bark();
		}
		
		System.out.println("----------------------");
		
		//확장for문
		for (Animal a3 : arr) {
			a3.bark();
		}
		
	}
		//메서드
		public static Animal createAnimal(int input) {
			Animal a3 = null;
			if (input == 1) {
				a3 = new Cat();
			}else if (input == 2) {
				a3 = new Cow();
			}else if (input == 3) {
				a3 = new Dog();
			} return a3;
		}
}
