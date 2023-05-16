package com.day20;

public class ThrowsTest1 {

	public static void main(String[] args) {
	try {
		method1();
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
		System.out.println("-----------next-----------");
	}
	
	public static void method1() throws Exception {
		method2();
	}
	
	public static void method2() throws Exception {
		throw new Exception("예외 발생");
	}
}
