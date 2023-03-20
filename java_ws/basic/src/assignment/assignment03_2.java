package assignment;

import java.util.Scanner;

public class assignment03_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 , 영어, 수학 점수를 입력하세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double avg = (a + b + c) / 3;
		String result1 = "";
		String result2 = "";
       
		if (a < 0 || a > 100 || b < 0 || b > 100 || c < 0 || c > 100) {
            System.out.println("잘못 입력하셨습니다. 1 ~ 100 사이의 숫자를 입력해주세요.");
            return;        
		}if ((avg >= 70)) {
			if ((a >= 50) && (b >= 50) && (c >= 50)) {
			result1  = "합격"; 
			} else if ((a < 50) || (b < 50) || (c < 50)) {
			result1 = "과락";
		}
			}else if (avg < 70) { 
			result1 = "불합격";
		}
			switch ((int)avg/10) {
			case 10 : case 9 :
				result2 = "A";
				break;
			case 8 :
				result2 = "B";
				break;
			case 7 :
				result2 = "C";
				break;
			case 6 : 
				result2 = "D";
				break;
			default :
				result2 = "F";
				break;
			}
			System.out.println("평균 : " + avg + ", 학점 : " + result2 + "\n합격여부 : " + result1);
				
	}
}

