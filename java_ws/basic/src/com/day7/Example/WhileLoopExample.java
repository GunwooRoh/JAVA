package com.day7.Example;

import java.io.IOException;
import java.util.*;

public class WhileLoopExample {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String str1 = "";
		String str2 = "";
		while(true) {
			System.out.println("년도를 입력하세요, (끝낼 때는 Q 입력)");
			String year = sc.next();
			
			String k = year.toUpperCase();
			
			if(k.equals("Q")) {break;
			}
			
			int a = Integer.parseInt(year);
			if ((a % 2) == 0) {
				str1 = "짝수 해, ";
			} else {
				str1 = "홀수 해, ";
			}
			
			if((a % 4) == 0 && ((a % 100) != 0)) {
				str2 = "윤년";
			}else {
				str2 = "평년";
			}	
			System.out.println((a + "년 : "+ str1 + str2));
		}
		/* int year = sc.nextInt();
		String result = "";
		
			if ((year % 4) == 0 && (year % 100) != 0) {
				result = "짝수 해, 윤년";
			} else if ((year % 2) != 0) {
				result = "홀수 해, 평년";
			} else
				result = "짝수 해, 평년";
		
		System.out.println(year + "년 : " + result); */
	}
}

