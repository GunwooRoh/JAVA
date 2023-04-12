package com.day12;

import java.util.Scanner;

class Triangle{
	//멤버변수가 없는 클래스
	public int findArea(int w, int h) {
		int area=w*h/2;
		return area;
	}	
}

public class TriangleMain3 {
	
	public static void main(String[] args) {
		//삼각형 면적 구하기
		//[3] 클래스를 새로 만들어서 면적 구하는 메서드를 만들고, 이를 이용하여 면적 구한다
		
		//사용자로부터 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 밑변, 높이 입력!");
		int w=sc.nextInt();
		int h=sc.nextInt();
		
		//로직 처리 - 삼각형 면적구하기
		//1)객체 생성
		Triangle tr = new Triangle();
		
		//2)메서드 호출 - 참조변수.메서드()
		int area=tr.findArea(w, h);
		
		//결과 출력
		System.out.println("삼각형 면적 : "+ area);
		
	}

}
