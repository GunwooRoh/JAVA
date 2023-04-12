package com.day10;

import java.util.Arrays;
import java.util.Scanner;

public class LottoTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1. 배열선언
		int[] num=new int[6];
		
		while(true) {
			//2. 6번 반복처리
			for(int i=0;i<num.length;i++) {
				//2-1. 1~45사이의 임의의 숫자 뽑기
				int temp=(int)(Math.random()*45+1);
				
				//2-2. 배열에 저장
				num[i]=temp;
				
				//2-3. 중복 제거
				for(int j=0;j<i;j++) {
					if(num[i]==num[j]) {
						i--; //다시 뽑도록 i값을 1 감소
						break;
					}
				}//안쪽 for
			}//바깥 for
			
			/*
			  				j		i
			  i=1, j=0	num[0] = num[1]
			  
			  i=2, j=0	num[0] = num[2]
			  i=2, j=1	num[1] = num[2]
			  ...
			  i=5, j=0	num[0] = num[5]
			  i=5, j=1	num[1] = num[5]
			  i=5, j=2	num[2] = num[5]
			  i=5, j=3	num[3] = num[5]
			  i=5, j=4	num[4] = num[5]			  
			*/
			
			//3. 배열 요소 정렬
			Arrays.sort(num);
			
			//4. 출력
			for(int n: num) {
				System.out.print(n+" ");
			}
			System.out.println();
			
			System.out.println("그만하려면 Q");
			String quit=sc.nextLine();
			if(quit.equalsIgnoreCase("Q")) break;
		}//while
		
	}

}
