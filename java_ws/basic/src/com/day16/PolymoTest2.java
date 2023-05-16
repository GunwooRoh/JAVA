package com.day16;

class Shape6 {
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

class Circle6 extends Shape6 {
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


class Triangle6 extends Shape6 {
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

public class PolymoTest2 {

	public static void main(String[] args) {
		Circle6 c = new Circle6();
		c.draw();
		c.delete();
		c.sayCircle();
		c.display();
		
		
		System.out.println("\n-----------------다형성 이용-----------------");
		Shape6 sh = new Circle6();
		sh.draw();
		sh.delete();
		sh.display();
		
		System.out.println("\n-----------------");
		sh = new Triangle6();
		sh.draw();
		sh.delete();

	}

}
