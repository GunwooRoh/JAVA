package com.day5;

import java.util.Scanner;

public class SwitchTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("평균을 입력하세요");
		double avg = sc.nextDouble();
		String grade="";
		
		switch ( (int)avg/10)
		{
		case 10:
		case 9: grade="A"; break;
		case 8: grade="B"; break;
		case 7: grade="C"; break;
		case 6: grade="D"; break;
		default: grade="F";
		}
		System.out.println("학점 : " + grade);

	}

}
