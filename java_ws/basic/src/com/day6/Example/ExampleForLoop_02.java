package com.day6.Example;

public class ExampleForLoop_02 {

	public static void main(String[] args) {
		System.out.println("7의 배수거나 9의 배수");
			for (int i = 1; i <= 99; i++) {
				if ((i % 7 == 0) || (i % 9 == 0)) {
					System.out.println(i + "\t");
				}
			}
			System.out.println("--------------------------------------------");
			int k = 0;
			for (int i = 1; i <= 99; i++) {
				if ((i % 7 == 0) || (i % 9 == 0)) {
					System.out.print(i + "\t");
					k ++;
				if (k % 5 == 0) 
					System.out.print("\n");
				}	
		}
			System.out.println();
			System.out.println("--------------------------------------------");
			int sum = 0;
			sum = 0;
			for (int i = 1; i <= 20; i++) {
				if ((i % 2 != 0) && (i % 3 != 0)) {
					sum += i;
				}
			}
			System.out.println(sum);
	}
}
