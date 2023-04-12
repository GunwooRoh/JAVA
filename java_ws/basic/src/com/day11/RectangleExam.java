package com.day11;

import java.util.Scanner;

class Rectangle{
	double width, height; //10, 20

	public double findArea(){	// 넓이 구하기
		return width * height;
	}

	public double findGirth(){	// 둘레 구하기
		return (width + height)*2;
	}
}

public class RectangleExam {

	public static void main(String[] args) {
		System.out.println("사각형의 가로, 세로를 입력하세요");
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble();
		double h = sc.nextDouble();

		Rectangle r = new Rectangle();
		r.width=w;
		r.height=h;
		
		double area=r.findArea();
		System.out.println("사각형의 넓이 : " + area);
		System.out.println("사각형의 둘레 : " + r.findGirth());
	}

}









