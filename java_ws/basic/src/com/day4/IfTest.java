package com.day4;

import java.util.*;

public class IfTest {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num > 0)
		System.out.println("양수");
		else if (num ==0)
		System.out.println("0");
		else
		System.out.println("음수");
		System.out.println("-----------------------");

	}

}