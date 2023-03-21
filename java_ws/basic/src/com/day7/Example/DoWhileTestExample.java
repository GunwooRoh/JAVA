package com.day7.Example;

import java.util.Scanner;

public class DoWhileTestExample {

	public static void main(String[] args) {
		//1. for
		Scanner sc = new Scanner(System.in);
		int num = 0, i = 0;
		int sum = 0;
		for (i = 1; i <= 100; i++) {
			if (((i % 3) == 0) || ((i % 5) == 0)){
				sum += i; 
			}
		}
		System.out.println("3의 배수와 5의 배수의 합 : " + sum);
		
		System.out.println("------------------------------");
		//2. while
		sum = 0;
		while (true) {
			if (num > 100) { 
				System.out.println("3의 배수와 5의 배수의 합 : " + sum);
				break;
			}
			if (((num % 3) == 0) || ((num % 5) == 0)) {
				sum += num;
				num++;
			}
		}
		
		System.out.println("------------------------------");
		//3. 
			System.out.println("입력할 정수의 개수를 입력하세요.");
			int num1 = sc.nextInt();
			double avg = 0;
			for (int p = 1; p <= num1; p++) {
				System.out.println("정수를 입력하세요");
				int num2 = sc.nextInt();
				avg += num2;
			}
			double avg2 = avg/num1;
		System.out.println(("입력된 정수의 전체 평균 : " + Math.round(avg2 * 100)/ 100.0));
	}

}
