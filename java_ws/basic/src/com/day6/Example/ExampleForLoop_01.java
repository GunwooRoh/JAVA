package com.day6.Example;

import java.util.*;

public class ExampleForLoop_01 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      int sum = 0;
	      for(;;) {
	         System.out.println("숫자를 입력하세요");
	         int num = sc.nextInt();

	         sum += num;
	         
	         if(num==0) {
	            break;
	         }
	      }
	      System.out.println("\n입력된 숫자의 합 :"+ sum);
	   

	}

}
