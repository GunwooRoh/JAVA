package com.day16;

class Shape {
	public void draw() {
		System.out.println("도형을 그리는 메서드");
	}
	
	public void delete() {
		System.out.println("도형을 지우는 메서드");
	}

	public void display() {
		System.out.println("부모 shape display() 메서드");
	}
}

class Circle extends Shape {
	public void draw () {
		System.out.println("원을 그린다");
	}
	
	public void delete() {
		System.out.println("원을 지운다");
	}
	
	public void sayCircle() {
		System.out.println("원");
	}
}


class Triangle extends Shape {
	public void draw () {
		System.out.println("삼각형을 그린다");
	}
	
	public void delete() {
		System.out.println("삼각형을 지운다");
	}
	
	public void sayTriangle() {
		System.out.println("삼각형");
	}
}

public class ClassArgsTest {
	public static double mul(int a, double b) {
		return a*b;
	}
	
	//1. 매개변수가 클래스인 경우
	public static void func1(Circle c) {
		//참조변수가 보이면 참조변수.
		c.draw();
		c.delete();
		c.sayCircle();
	}
	
	//2. 매개변수의 다형성
	public static void func2(Shape sh) {
		sh.draw();
		sh.delete();
	}
	
	//3. 반환타입이 클래스인 경우
	public static Circle func3() { //반환타입이 Circle(클래스)이면 Circle객체가 리턴된다
		Circle c = new Circle();
		return c;
	}
	
	public static Shape func4(int type) {
		Shape sh = null;
		if (type == 1) {
			sh = new Circle();
		}else if (type == 2) {
			sh = new Circle();
		}
		return sh;
	}
	
	//4. 반환타입에 다형성 이용
	
	
	public static void main(String[] args) {
		/*
		 메서드의 매개변수가 int면 main에서 int값을 넣는다
		 				 String이면  String값을 넣는다
		 				 Circle이면  Circle을 넣는다
		 				 	어떻게 넣나? new로 객체 생성해서 넣는다
		 				 	
		*/
		//1) 매개변수가 클래스인 경우
		func1(new Circle());
		
		//2) 매개변수의 다형성
		func2(new Triangle());
		Circle c = new Circle();
		func2(c);
		
		//3) 반환타입이 클래스
		Circle c2 = func3();
		c2.draw();
		
		//4) 반환타입에 다형성이 이용된 경우
		int t = 2;
		Shape sh = func4(t);
		sh.delete();
	}

}
