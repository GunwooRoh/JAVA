package com.day13;

/*
 static 초기화 블럭
 static 변수의 복잡한 초기화에 사용함
 해당 클래스가 메모리에 처음 로딩 될 때 한번만 수행함
 
 static {
 
 }
 
 */

class AAA {
	static int[] arr = new int[10]; //명시적 초기화
	
	//static 초기화 블럭
	static {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
	}
	
}

public class StaticBlockTest {

	public static void main(String[] args) {
		for(int i = 0;i< AAA.arr.length;i++){
			System.out.println(AAA.arr[i]);
			}

	}

}
