package com.day18;

import java.util.Scanner;

interface week {
	int MON = 1, TUE = 2, WED = 3, THU = 4, FRI = 5, SAT = 6, SUN = 7;
}

public class InterfaceConst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요일 선택");
		System.out.println("1. 월 2.화 3.수 4.목 5.금 6.토 7.일");
		int input = sc.nextInt();
		
		switch (input) {
		case week.MON : 
			System.out.println("주간회의");
			break;
		case week.TUE : 
			System.out.println("프로젝트 기획회의");
			break;
		case week.WED : 
			System.out.println("진행사항 보고");
			break;
		case week.THU : 
			System.out.println("사내 축구시합");
			break;
		case week.FRI : 
			System.out.println("프로젝트 마감일");
			break;
		case week.SAT : 
			System.out.println("가족과 함께");
			break;
		case week.SUN : 
			System.out.println("오늘은 휴일");
			break;
		default :
			System.out.println("잘못 입력");
		}
	}

}
