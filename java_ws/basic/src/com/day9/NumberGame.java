package com.day9;

import java.util.Scanner;

public class NumberGame {
	//1~100사이의 임의의 값을 구하는 메서드
	public static int rnd(){
		int answer=(int)(Math.random()*100+1);
		return answer;
	}
	
	//특정 숫자 사이의 임의의 값을 구하는 메서드
	public static int rnd2(int start, int end){
		int answer=(int)(Math.random()* (end-start+1) + start);
		return answer;
	}
	
	public static void main(String[] args) {	
		//1. 1~100사이의 임의의 값을 구한다 - 정답
		//int answer=rnd();
		int answer=rnd2(1, 100);
		System.out.println(answer);
		
		Scanner sc = new Scanner(System.in);
		//2. 4번 반복 처리
		for(int i=0;i<4;i++) {
			//2-1. 사용자로 부터 숫자 입력받기
			System.out.println("1~100사이의 숫자를 입력하세요");
			int num=sc.nextInt();
			
			//2-2. 정답과 사용자값 비교
			String result="";
			if(num==answer) {
				System.out.println("정답입니다."); 
				break;
			}
			
			if(i==3) {
				result="실패! 다음 기회에, 정답은 " + answer;
			}else {
				if(num>answer) {
					result="너무 큽니다. 조금 더 작은 수를 입력하세요\n";
				}else {
					result="더 큰수를 입력하세요\n";				
				}
			}
			
			//2-3. 결과 출력
			System.out.println(result);
		}//for
		
		
	}

}
