package assignment;

import java.util.Scanner;

public class assignment03_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int a = sc.nextInt();
		String str = "";
		if ((a % 2) == 1) {
			str = "홀수";
		} else {
			str = "짝수";
		}
		System.out.println("입력한 정수 : " + a + ", " + str);
		System.out.println("\n삼항 연산자 이용 결과 =>" + str);

	}

}
