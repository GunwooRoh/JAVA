package com.day23;

import java.util.StringTokenizer;

public class TokenizerTest2 {

	public static void main(String[] args) {
		String str = "1,홍길동,100,90,80|2,김길동,95,85,75|3,이길동,88,77,66";
		
		StringTokenizer st = new StringTokenizer(str, "|");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			//System.out.println(token);
		
		
		StringTokenizer st2 = new StringTokenizer(token, ",");
		while(st2.hasMoreTokens()) {
			String s = st2.nextToken();
			System.out.print(s + "\t");
		}
		System.out.println("\n");
	
		}
		System.out.println("---------------------------------------------\n");
		
		
	   
		String[] str1= str.split("\\|");
		  for(String s : str1) {
	         //System.out.println(s);
	         String[] str2 = s.split(",");
	         for(String s2 : str2) {
	        	 System.out.print(s2 + "\t");
	         }
	         System.out.println();
	      }
	}
}
