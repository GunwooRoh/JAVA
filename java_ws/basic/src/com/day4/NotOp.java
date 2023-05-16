package com.day4;

public class NotOp {

	public static void main(String[] args) {
		boolean power = false;
		System.out.println(power);
		
		power = !power;
		System.out.println(power);
		System.out.println(!power);
		
		int a = 3, b = 5;
		boolean bool = a > 5;
		System.out.println("a > b : " + bool);
		
		bool = !(a > b);
		System.out.println("!(a > b) : " + bool);

	}

}
