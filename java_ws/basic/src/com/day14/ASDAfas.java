package com.day14;

import java.util.Scanner;


class Rect {
	private int width;
	private int height;
	
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
	
	public int getArea() {
		return width * height;
	}
	
	public void result() {
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
		System.out.println("넓이 : " + width * height);
	}
}

public class ASDAfas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* Rect[] rects = new Rect[4];
		for (int i = 0; i < rects.length; i++) {
			System.out.println("사각형 " + (i + 1) + "의 정보를 입력하세요.");
			System.out.print("가로 입력 : ");
			int width = sc.nextInt();
			sc.nextLine();
			System.out.print("세로 입력 : ");
			int height = sc.nextInt();
			
			rects[i] = new Rect();
			rects[i].setWidth(width);
			rects[i].setHeight(height);
			
			rects[i].result();
			System.out.println();
		}
		*/
		
		/*System.out.print("가로 입력 : ");
		int width = sc.nextInt();
		sc.nextLine();
		System.out.print("세로 입력 : ");
		int height = sc.nextInt();
		
		Rect r = new Rect();
		r.setWidth(width);
		r.setHeight(height);
		
		r.result();
		*/
		
		Rect[] rects = new Rect[100];
		int count = 0;
		 while (true) {
	            System.out.println("1. 사각형 정보 입력");
	            System.out.println("2. 저장된 전체 사각형 면적 조회");
	            System.out.println("3. 종료");
	            System.out.print("선택하세요 : ");
	            int choice = sc.nextInt();
	            sc.nextLine();

	            if (choice == 1) {
	                if (count == rects.length) { 
	                    System.out.println("배열이 가득 찼습니다.");
	                    continue;
	                }

	                System.out.println("사각형 " + (count + 1) + "의 정보를 입력하세요.");
	                System.out.print("가로 입력 : ");
	                int width = sc.nextInt();
	                sc.nextLine();
	                System.out.print("세로 입력 : ");
	                int height = sc.nextInt();

	                Rect rect = new Rect(); 
	                rect.setWidth(width);
	                rect.setHeight(height);
	                rects[count] = rect;
	                count++;

	                rect.result();
	                System.out.println();
	            } else if (choice == 2) {
	                if (count == 0) {
	                    System.out.println("저장된 사각형이 없습니다.");
	                    continue;
	                }

	                int totalArea = 0;
	                for (int i = 0; i < count; i++) {
	                    totalArea += rects[i].getArea();
	                }

	                System.out.println("저장된 전체 사각형의 면적 : " + totalArea);
	                System.out.println();
	            } else if (choice == 3) {
	                System.out.println("프로그램을 종료합니다.");
	                break;
	            } else {
	                System.out.println("잘못된 선택입니다.");
	                System.out.println();
	            }
	        }
		
	}

}
