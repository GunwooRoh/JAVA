package com.day18;

import java.util.Scanner;

class Shape {
	public double findArea() {
		return 0.0;
	}
}//

class Circle1 extends Shape {
	final double PI = 3.14;
	private int r;

	public Circle1(int r){
		this.r = r;
	}

	public double findArea() {
		return  PI*r*r;
	}

	public void showCircle(){
		System.out.println("Circle1의 메서드!");
	}
}//

class Rect1 extends Shape {
	private int w;
	private int h;

	public Rect1(int w, int h){
		this.w =w;
		this.h = h;
	}
	public double findArea() {
		return w*h;
	}
	public void showRect(){
		System.out.println("Rect1의 메서드!");
	}
}//

class JavaExam1 {
	public static void main(String[] args) {
		//1) Shape배열을 만들고, 요소 4개를 저장한 후, 각 요소의 오버라이딩 메서드 호출
		Scanner sc = new Scanner(System.in);
		Shape[] s = new Shape[4];
		for (int i = 0; i < s.length; i++) {
			System.out.println("1. 원 2. 사각형");
			int input = sc.nextInt();
			switch (input) {
			case 1 :
				System.out.println("반지름 입력");
				int r = sc.nextInt();
				s[i] = new Circle1(r);
				s[i].findArea();
				break;

			case 2:
				System.out.println("가로, 세로 입력");
				int w = sc.nextInt();
				int h = sc.nextInt();
				s[i] = new Rect1(w, h);
				s[i].findArea();
				showCircle();
				break;
				
			default :
				System.out.println("잘못입력");
				return;
			}
		}
		for (int i = 0; i < s.length; i++) {
			
		}
		//2) 각 요소의 자식클래스만의 메서드 호출
		

	}

	private static void showCircle() {
		// TODO Auto-generated method stub
		
	}
}

