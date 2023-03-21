package com.day7;

import java.util.*;

public class DoWhileTest {

	public static void main(String[] args) {
		int k = 1;
		do {
			System.out.println("k = " + k);
			k++;
		} while (k > 3 );
		
		k = 0;
		do {
			System.out.println(k);
			k++;
		} while (k < 3);
		Scanner sc = new Scanner (System.in);
		int sum = 0, num = 0;
		
		do {
			System.out.println("숫자 입력 (끝낼때는 0)");
			num = sc.nextInt();
			
			sum += num;
		} while (num !=0);
		
		System.out.println("\n입력된 숫자의 합 : " + sum);
	}
	

}
