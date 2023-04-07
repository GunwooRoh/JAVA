package com.day18.Eaxmple;

import java.util.Scanner;

interface IShape {
	void draw();
	void delete();
}

class Circle implements IShape {
	public void draw() {
		System.out.println("원을 그립니다");
	}
	public void delete() {
		System.out.println("원을 지웁니다");
	}	
}

class Rect implements IShape {
	public void draw() {
		System.out.println("사각형을 그립니다");
	}
	public void delete() {
		System.out.println("사각형을 지웁니다");
	}
}

public class InterfaceExample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		IShape[] s = new IShape[3];
		
		for (int i = 0; i < s.length; i++) {
			System.out.println("도형을 선택하세요(1. 원 2. 사각형)");
			int input = sc.nextInt();
			
			switch (input) {
				case 1 :
					s[i] = new Circle();
					break;
				case 2 :
					s[i] = new Rect();
					break;
				default :
					System.out.println("잘못 입력하셨습니다.");
					return;
				}
			}

		System.out.println("-------------for문------------");
		for (int i = 0; i < s.length; i++) {
			s[i].draw();
			s[i].delete();
		}
		
		
		System.out.println("-------------확장 for문------------");
		for (IShape is : s) {
			is.draw();
			is.delete();
		}
		sc.close();
	}

}
