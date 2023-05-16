package com.day16;

import java.util.Scanner;

class Shape7 {
	public double findArea() {
		return 0;
	}

	public String kind() {
		return null;
	}
}

class Circle7 extends Shape7 {
	private int r;
	
	Circle7(int r) {
		this.r = r;
	}
	
	public double findArea() {
		return Math.PI*r*r;
	}
	
	public String kind() {
		return "원";
	}
	
	
}

class Rect7 extends Shape7 {
	private int w, h;
	
	Rect7(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public double findArea() {
		return w*h;
	}
	
	public String kind() {
		return "사각형";
	}
}



public class PolymoArray1 {

	public static void main(String[] args) {
		final int MAX_COUNT = 2;
		Shape7[] shArr = new Shape7[MAX_COUNT];
		int index = 0;
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. 원 2. 사각형 3. 면적출력 4. 종료");
			
			int type = sc.nextInt();
			
			if (type == 1 || type == 2) {
				if(index == MAX_COUNT) {
	                 System.out.println("저장소의 공간이 부족합니다.");
	                 continue;
	               }
				}
			
			switch (type) {
			case 1 : 
				System.out.println("반지름을 입력하세요.");
				int r = sc.nextInt();
				shArr[index++] = new Circle7(r);
				break;
				
			case 2 :
				System.out.println("가로, 세로를 입력하세요.");
				int w = sc.nextInt();
				int h = sc.nextInt();
				shArr[index++] = new Rect7(w, h);
				break;
				
			case 3 : 
				for (int i = 0; i < index; i++) {
				double result =	shArr[i].findArea();
					
				System.out.println(shArr[i].kind() + "의 면적 : " + result);
				}
				return;
					
			case 4 :
				System.out.println("프로그램을 종료합니다.");
				return;
			
			default :
				System.out.println("잘못 출력");
				continue;
			}
		}

	}

}
