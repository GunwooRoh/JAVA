package com.day13;

public class StaticTest {
	private int num1 = 10; //인스턴스 변수
	private static int num2 = 20; //static 변수
	
	public int add() { //instance메서드 - static 변수에도 접근 가능
		return num1 + num2;
	}
	
	public static int multiply (int a, int b) {
		// int c = num1 * num2 <= error
		int c = a * b;
		return c;
	}

	public static void main(String[] args) {
		int result = multiply(10, 5);
		System.out.println("두 수의 곱 : " + result); 
		
		StaticTest obj = new StaticTest();
		result = obj.add();
		System.out.println("두 수의 합 : " + result);

	}

}
