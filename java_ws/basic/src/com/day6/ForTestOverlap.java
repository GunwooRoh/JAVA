package com.day6;

public class ForTestOverlap {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println("============현재 i : " + i);
			
			for (int j = 0; j < 2; j++) {
				System.out.println("현재 j : " + j);
				}
			}
		System.out.println("-----------------------");
		for (int dan = 2; dan <= 9; dan++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(dan + "*" + j + " = " + dan * j);
			}
		}
	}

}
