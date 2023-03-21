package com.day7.Example;

import java.util.Scanner;

public class ContinueTestExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두개의 정수를 입력하세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0, c = 0;
		
		if (a > b) {
			a = b;
			b = c;
			a = c;
		}
			for (int i = a; i <= b; i++) {
			sum += i;	
		} 
		 System.out.println(a + " ~ " + b + " 사이의 정수의 합 " + sum);
		 
		 System.out.println("-------------------------------");
		 
		 System.out.println("두개의 정수를 입력하세요.");
			int a2 = sc.nextInt();
			int b2 = sc.nextInt();
			
			int a3 = 0;
			int b3 = 0;
			
			int sum2 = 0;
			if (a2 > b2) {
				a3 = a2;
				b3 = b2;
				for (int i = b3; i <= a3; i++) {
				sum2 += i;
				}
			} else if (b2 > a2) {
				a3 = b2;
				b3 = a2;
				for (int i = b3; i <= a3; i++) {
					sum2 += i;
				}
			} else {
				for (int i = a2; i <= b2; i++) {
					sum += i;
				}
			System.out.println(b3 + " ~ " + a3+ " 사이의 정수의 합 " + sum2);
			}
	}
}

