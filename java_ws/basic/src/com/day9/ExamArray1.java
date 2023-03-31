package com.day9;

public class ExamArray1 {

	public static void main(String[] args) {
		float[] farr;
		farr=new float[3];
		
		farr[0]=3.15f;
		farr[1]=4.78f;
		farr[2]=8.12f;
		
		for (int i=0;i<farr.length ;i++ ){
			System.out.println("farr["+ i +"]="+farr[i]);
		}
		
		//
		double[] darr={70.5,90,88.3,95.4};

		double sum=0;		
		for (int i=0;i<darr.length ;i++ ){
			sum+=darr[i];
		}
		
		double avg=sum/darr.length;
		System.out.println("\n총점: " + sum + ", 평균: " + avg);
		
		//
		
	}

}
