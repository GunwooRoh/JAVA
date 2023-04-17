package com.day23;

public class ConcatTest {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "and";
		String s3 = "oracle";
		String str = s1 + s2 + s3;
		System.out.println(str);
		
		str = s1.concat(s2).concat(s3);
		System.out.println(str);
		
		str = new StringBuilder().append(s1).append(s2).append(s3).toString();
		System.out.println(str);
	}

}
