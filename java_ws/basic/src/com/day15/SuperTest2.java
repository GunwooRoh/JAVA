package com.day15;

import java.util.Scanner;

class Person5 {
	protected String name;
	protected int age;
	
	Person5(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

class Student5 extends Person5 {
	protected String stNo;
	
	Student5 (String name, int age, String stNo) {
		super(name, age);
		this.stNo = stNo;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("학번 : " + stNo);
	}
	
	public void study() {
		System.out.println("공부합니다.");
	}
}

class Graduate5 extends Student5 {
	private String major;
	Graduate5(String name, int age, String stNo, String major) {
		super(name, age, stNo);
		this.major = major;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("전공 : " + major);
	}
}

public class SuperTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 학번 입력");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String stNo = sc.nextLine();
		Student5 st = new Student5(name, age, stNo);
	
		st.showInfo();
		
		System.out.println("---------------------");
		
		System.out.println("이름, 나이, 학번, 전공 입력");
		String name2 = sc.nextLine();
		int age2 = sc.nextInt();
		sc.nextLine();
		
		String stNo2 = sc.nextLine();
		String major = sc.nextLine();
		
		Graduate5 gr = new Graduate5(name2, age2, stNo2, major);
		gr.showInfo();

	}

}
