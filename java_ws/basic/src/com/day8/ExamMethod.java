package com.day8;

import java.util.Scanner;

public class ExamMethod {
	public static int larger(int a, int b){
		int result=0;
		if (a>b){
			result=a;
		}else{
			result=b;
		}

		return result;
	}

	public static int remainder(int a, int b){
		int c = a % b;
		return c;
	}

	public static float toInch(float cm){
		float inch = cm / 2.54f;
		return inch;
	}

	public static float toCm(float inch){
		float cm = inch * 2.54f;
		return cm;
	}

	public static double findArea(int w, int h){
		double area = w*h/2.0;
		return area;
	}

	//윤년인지, 평년인지 구하는 메서드
	public static String getLeapYear(int year){
		/*
				윤년
				1) 400으로 나누어 떨어지면 윤년 
				또는
				2) 4로 나누어 떨어지고, 100으로 나누어 떨어지지 않으면 윤년
		 */
		String result="";
		if (year%400==0 || (year%4==0 && year%100!=0)){
			result="윤년";
		}else{
			result="평년";
		}

		return result;
	}

	//홀수인지 짝수인지 구하는 메서드 만들기
	public static String  getOdd(int num){
		String result = "";
		if(num%2==0){
			result="짝수";
		}else{
			result="홀수";
		}//if

		return result;
	}
	
	public static boolean isOdd(int num){
		boolean result = false;
		if(num%2==1){
			result=true;		
		}//if
		
		return result;
	}

	//주민번호를 이용하여 남자인지, 여자인지 성별 구하는 메서드
	public static String  getGender(int gender){
		String result = "";
		if(gender==1 || gender==3){
			result="남자";
		}else{
			result="여자";
		}//if

		return result;
	}

	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();	//5	
		int n2 = sc.nextInt();  //2

		int num=larger(n1, n2);

		System.out.println(n1+", "+n2+"중 더 큰수는 "+ num+"\n");

		while(true){
			System.out.println("두 수를 입력하세요");
			int x = sc.nextInt();		
			int y = sc.nextInt();
			if (x==0 || y==0)	break;

			int value = remainder(x, y);   
			System.out.println("나머지 연산 결과 : " + x 
					+ " % " + y +" = " + value);
		}//while

		//
		System.out.println("\n변환하려는 inch를 입력!!");
		float inch = sc.nextFloat();
		float res = toCm(inch);

		System.out.println(inch + "inch => " + res +"cm");

		System.out.println("\n변환하려는 cm를 입력!!");
		float cm = sc.nextFloat();
		res = toInch(cm);

		System.out.println(cm + "cm => " + res +"inch");

		//
		System.out.println("\n삼각형의 밑변, 높이 입력!");
		int w = sc.nextInt();
		int h = sc.nextInt();
		double area = findArea(w, h);

		System.out.println("삼각형 면적 : " + area);

		//
		System.out.println("\n연도를 입력하세요");
		int y = sc.nextInt();
		String result = getLeapYear(y);
		System.out.println(y + "=> " + result);

		System.out.println("\n숫자를 입력하세요");
		int n = sc.nextInt();
		result = getOdd(n);
		System.out.println(n + "=> " + result);

		if(isOdd(n)) {
			System.out.println(n + "은 홀수");			
		}else {
			System.out.println(n + "은 짝수");
		}
		
		System.out.println("\n주민번호의 성별을 입력하세요(1,2,3,4)");
		int g = sc.nextInt();
		result = getGender(g);
		System.out.println(g + "=> " + result);
	}

}