package com.day7;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("정수를 입력하세요 (끝낼때는 0)");
			int num = sc.nextInt();
			
			String result = "";
			if(num == 0) break;
			
			if (num > 0) {
				result = "양수";
			} else {
				result = "음수";
			}
			System.out.println(result);
		}
		sc.close();
		

	}

}
