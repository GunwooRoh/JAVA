package com.day10;

import java.util.Scanner;

public class ArrayArgs {
	//call by value - 값을 매개변수로 넘김(기본형이 매개변수인 경우)
	//=> 메서드에서 매개변수의 값을 변경해도 호출한 곳(main)에서는 변경의 영향을 받지 않는다
	public static int add(int a, int b) {
		int c=a+b;
		
		a++;
		System.out.println("add메서드에서 a="+a);
		
		return c;
	}
	
	//call by reference - 매개변수로 주소가 넘어감(참조형이 매개변수인 경우)
	//=> 같은 주소를 가지므로 같은 곳을 가리키게 됨
	//=> 메서드에서 매개변수의 값을 변경하면 호출한 곳 (main)에서도 변수의 값이 변경됨(변경의 영향을 받음)
	//배열을 매개변수로 받는 메서드
	public static double findAvg(int[] score) {
		//국,영,수 점수를 배열로 받아온다
		//총점 구하기
		int sum=0;
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		
		//평균 구하기
		double avg = (double)sum/score.length;
		
		score[0]++;
		System.out.println("메서드에서 score[0]="+ score[0]);
		
		return avg;
	}
	
	public static void main(String[] args) {
		//int[] arr= {90,80,75};
		//double avg=findAvg(arr);
		//System.out.println(avg);
		
		int[] arr2=new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("국,영,수 점수 입력!");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		
		double avg=findAvg(arr2); //call by reference
		System.out.println("평균 : "+avg);
		
		System.out.println("main에서 arr2[0]="+arr2[0]+"\n"); 
		//=> 메서드에서 변경한 값으로 main에서도 변경됨
		
		//call by value
		int a=10, b=20;
		int c=add(a, b);
		System.out.println("합 : "+ c);
		System.out.println("main에서 a="+a); 
		//=> 메서드에서 값을 변경했지만 main에서는 변경되지 않음
		
	}

}
