package com.day4;

public class IncrementOp4 {

	public static void main(String[] args) {
		int a = 0;
		System.out.println("a : " + a); //0
		System.out.println("a++ : " + a++); //0
		System.out.println("++a : " + ++a); //2
		
		double b = 7;
		System.out.println("b : " + b); //7.0
		System.out.println("b-- : " + b--); //7.0
		System.out.println("--b : " + --b); //5.0
		
		char c = 'A';
		System.out.println("c : " + c); //A
		System.out.println("++c : " + ++c); //B
		c = 'a';
		System.out.println("c : " + c); //a
		c++;
		System.out.println("c++ : " + c); //b
	}

}
