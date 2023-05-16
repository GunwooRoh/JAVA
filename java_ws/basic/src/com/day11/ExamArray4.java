package com.day11;

import java.util.Scanner;

public class ExamArray4 {

	public static void main(String[] args) {
		int[][] arr = {			
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30},
				{45, 45,45, 45,45}
		};

		int total = 0;
		float average = 0;
		for(int i=0; i < arr.length;i++) {
			for(int j=0; j < arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				total += arr[i][j];
			}
			System.out.println();
		}

		average = (float)total /(arr.length * arr[0].length);

		System.out.println("\n총합 : "+total);
		System.out.println("평균 : "+average);

		//

		// 큰 금액의 동전을 우선적으로 거슬러 줘야 한다.
		int[] coinUnit = {500, 100, 50, 10};

		int money = 3870;
		System.out.println("money="+money+"\n");

		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"원: "+money/coinUnit[i]);
			//money = money%coinUnit[i];
			money %= coinUnit[i];
		}

		//
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
					'(',')','-','_','+','=','|','[',']','{',
					'}',';',':',',','.','/'};
						// 0   1   2   3   4   5   6   7   8   9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		String src = "abc123";
		String result = "";
		
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			if(ch>='a' && ch <='z') {
				result += abcCode[ch-'a']; //'a'=> 97-97=>0
			} else if(ch>='0' && ch <='9') {
				result += numCode[ch-'0']; //'0' => 48-48=>0
			}
		}
		
		System.out.println("src:"+src);
		System.out.println("result:"+result);

		//
		int fstScore=0;//1등 점수
		int sndScore=0; //2등 점수

		Scanner sc = new Scanner(System.in);
		int[] stArr = new int[10];
		for (int i=0;i<stArr.length ; i++){
			System.out.println("점수를 입력하세요");
			stArr[i] = sc.nextInt();

			if (stArr[i]>fstScore){
				sndScore = fstScore;
				fstScore=stArr[i];
			}else if(stArr[i]>sndScore){
				sndScore=stArr[i];
			}
		}//for
		System.out.println("A학점은 "+ sndScore +"점 이상이 되어야 합니다.\n");
	}

}
