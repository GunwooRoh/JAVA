package com.day17;

import java.util.Scanner;

abstract class Shape {
	public void draw() {
		}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("원을 그립니다.");
	}
}	

class Rect extends Shape {
	public void draw() {
		System.out.println("사각형을 그립니다.");
	}
}

public class AbstractTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("도형을 선택하세요 (1. 원, 2. 사각형)");
		int input = sc.nextInt();
		Shape s = null;
		if (input == 1) {
			s = new Circle();
			s.draw();
			
		}else if (input == 2) {
			s = new Rect();
			s.draw();
			
		}else {
			System.out.println("잘못입력");
		}

	}

}
