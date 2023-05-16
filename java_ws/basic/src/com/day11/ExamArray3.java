package com.day11;

import java.util.Scanner;

public class ExamArray3 {

	public static void main(String[] args) {
		int[][] arr=new int[3][3];
		for(int i=0; i < arr.length;i++) {
			for(int j=0; j < arr[i].length;j++) {
				if (i==j)
					arr[i][j]=1;
			}
		}//for

		for(int i=0; i < arr.length;i++) {
			for(int j=0; j < arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}//for

		//
		System.out.println();
		int[][] arr2=new int[5][5];
		for(int i=0; i < arr2.length;i++) {
			for(int j=0; j < arr2[i].length;j++) {
				//if (i==j || i+j==2)
				if (i==j || i+j==arr2.length-1)
					arr2[i][j]=1;
			}
		}//for
				
		for(int i=0; i < arr2.length;i++) {
			for(int j=0; j < arr2[i].length;j++) {
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}//for
		System.out.println();
		
		//
		Scanner sc = new Scanner(System.in);
		int[] num = new int[8];
		String str ="";

		while(true)	{
			System.out.println("복권판매점 번호(1~8)와 복권 판매량을 입력하세요.(끝낼때는 Q)");
			str = sc.nextLine();
			
			if (str.equalsIgnoreCase("Q")) break;	
			
			int gNo = Integer.parseInt(str);
			int quantity = sc.nextInt();
			sc.nextLine();
			
			num[gNo-1] += quantity;

			System.out.println("그룹번호 : " + gNo 
					+ ", 판매량:" + num[gNo-1]);
		}//while
		
		//
		
		
	}

}
