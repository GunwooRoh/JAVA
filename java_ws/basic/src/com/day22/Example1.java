package com.day22;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		String str1 = "test.txt";
		int dot = str1.lastIndexOf('.');
		String sub1 = str1.substring(0, dot);
		String sub2 = str1.substring(dot + 1);
		System.out.println("파일명 : " + sub1 + ", 확장자 : " + sub2);
		
		String str2 = "안녕하세요\r\n 저는 홍길동입니다.";
		str2 = str2.replace("\r\n", "<br>");
		System.out.println(str2);
		
		String str3 = "c:\\shop\\upload\\test.txt";
		int dot2 = str3.lastIndexOf('.');
		String sub3 = str3.substring(0, 15);
		String sub4 = str3.substring(15, dot2);
		String sub5 = str3.substring(dot2 + 1);
		System.out.println("폴더 : " + sub3);
		System.out.println("파일명 : " + sub4);
		System.out.println("확장자 : " + sub5);
		
		System.out.println("--------------------------------------------------");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("URL 주소를 입력하세요.");
		String email = sc.nextLine();
		
		if(email.indexOf("http://www.mall.com") != -1) {
			System.out.println("해당 url 주소 : " + email);
		}else {
			System.out.println("url 주소가 적합하지 않습니다.");
		}
		

	}

}
