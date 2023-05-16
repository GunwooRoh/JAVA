package com.day21;

import java.util.ArrayList;
import java.util.Scanner;

class Score {
	private int sum;
	private double average;
	
	public int getSum() {
		return sum;
	}
	
	public double getAverage() {
		return average;
	}
	
	public void setSum() {
		this.sum = sum;
	}
	
	public void setAverage() {
		this.average = average;
	}
	
	public void findTotal(ArrayList<Integer> list) {
		sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
	}
	
	public void findAverage(ArrayList<Integer> list) {
		findTotal(list);
		
		average = (double)sum / list.size();
	}
}

public class ArrayListScore {

	public static void main(String[] args) {
		try {	
			Scanner sc = new Scanner(System.in);
			Score s = new Score();
	
			System.out.println("점수를 입력하세요.");
	
			ArrayList<Integer> list = new ArrayList<> ();
			for (int i = 0; i < 3; i++) {
				list.add(sc.nextInt());
			}
			System.out.print("국어, 영어, 수학 점수 : ");
			for (int i : list) {
				System.out.print(i + " ");
			}
	
			System.out.println();
	
			s.findTotal(list);
			s.findAverage(list);
	
			System.out.println("총점 : " + s.getSum());
			System.out.println("평균 : " + s.getAverage());
		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다." + e.getMessage());
		}
			
	}

}
