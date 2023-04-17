package com.day23;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("AB");
		sb.append(25);
		sb.append('Y').append(true);
		System.out.println(sb);

		sb.insert(2, false);
		sb.insert(sb.length(), '2');
		System.out.println(sb);
		
		String str = "java";
		StringBuilder sb2 = new StringBuilder(str);
		System.out.println(sb2);
		
		StringBuilder sb3 = new StringBuilder("스프링");
		String s = sb3.toString();
		System.out.println(s);
	}

}
