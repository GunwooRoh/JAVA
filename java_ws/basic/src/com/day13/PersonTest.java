package com.day13;

class Person {
	//1. 멤버변수
	private String name;
	private int age;
	private static int count;
	/*
	 static 변수 (클래스변수)
	 클래스 차원에서 단 하나만 생성되어, 모든 객체가 공유한다
	 
	 static 멤버
	 클래스의 공통적인 의미를 가지고 있다
	 클래스 차원에서 바로 호출 가능
	 객체 생성하지 않아도 클래스의 이름으로 접근
	 */
	
	//2. 생성자
	Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(++count + " 번째 객체 생성!");
	}
	//3. 메서드
	public void display() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "\n");
	}
}


public class PersonTest {

	public static void main(String[] args) {
		Person hong = new Person ("홍길동", 23);
		hong.display();
		
		Person kim = new Person ("김길동", 20);
		kim.display();
		
		
	}

}
