package com.day12;

import java.util.Scanner;

//원을 나타내는 클래스
class Circle{
	//1. 멤버변수
	int radius; //반지름 10, 20
	
	//2. 생성자
	Circle(int r){
		radius=r;
	}
	
	//3. 메서드
	//원의 넓이를 구하는 메서드
	public double findArea() {
		double area=radius*radius*3.14;
		return area;
	}
	
	//원의 둘레를 구하는 메서드
	public double findGirth() {
		double girth = 2*radius*3.14;
		return girth;
	}
}

public class CircleMain {

	public static void main(String[] args) {
		//1. 객체 생성
		Circle c = new Circle(10);
		
		//2. 메서드 호출
		double area=c.findArea();
		System.out.println("원의 면적:"+ area);
		System.out.println("반지름 : " + c.radius);
		
		//원의 둘레 구하기
		double girth=c.findGirth();
		System.out.println("원의 둘레:" + girth);
		
		//멤버변수의 값 변경
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름 입력!");
		int r = sc.nextInt();
		
		c.radius=r; //멤버변수에 값 직접 할당
		area=c.findArea();
		System.out.println("반지름 변경 후 원의 면적:"+ area);
		
	}

}
