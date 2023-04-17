package com.day22;

public class StringTest1 {

	public static void main(String[] args) {
		String str = "Hello Java, Hi Java!";
		char ch = str.charAt(4);
		System.out.println("ch : " + ch);
		
		int idx = str.indexOf("Java"); //6
		System.out.println("앞에서 Java의 위치 : " + idx);
		System.out.println("뒤에서 Java의 위치 : " + str.lastIndexOf("Java")); //15
		
		String sub = str.substring(6, 10);
		System.out.println("sub : " + sub);
		
		sub = str.substring(12); //12부터 끝까지 추출 : Hi Java!
		System.out.println("sub : " + sub);
		
		String str1 = "www.naver.com";
		if(str1.endsWith(".com")) {
			System.out.println(".com site입니다.");
		}
		
		if (str1.startsWith("www")) {
			System.out.println("www로 시작합니다.");
		}
		
		String email = "hong@gmail.com";
		if(email.indexOf("@")!= -1 && email.indexOf(".")!= - 1 && email.indexOf("@") < email.indexOf(".")) {
			System.out.println("이메일 규칙이 올바릅니다.");
		}else {
			System.out.println("이메일규칙이 올바르지 않습니다.");
		}
		
		int idx1 = email.indexOf("@"); //@의 위치
		int idx2 = email.indexOf("."); //.의 위치
		
		String emailSub1 = email.substring(0, idx1);
		
		String emailSub2 = email.substring(idx1 + 1, idx2);
		
		String emailSub3 = email.substring(idx2 + 1);
		
		String s = "	Java  Spring ";
		String s2 = s.trim(); //양쪽 공백 제거
		System.out.println("s : |" + s + "|");
		System.out.println("s2 = |" + s2 + "|");
		System.out.println("s의 길이 : " + s.length());
		System.out.println("s2의 길이 : " + s2.length());
		
		int x = 10, y = 20;
		String ss = String.valueOf(x);
		String ss2 = Integer.toString(y);
		System.out.println(ss + y);
		System.out.println(ss2 + y);
	}

}
