package com.day12;

import java.util.Scanner;

public class TriangleMain2 {
	public static int findArea(int w, int h) {
		int area=w*h/2;
		return area;
	}
	
	public static void main(String[] args) {
		//삼각형 면적 구하기
		//[2] 메서드만 만들어서 메서드 호출하여 면적 구한다
		
		//사용자로부터 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 밑변, 높이 입력!");
		int w=sc.nextInt();
		int h=sc.nextInt();
		
		//로직 처리 - 삼각형 면적구하기
		int area=findArea(w, h);
		
		//결과 출력
		System.out.println("삼각형 면적 : "+ area);
		
	}

}
