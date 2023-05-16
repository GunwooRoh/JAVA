package com.day13;

import java.util.Scanner;

class Score{
   private int kor;
   private int eng;
   private int math;
   
   private int sum;
   private double average;

   //생성자
   Score(int k, int e, int m){
      this.kor = k;
      this.eng = e;
      this.math = m;
   }

   //총점, 평균을 구하는 메서드
   
   public int getSum() {
	   return sum;
   }
   
   public double getAverage() {
	   return average;
   }
   
   public void findSum() {
	   sum = kor + eng + math;
   }
   
   public void findAverage(){
      average = sum / 3;
     
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

      obj.findSum();
      obj.findAverage();

      System.out.println("\n총점=" + obj.getSum() + ", 평균=" + obj.getAverage());
   
   }
}
