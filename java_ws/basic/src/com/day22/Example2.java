package com.day22;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요. <하이픈 없이 입력>");
		String id = sc.nextLine();
		if (id.length() != 13) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		String sub1 = id.substring(0);
		System.out.println(sub1);
		
		String sub2 = id.substring(0, 2);
		String sub3 = id.substring(2, 4);
		String sub4 = id.substring(4, 6);
		String sub5 = id.substring(6,7);
		int sub6 = Integer.parseInt(sub5);
		if(sub6 == 1 || sub6 == 3) {
			sub5 = "남";
		}else if(sub6 == 2 || sub6 == 4) {
			sub5 = "여";
		}
		
		int age = 0;
		if (sub6 == 1 || sub6 == 2) {
			age = 19; 
		}else if (sub6 == 3 || sub6 == 4) {
			age = 20;
		}
		
		System.out.println(age + sub2 + "년 " + sub3 + "월 " + sub4 + "일, " + sub5);

	}

}
