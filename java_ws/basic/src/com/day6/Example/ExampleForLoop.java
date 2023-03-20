package com.day6.Example;

import java.util.Scanner;

public class ExampleForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("입력할 정수의 개수를 입력하세요");
			int num1 = sc.nextInt();
			for (;;) {
				System.out.println("정수를 입력하세요");
				int num2 = sc.nextInt();
				if (num2 == num1) {
					
					for (int i = 0; i <= num1; i++) {
						num1 += num2;
					double k =	num2 / num1;
					}
					float avg = num2 / num1;	
					break;
				}
		}
			System.out.println("입력된 정수의 전체 평균 : ");
	} 
}


