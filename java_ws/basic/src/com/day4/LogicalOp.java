package com.day4;

public class LogicalOp {

	public static void main(String[] args) {
		int x = 10, y = -20;
		boolean bool = x > 0;
		boolean bool2 = y > 0;
		boolean bool3 = x > 0 && y > 0;
		
		System.out.println("x > 0 : " + bool + ", y > 0 : " + bool2);
		System.out.println("&& 결과 : " + bool3);
		System.out.println("|| 결과 : " + (x > 0 || y >0));
		System.out.println("!(x > 0) : " + !(x > 0));

	}

}
