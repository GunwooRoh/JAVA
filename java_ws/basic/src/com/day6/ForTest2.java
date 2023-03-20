package com.day6;

import java.util.*;

public class ForTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~n 까지의 덧셈 : n 을 입력하세요");
		int a = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= a; i++) {
			System.out.println(sum + "+" + a);
			sum += i;
		}
			System.out.println("1~" + a + "까지의 합:" + sum);
		System.out.println("-------------------------------");
		System.out.println("1~10 까지의 짝수 덧셈 : n 을 입력하세요");	
		sum = 0;
		for (int i = 2; i <= 10; i+=2) {
			sum += i;
		}
		System.out.println("1 ~ 10까지의 짝수합: " + sum);
		System.out.println("-------------------------------");
		sum = 0;
		int k = sc.nextInt();
		for (int i = 1; i <= k; i+=2) {
			sum += i;
		}
		System.out.println(k + "까지의 홀수의 합: " + sum);
	}

}
