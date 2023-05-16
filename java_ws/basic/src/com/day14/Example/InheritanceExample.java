package com.day14.Example;

import java.util.Scanner;

class Person3 {
	protected String name;
	protected int age;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

class Student3 extends Person3 {
	protected String num;
	
	public String getNum() {
		return num;
	}
	
	public void setNum(String num) {
		this.num = num;
	}
	
	public void study() {
		System.out.println("공부한다");
	}
}

class Graduate extends Student3 {
	private String major;
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void report() {
		System.out.println("논문을 쓴다.");
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 학번, 전공을 입력하세요.");
		
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String num = sc.nextLine();
		String major = sc.nextLine();
		
		Graduate g = new Graduate();
		g.setName(name);
		g.setAge(age);
		g.setNum(num);
		g.setMajor(major);
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("학번 : " + num);
		System.out.println("전공 : " + major);
		g.report();
	}

}
