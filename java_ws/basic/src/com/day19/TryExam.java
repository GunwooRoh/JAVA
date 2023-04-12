package com.day19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExam {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("두 정수 입력!");
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			
			int res=n1%n2; //
			System.out.println("나머지 : " + res);
		}catch(ArithmeticException e) {
			System.out.println("예외발생: " + e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("예외발생: "+ e.getMessage());
		}catch(Exception e) {
			System.out.println("예외발생!"+ e.getMessage());
		}
		
		System.out.println("\n다음 문장!");
		
		//
		try {
			System.out.println("주민번호를 입력하세요");
			sc.nextLine();
			String ssn = sc.nextLine();
			
			if (ssn.length() != 13){
				throw  new Exception("주민번호를 잘못 입력했습니다, 13자리를 입력하세요");
			}
			
			System.out.println("\n주민번호 : "  +ssn);
		}catch(Exception e) {
			System.out.println(e.getMessage()); 
		}

		System.out.println("\n프로그램이 정상적으로 종료되었습니다!!"); 
	}

}
