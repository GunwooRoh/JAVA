package com.day14;

import java.util.Scanner;

class Score {
	private int[] subject;
	
	Score(int[] subject) {
		this.subject = subject;
	}
	
	public int[] getSubject() {
		return subject;
	}
	
	public void setSubject(int[] subject) {
		this.subject = subject;
	}
	
	
	public int findSum() {
		int sum = 0;
		for (int i = 0; i < subject.length; i++) {
			sum += subject[i];
		}
		
		return sum;
	}
	
	public double findAverage() {
		int sum = findSum();
		return (double)sum/subject.length;
	}

}



public class ScoreArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		System.out.println("국어, 영어, 수학 점수를 입력하세요.");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		Score score = new Score(arr);
		
		System.out.println("총점 : " + score.findSum());
		System.out.println("평균 : " + score.findAverage());
		
		int[] subject = score.getSubject();
		for(int i = 0; i < arr.length; i++) {
			System.out.println(subject[i] + " ");
		}

	}

}
