package com.day4;

import java.util.*;

public class IfTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이용약관에 동의합니까? (Y)es/(N)o");
		String agree = sc.nextLine(); 
		if (agree.equals("Y")) {
			System.out.println("동의하였습니다.");
		} else if (agree.equals("N")) {
			System.out.println("동의하지 않으셨습니다.");
		} else
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			System.out.println("-----------------------");

	}

}