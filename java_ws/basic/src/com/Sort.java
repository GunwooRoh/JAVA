package com;

import java.util.Scanner;

class Sort {
	private static void method(int[] arr) {
	for (int i = 0; i < arr.length - 1; i++) {
		int a = i;
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[j] > arr[a]) {
				a = j;
			}
		}
		
		int result = arr[i];
		arr[i] = arr[a];
		arr[a] = result;
	}
}	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5]; 
		System.out.println("5개의 숫자를 입력하세요.");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		method(arr);
		
		System.out.print("내림차순 정렬 결과 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}

