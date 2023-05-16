package com.day19.etc;

abstract class Shape {
	private Point p;

	Shape() {
		this(new Point(0,0));
	}

	Shape(Point p) {
		this.p = p;
	}

	Point getP() {
		return p;
	}

	void setP(Point p) {
		this.p = p;
	}

	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
}

class Point {
	private int x;
	private int y;

	Point() {
		this(0,0);
	}

	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public String findInfo() {
		return "["+x+","+y+"]";
	}
}

class Rect extends Shape {
	private double width;
	private double height;

	Rect(double width, double height) {
		this(new Point(0,0), width, height);
	}

	Rect(Point p, double width, double height) {
		super(p); 
		this.width = width;
		this.height = height;
	}

	boolean isSquare() {
		// width나 height가 0이 아니고 width와 height가 같으면 true를 반환한다.
		return width*height!=0 && width==height;
	}

	double calcArea() {
		return width * height;
	}
}

class Circle extends Shape {
	private double r; // 반지름

	Circle(double r) {
		this(new Point(0,0),r); // Circle(Point p, double r)를 호출
	}

	Circle(Point p, double r) {
		super(p); 
		this.r = r;
	}

	double calcArea() {
		return Math.PI * r * r;
	}
}

public class ShapeExam {
	public static double sumArea(Shape[] arr) {
		double sum = 0;
		for(int i=0; i < arr.length;i++) {
			sum+= arr[i].calcArea();
		}
		
		return sum;
	}

	public static void main(String[] args){
		Circle c = new Circle(10);
		double area=c.calcArea();
		System.out.println("원의 면적 : " + area);
		
		Rect rect = new Rect(20, 30);
		area=rect.calcArea();
		System.out.println("사각형의 면적 : " + area+"\n");
		
		Circle c2 = new Circle(new Point(5, 6), 10);
		System.out.println("원의 면적 : " + c2.calcArea());
		
		Rect rect2 = new Rect(new Point(7, 8),20, 30);
		System.out.println("사각형의 면적 : " + rect2.calcArea()+"\n");
		
		
		Shape[] arr = {new Circle(5.2), new Rect(3, 4), new Circle(1)};
		System.out.println("면적의 합:"+sumArea(arr));
	}

}










