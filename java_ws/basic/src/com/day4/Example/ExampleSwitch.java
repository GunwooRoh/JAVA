package com.day4.Example;

import java.util.*;

public class ExampleSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("산술연사자를 입력하세요. (+, -, *, /)");
		String symbol = sc.nextLine();
		String str = "";
		switch(symbol){
			case "+" :
				str = "더하기 입니다.";
				break;
			case "-" :
				str = "빼기 입니다.";
				break;
			case "*" :
				str = "곱하기 입니다.";
				break;
			case "/" :
				str = "빼기 입니다.";
				break;
			default :
				str = "입력 오류입니다. 다시 입력해주세요.";
				break;
		}
			System.out.println(str);

	}


		
}

