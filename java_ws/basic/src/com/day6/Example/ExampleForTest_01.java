package com.day6.Example;

import java.util.*;

public class ExampleForTest_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("반복하고 싶은 횟수를 입력하세요");
		int a = sc.nextInt();
		int sum = 0;
		for(int i = 0; i <= a; i++) {
			System.out.println("재미있는 java!");
		}
		System.out.println();
		for(int i = 0; i <= a-1; i++) {
			System.out.println("i = " + i);
		}
		System.out.println();
		for(int i = 0; i <= a; i++) {
		sum += i;
		System.out.println("i = " + i + ", sum = " + sum);
		}
		System.out.println("0부터 " + a + "까지의 합 = " + sum);
		
		System.out.println("----------------------");
		
		for(int i = 97; i < 122; i++) {
		System.out.print((char)i + ", ");
		}
		System.out.println("z");
	}
	

}
