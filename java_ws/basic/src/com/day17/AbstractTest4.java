package com.day17;

import java.util.Scanner;

abstract class Shape0 {
	public abstract double findArea(); 
	
	public abstract void display(); 
	
}

class Circle0 extends Shape0 {
	public int radius;
	
	Circle0(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double findArea() {
		return 3.14 * radius * radius;
	}

	public void display() {
		System.out.println("원의 면적: " + Math.round(findArea() * 100) / 100.0);
	}
}

class Rect0 extends Shape0 {
	public int width, height;
	
	Rect0(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public double findArea() {
		return width * height;
	}
	
	public void display() {
		System.out.println("사각형의 넓이 : " + Math.round(findArea()));
	}
}

public class AbstractTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape0 s[] = new Shape0[3];
			while (true) {
			for (int i = 0; i < s.length; i++) {
			System.out.println("도형을 선택하세요 (1. 원, 2. 사각형)");
			int input = sc.nextInt();

			if (input == 1) {
				System.out.println("반지름 입력");
				int radius = sc.nextInt();
				s[i] = new Circle0(radius);
				s[i].findArea();
				for(int i2 = 0; i2 < s.length; i2++) {
					if(s[i2] instanceof Circle0) {
						Circle0 c = (Circle0)s[i2];
						c.display();

					}else if (input == 2) {
						System.out.println("가로, 세로 입력");
						int width = sc.nextInt();
						sc.nextLine();
						int height = sc.nextInt();
						for (Shape0 i3 : s) {
							if(i3 instanceof Rect0) {
								Rect0 r = (Rect0)i3;
								r.display();
							}
						}

					}else {
						System.out.println("잘못입력하셨습니다.");
						continue;
					}
				}
				}
			}	

			sc.close();
		}
	}
}

