package com.day12;

import java.util.Scanner;

class Score{
	int kor;
	int eng;
	int math;

	//생성자
	Score(int k, int e, int m){
		kor = k;
		eng = e;
		math = m;
	}

	//총점, 평균을 구하는 메서드
	public int findSum(){
		int sum = kor+eng+math;
		return sum;
	}

	public float findAverage(){
		int sum = findSum();
		return sum/3f;
	}
}//class

public class ScoreExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();

		Score obj = new Score(kor, eng, math);

		int sum = obj.findSum();
		float average = obj.findAverage();

		System.out.println("\n총점=" +sum+ ", 평균=" + average);
	
	}
}











