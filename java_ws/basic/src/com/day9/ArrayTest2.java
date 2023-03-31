package com.day9;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		char[] arr = new char[5];
		arr[0]='H';
		arr[1]='e';
		arr[2]='l';
		arr[3]='l';
		arr[4]='o';

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
		char[] arr2 = {'j','a','v','a'};
		
		System.out.println("\n");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		System.err.println("\narr배열의 주소 : "+arr);
		
	}

}
