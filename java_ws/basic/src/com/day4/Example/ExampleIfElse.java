package com.day4.Example;

import java.util.Scanner;

public class ExampleIfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("평균을 입력하세요.");
		int ave = sc.nextInt();
		String grade = "";
		if (ave >= 90) {
			grade = "A";
			
		}else if (ave >= 80) {
			grade = "B";
			
		}else if (ave >= 70) {
			grade = "C";
			
		}else if (ave >= 50) {
			grade = "D";
			
		}else {
			grade = "F";
			
		System.out.println("평균 : " + ave);
		System.out.println("학점 : " + grade);
		
		}
				

	}

}
