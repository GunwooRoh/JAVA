package com.day7.Example;

public class ExampltOverlaporNot {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if(i + j == 6) {
				int sum = i + j; 
				System.out.println(i + "+" + j + " = " + sum);
				}
			}
		}
		System.out.println("------------------------------------");
		int sum = 0;
		for (int i = 1; i <= 10; i++) { // 10줄
			for (int j = 1; j <= i; j++) { // 1부터 i까지 1씩 증가
				sum += j;
			}
		} System.out.println("totalSum = " + sum);
		
		System.out.println("------------------------------------");
		
		sum = 0;
		int sum2 = 0;
		for (int i =1; i <= 10; i++) {
			sum += i;
			sum2 += sum;
		}
		System.out.println("totalSum = " + sum2);
		
		
	}
}
