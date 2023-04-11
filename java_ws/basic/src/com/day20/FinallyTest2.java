package com.day20;

public class FinallyTest2 {
	public static boolean divider(int n1, int n2) {
		try {
			int result = n1 / n2;
			System.out.println("나눗셈 결과 : " + result);
			return true;
		}catch(Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
			return false;
		}finally {
			System.out.println("반드시 실행 - finally");
		}
	}
	public static void main(String[] args) {
		if(divider (7, 3)) {
			System.out.println("연산 성공\n");
		}else {
			System.out.println("연산 실패\n");
		}
		
		if(divider (8, 0)) {
			System.out.println("연산 성공\n");
		}else {
			System.out.println("연산 실패\n");
		}
	}

}
