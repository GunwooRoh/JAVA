package com.day20;

import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("두 정수 입력");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int result = n1 / n2;
			System.out.println("나누기 결과 : " + result);
		}catch (Exception e) {
			System.out.println("예외 : " + e.getMessage());
			
		}finally {
			System.out.println("반드시 실행");
		}
		
		System.out.println("----------------------");

	}

}
