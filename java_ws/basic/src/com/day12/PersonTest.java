package com.day12;

import java.util.Scanner;

class Person{
	//1. 멤버변수
	private String name;
	private int age;
	private String phone;
	
	//2. 생성자
	Person(String name, int age, String phone){
		this.name=name;
		this.age=age;
		this.phone=phone;
		
		//this - 자기 자신을 가리키는 this
		//자신의 멤버를 가리키는 this
		//this.멤버변수, this.멤버
	}
	
	//3. getter/setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone=phone;
	}
	
	//4. 메서드
	public void showInfo() {
		System.out.println("이름:"+ name);
		System.out.println("나이:"+ age);
		System.out.println("전화번호:"+ phone+"\n");		
	}
}//class

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 전화번호 입력!");
		String name=sc.nextLine();
		int age=sc.nextInt();
		sc.nextLine();
		String tel=sc.nextLine();
		
		Person p = new Person(name, age, tel);
		p.showInfo();
		
		//멤버변수의 값 변경
		p.setName("김길동");
		p.setAge(22);
		p.setPhone("010-1000-2000");
		
		System.out.println("이름 - " + p.getName());
		System.out.println("나이 - " + p.getAge());
		System.out.println("전화번호 - " + p.getPhone());
		
	}

}
