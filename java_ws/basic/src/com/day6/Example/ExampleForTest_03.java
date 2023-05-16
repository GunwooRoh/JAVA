package com.day6.Example;

import java.util.*;

public class ExampleForTest_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3의 배수의 개수를 입력하세요");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			System.out.print(3 * (i) + "\t");
		}
	}
}
