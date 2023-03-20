package com.day6.Example;

import java.util.*;

public class ExampleForTest_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n의 계승 구하기 : n을 입력하세요");
		int n = sc.nextInt();
		int fac = 1;
		for (int i = 1; i <= n; i++) {
			fac *= i;
		}
		System.out.println("1 ~ " + n + "까지의 곱 (계승, factorial) : " + fac);
	}
	
}
