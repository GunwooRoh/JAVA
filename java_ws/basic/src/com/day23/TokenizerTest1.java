package com.day23;

import java.util.StringTokenizer;

public class TokenizerTest1 {

	public static void main(String[] args) {
		/*
		StringTokenizer - 긴 문자열을 지정된 구분자를 기준으로 토큰이라는 여러 개의 작은 문자열로
						  잘라내는데 사용됨
						- 구분자로 단 하나의 문자밖에 사용하지 못함

		String클래스의 split()과 유사		 
		 */

		String str="10,20,30,40";
		StringTokenizer st = new StringTokenizer(str, ",");

		while(st.hasMoreTokens()) {
			String token=st.nextToken();
			System.out.println(token);
		}
		
		//split()
		System.out.println("\n======split=======");
		String[] arr = str.split(",");
		for(String a : arr) {
			System.out.println(a);
		}

		str="x=100*(200+300)/2";
		StringTokenizer st2 = new StringTokenizer(str, "+-*/=()", true);
		//StringTokenizer(String str, String delim, boolean returnDelims)
		//=> 구분자도 토큰으로 간주

		/*
		 StringTokenizer 는 단 한 문자의 구분자만 사용할 수 있기 때문에, "+-/=()" 
		 전체가 하나의 구분자가 아니라 각각의 문자가 모두 구분자임
		 */
		System.out.println("\n=================");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}//while

	}

}







