package com.day12;

import java.util.Scanner;

class Triangle3{
	//멤버변수가 있는 클래스
	//1. 멤버변수
	private int width; //10
	private int height; //20
	
	//2. 생성자
	Triangle3(int w, int h){
		width=w;
		height=h;
	}
	
	//3. getter/setter
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int w) {
		width=w;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int h) {
		height=h; 
	}
	
	//4. 메서드
	public int findArea() {
		int area=width*height/2;
		return area;
	}	
}

public class TriangleMain5 {
	
	public static void main(String[] args) {
		//삼각형 면적 구하기
		//[5] 클래스를 만들어서(멤버변수 있는 클래스) 면적 구하는 메서드를 만들고, 이를 이용하여 면적 구한다
		
		//사용자로부터 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 밑변, 높이 입력!");
		int w=sc.nextInt();
		int h=sc.nextInt();
		
		//로직 처리 - 삼각형 면적구하기
		//1)객체 생성
		Triangle3 tr = new Triangle3(w, h); //생성자로 멤버변수의 값 초기화
		
		//2)메서드 호출 - 참조변수.메서드()
		int area=tr.findArea();
		
		//결과 출력
		System.out.println("삼각형 면적 : "+ area);
		
		//멤버변수의 값 변경 - setter이용
		tr.setWidth(10);
		tr.setHeight(30);
		
		System.out.println("\n변경된 밑변:"+ tr.getWidth()+", 높이:"+ tr.getHeight());
		System.out.println("삼각형 면적 : " + tr.findArea());
		
	}

}









