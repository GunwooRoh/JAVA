package com.day6;

public class ScopeTest {

	public static void main(String[] args) {
		int n = 20;
		System.out.println("n = " + n);
		for(int i = 0; i < 3; i++) {
			System.out.println(i + ". hello");
			System.out.println("for문 내부, n = " + n + "\n");
		}
		for(int i = 0; i < 2; i++) {
			int num = 5;
			System.out.println("i = " + i + ", num=" + num);
		}
		System.out.println("num = " + n);
	
	//1
	for(int i = 0; i < 5; i++) {
		System.out.print("*");
		}
		System.out.println();
	//2	
		for(int i = 0; i < 3; i++) {
		System.out.println("*");
		}
	}

}