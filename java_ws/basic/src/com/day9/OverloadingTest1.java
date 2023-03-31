package com.day9;

import java.util.Scanner;

public class OverloadingTest1 {
	/*
	 오버로딩 메서드
	 - 하나의 클래스내에서 메서드의 이름은 같으나, 매개변수의 개수나 자료형이 다른 메서드를 
	 오버로딩메서드라고 함 
	 - 리턴 타입으로는 구별하지 않음
	 */

	public static int add(int a, int b) {
		int c=a+b;
		return c;
	}

	public static double add(double a, double b) {
		double c=a+b;
		return c;
	}

	public static String add(String a, String b) {
		String c = a+b;
		return c;
	}

	/*
	public static String add(int a, int b) {  //오버로딩 아님-리턴타입으로 구별 안함
		String str = Integer.toString(a+b);
		return str;
	}
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수 입력!");
		int n1=sc.nextInt();
		int n2=sc.nextInt();

		int result=add(n1, n2);
		System.out.println("두 정수의 합 : "+result);

		System.out.println("두 실수 입력!");
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();

		double result2 = add(d1,d2);      
		System.out.println(result2);

		System.out.println("두 문자열 입력!");
		sc.nextLine();
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

		String result3 = add(str1,str2);      
		System.out.println(result3);

	}

}