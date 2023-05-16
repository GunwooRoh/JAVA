package com.day23;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		double num = sc.nextDouble();
		
		
		DecimalFormat df = new DecimalFormat("#,###");
		String str = df.format(num);
		System.out.println(str); //1,234,568

	}

}
