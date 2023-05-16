package com.day16;

import java.util.Scanner;

class ShapeManager {
	final int MAX_COUNT = 2;
	Shape7[] shArr = new Shape7[MAX_COUNT];
	int index = 0;
	Scanner sc = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("1. 원 2. 사각형 3. 면적출력 4. 종료");
	}
	
	public  void inputCircle() {
		if(index == MAX_COUNT) {
            System.out.println("저장소의 공간이 부족합니다.");
            return;
          }
		
		System.out.println("반지름을 입력하세요.");
		int r = sc.nextInt();
		shArr[index++] = new Circle7(r);
	}
	
	public  void inputRect() {
		if(index == MAX_COUNT) {
            System.out.println("저장소의 공간이 부족합니다.");
            return;
          }
		System.out.println("가로, 세로를 입력하세요.");
		int w = sc.nextInt();
		int h = sc.nextInt();
		shArr[index++] = new Rect7(w, h);
	}
	
	public  void printArea() {
		if(index == 0) {
			System.out.println("\n데이터가 존재하지 않습니다.");
			return;
		}
		
		for (int i = 0; i < index; i++) {
			double result =	shArr[i].findArea();
				
			System.out.println(shArr[i].kind() + "의 면적 : " + result);
			}
}

public class PolymoArray3 {
	
	}
	
	public static void main(String[] args) {
		ShapeManager manager = new ShapeManager();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("1. 원 2. 사각형 3. 면적출력 4. 종료");
			int type = sc.nextInt();
			
			if (type == 1 || type == 2) {
				
				}
			
			switch (type) {
			case 1 : 
				manager.inputCircle();
				break;
				
			case 2 :
				manager.inputRect();
				break;
				
			case 3 : 
				manager.printArea();
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