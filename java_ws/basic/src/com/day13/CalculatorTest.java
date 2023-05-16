package com.day13;

class Calculator {
	public static int add(int a, int b) {
		int result1 = a + b;
		return result1;
	}
	
	public static int minus(int a, int b) {
		return a - b;
	}
}

public class CalculatorTest {

	public static void main(String[] args) {
		int result = Calculator.add(10, 20);
		System.out.println("두 수의 합 : " + result);
		
		//int a = Integer.parselnt("123");
		
		Calculator cal = new Calculator();
		
		int result1 = cal.minus(10, 30);
		System.out.println("두 수의 차 : " + result1);
		

	}

}
