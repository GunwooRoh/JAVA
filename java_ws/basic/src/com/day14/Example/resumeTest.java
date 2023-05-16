package com.day14.Example;

import java.util.Scanner;

class Human {
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

class Teacher extends Human {
	private String subjects;
	
	public String getSubjects() {
		return subjects;
	}
	
	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("과목 : " + subjects);
		System.out.println("가르치는 일을 합니다.");
	}
}

class Programmer extends Human {
	private int dev;
	
	public int getDev() {
		return dev;
	}
	
	public void setDev(int dev) {
		this.dev = dev;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("개발경력 : " + dev);
		System.out.println("프로그래밍을 합니다.");
	}
}

public class resumeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 전공을 입력하세요");
		
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String subjects = sc.nextLine();
		
		Teacher t = new Teacher();
		
		t.setName(name);
		t.setAge(age);
		t.setSubjects(subjects);
		
		t.showInfo();
		
		System.out.println("------------------------");
		
		System.out.println("이름, 나이, 개발경력을 입력하세요");
		
		String name2 = sc.nextLine();
		int age2 = sc.nextInt();
		sc.nextLine();
		int dev = sc.nextInt();
		
		Programmer p = new Programmer();
		
		p.setName(name);
		p.setAge(age);
		p.setDev(dev);
		
		p.showInfo();
		

	}

}
