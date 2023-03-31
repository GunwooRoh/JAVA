package com.day8;

import java.util.*;

public class MethodTest2 {

		//1. 매개변수도 없고, 반환값(결과값)도 없는 메서드 정의
		public static void func1() {
			System.out.println("************");
		}
		
		//2. 매개변수는 있고, 반환값은 없는 메서드 정의
		public static void func2(int cnt) {
			//입력받은 개수만큼 별을 출력하는 메서드
			for(int i=0;i<cnt;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//3. 매개변수는 없고, 반환값은 있는 메서드 정의
		public static double func3() {
			//1~10까지 합의 평균을 구해서 리턴하는 메서드
			int sum=0;
			for(int i=1;i<=10;i++) {
				sum+=i;
			}
			
			double avg = sum/10.0;
			return avg; //리턴해주는 값(avg)의 자료형이 double이므로 반환타입도 double
		}
		
		//4. 매개변수도 있고, 반환값도 있는 메서드 정의
		public static int func4(int a, int b) {
			//두 수의 합을 구해서 리턴하는 메서드
			int c = a+b;
			return c;
		}
		
		public static void main(String[] args) {
			//[1] 매개변수, 반환값 모두 없는 메서드 호출
			func1();
			
			//[2] 매개변수는 있고, 반환값은 없는 메서드 호출
			func2(5); //매개변수 값 전달
			
			//[3] 매개변수는 없고, 반환값은 있는 메서드 호출
			double result=func3(); //메서드의 반환타입이 double이므로 double변수가 결과값을 받는다
			System.out.println(result);
			
			//[4] 매개변수도 있고, 반환값도 있는 메서드 호출
			int n=func4(10, 20); //매개변수 넘기고, 메서드가 전달해준 결과값 받는다
			System.out.println("두 수의 합:"+ n);
			
			int n1=5, n2=6;
			n= func4(n1, n2);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("두 정수 입력!");
			int n3=sc.nextInt();
			int n4=sc.nextInt();
			
			n=func4(n3, n4);
			
			//public static int parseInt(String s)
			int k=Integer.parseInt("123");
			
			String str="4567";
			k=Integer.parseInt(str);
			
			System.out.println("숫자 입력");
			sc.nextLine();
			String str2 = sc.nextLine();
			k=Integer.parseInt(str);

	}

}
