package com.day8;

public class ScopeTest {
	public static int getSum(int count) { //count : 매개변수
		int sum=0; //지역변수
		for(int i=1;i<=count;i++) { //i : 블럭변수
			sum+=i;
		}
		
		return sum;
	}
	
	/*
	 지역변수 
	 - 메서드나 {}블럭안에서 선언된 변수
	 - 해당 메서드를 벗어나면(종료되면) 소멸 (매개변수도 마찬가지)
	 - 블럭변수 : 해당 블럭을 벗어나면 소멸
	*/
	
	public static void main(String[] args) {
		int count=10;
		int sum=getSum(count);
		System.out.println("1~"+count+"까지의 합 : " + sum);
	}

}
