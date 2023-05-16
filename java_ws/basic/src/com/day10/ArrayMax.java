package com.day10;

public class ArrayMax {

	public static void main(String[] args) {
		//배열에 저장된 최대값 구하기
		int[] arr = {10,57,19,35,77,26};
		int max=arr[0]; //10
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i]; //57, 77
			}
		}//for

		System.out.println("=======배열 요소=====");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n\n최대값 : " + max);
		
	}

}


