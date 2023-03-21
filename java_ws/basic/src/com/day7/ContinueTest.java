package com.day7;

public class ContinueTest {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) continue;
			System.out.println("i = " + i);
		}
		System.out.println("--------------------");
		
		for (int i = 1; i <= 10; i++) {
			if (i == 5) break;
			System.out.println("i = " + i);
		}
		System.out.println("--------------------");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 1) break;
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println("--------------------");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 1) continue;
				System.out.println("i = " + i + ", j = " + j);
			}
		}	
		System.out.println("--------------------");
		
		Loop1: for (int i = 2; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					if (j == 5) {
						continue Loop1;
					}
					
					System.out.println(i + " * " + j + " = " + i*j);
				}
				
				System.out.println();
		}
		
	}
	

}
