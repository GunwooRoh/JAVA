package com.day5.Example;

import java.util.Scanner;

	public class ExampleSwtich {
	
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("취미를 입력하세요 : 1. 영화 2. 축구 3. 야구 4. 등산");
		
		String num = sc.nextLine();
		String hobby = "";
		
		switch(num) {
		case "1" :
			hobby = "영화를 선택하였습니다";
			break;
		case "2" :
			hobby = "축구를 선택하였습니다";
			break;
		case "3" :
			hobby = "야구를 선택하였습니다";
			break;
		case "4" :
			hobby = "등산을 선택하였습니다";
			break;
		default :
			hobby = "잘못 입력하셨습니다";
		}	
			System.out.println(hobby);
		
	}

}
