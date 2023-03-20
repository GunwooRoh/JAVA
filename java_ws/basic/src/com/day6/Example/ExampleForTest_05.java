package com.day6.Example;

import java.util.*;

public class ExampleForTest_05 {

	public static void main(String[] args) {
		int a = 0;
		for (int i = 0; i <= 100; i++) {
			if(i % 2 == 0) {
				a += i;
			}
		}
		System.out.println("0 ~ 100까지 짝수의 합 : " + a);
		System.out.println("------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 구구단의 단을 입력하세요");
		int b = sc.nextInt();
		for (int i = 9; i > 0; i--) {
			System.out.println(b + " * " + i + " = " + b*i);
		}
	}

}
