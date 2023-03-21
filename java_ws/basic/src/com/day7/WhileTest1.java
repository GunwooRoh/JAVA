package com.day7;

import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner("\n\n가나다 하나 둘\n\n라\n\n");
		String str="";
		while(sc.hasNext()){
		str = sc.nextLine();
		System.out.println("출력:"+str); 
		}
		

	}

}
