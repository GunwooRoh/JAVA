package com.day22;

public class StringTest2 {

	public static void main(String[] args) {
		String str = "123456789";
		String s = str.replace('7', '칠');
		System.out.println("str : " + str + ", s : " + s);
		
		s = str.replace("5", "다섯");
		System.out.println("str : " + str + ", s : " + s);
		
		str = "java, oracle, jquery, spring";
		String[] arr = str.split(","); //,를 구분자로 하여 나누기
		
		for(String ss : arr) {
			System.out.println(ss);
		}
		
		System.out.println("\n---------------------------------");
		
		str = "html.css.jsp.mybatis";
		String[] arr2 = str.split(".");
		for(String ss : arr2) {
			System.out.println(ss);
		}
	}

}
