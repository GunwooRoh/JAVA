package com.day7.Example;

import java.util.Scanner;

public class ContinueTestExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
		System.out.println("두 개의 정수를 입력하세요. (피제수, 제수 순으로 입력)");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		if ((b == 0)) {
			if (a == 0) break;
		System.out.println("제수가 0이므로 연산을 생략합니다.");
			continue;
		}
		
		int result1 = (a / b);
		int result2 = (a % b);
		
		System.out.println("목 : " + result1 + ", 나머지 : " + result2);
		}

	}

}
