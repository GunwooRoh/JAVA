package com.day12;

import java.util.Scanner;

class NameCard{
	//1. 멤버변수
	String name;
	String phone;
	String address;
	String position;

	//2. 생성자
	public NameCard(String p_name, String p_phone, String p_address, String p_position)	{
		name = p_name;
		phone = p_phone;
		address = p_address;
		position = p_position;
	}

	//3. 메서드
	public void display(){
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
		System.out.println("회사주소 : " + address);
		System.out.println("직급 : " + position+"\n");
	}
}

public class NameCardExam {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 전화번호, 회사주소, 직급을 입력하세요");
		String name = sc.nextLine();
		String phone = sc.nextLine();
		String address = sc.nextLine();
		String position = sc.nextLine();

		System.out.println();
		
		NameCard nc = new NameCard(name, phone, address, position);
		nc.display();
	}
}
