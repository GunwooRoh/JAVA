package com.day16;

import java.util.Scanner;

class Parent6 {
	public void parentFunc() {
		System.out.println("부모클래스");
	}
	
	public void display() {
		System.out.println("부모 display()");
	}
	
}

class Child6 extends Parent6 {
	public void display() {
		System.out.println("자식 display()");
	}
	
	public void childFunc() {
		System.out.println("자식클래스");
	}
}

public class PolymoTest1 {

	public static void main(String[] args) {
		Child6 ch = new Child6();
		ch.display();
		ch.childFunc();
		ch.parentFunc();
	
		//다형성
		//부모에 자식을 넣는다, 이때 자식의 오버라이딩 메서드가 호출
		Parent6 p = new Child6();
		p.display();
		p.parentFunc();
		System.out.println("--------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 원 2. 삼각형 선택");
		int type = sc.nextInt();
		
		if (type == 1) {
			Circle6 c = new Circle6();
		}else if (type == 2) {
			Triangle6 t = new Triangle6();
		}else {
			System.out.println("잘못 입력");
		}
		
		System.out.println("--------------------------------------------");
		/*
		Shape6 sh2 = null;
		if (type == 1) {
			sh2 = new Circle6();
		}else if (type == 2) {
			sh2 = new Triangle6();
		}else {
			System.out.println("잘못 입력");
			return;
		}
		
		sh2.draw();
		sh2.delete();
		*/
		Shape6 sh3 = createShape(type);
		if(sh3 != null) {
			sh3.draw();
			sh3.delete();
		}else {
			System.out.println("잘못 입력!!");
		}
		
		System.out.println("--------------------------------------------");
		
		Circle6[] cArr = new Circle6[2];
		cArr[0] = new Circle6();
		cArr[1] = new Circle6();
		
		for (int i = 0; i < cArr.length; i++) {
			cArr[i].draw();
			cArr[i].delete();
		}
		
		System.out.println("--------------------------------------------");
		Shape6[] shArr = new Shape6[3];
		shArr[0] = new Circle6();
		shArr[1] = new Triangle6();
		shArr[2] = new Circle6();
		
		for (int i = 0; i < shArr.length; i++) {
			shArr[i].draw();
			shArr[i].delete();
		}
		//확장 for
		System.out.println("--------------------------------------------");
		for (Shape6 s : shArr) {
			s.draw();
			s.delete();
		}
		
	}
		//메서드
	public static Shape6 createShape(int type) {
		Shape6 sh2 = null;
		if (type == 1) {
			sh2 = new Circle6();
		}else if (type == 2) {
			sh2 = new Triangle6();
		}
		return sh2;
		
	}
	
}
