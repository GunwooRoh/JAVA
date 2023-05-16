package com.day9;

import java.util.Scanner;

public class ExamArray2 {

	public static void main(String[] args) {		
		//1.
		Scanner sc=new Scanner(System.in);
		System.out.println("배열의 개수를 입력하세요");
		int cnt=sc.nextInt();

		int[] arr=new int[cnt];

		//초기화
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
		}

		//출력
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//2.
		int[] arr2=new int[5];

		//초기화
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=2*i+1; //1,3,5,7,9
		}

		System.out.println("\n\n=======홀수=======");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}

}