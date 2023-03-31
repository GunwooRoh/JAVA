package com.day9;

import java.util.Scanner;

public class ExamMethod2 {

	public static int findArea(int width, int height) {
		int area = width*height;
		return area;
	}

	public static double findArea(int radius) {
		double area = radius*radius*3.14;
		return area;
	}

	public static void main(String[] args) {
		System.out.println("가로, 세로, 반지름을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();	
		int h =sc.nextInt();
		int r = sc.nextInt();

		int area = findArea(w, h);
		double areaCircle = findArea(r);

		System.out.println("\n사각형의 면적 : "+ area);
		System.out.println("원의 면적 : "+ areaCircle);
		
		sc.close();
	}

}