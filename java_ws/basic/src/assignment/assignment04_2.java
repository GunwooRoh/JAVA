package assignment;

import java.util.Scanner;

public class assignment04_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("4자리 이상의 숫자를 입력하세요");
		String str = sc.nextLine();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - 48;
			
		}
			System.out.println("sum = " + sum);
		
		System.out.println("------------------");
		System.out.println("4자리 이상의 숫자를 입력하세요");
		int num = sc.nextInt();
		sum = 0;
		for (;;) {
			 sum += num % 10;
			 num /= 10;
			 if (num < 10) {
				 sum += num;
				 break;
			 }
		}
			System.out.println("sum = " + sum);
			
			System.out.println("------------------");
			System.out.println("4자리 이상의 숫자를 입력하세요");
			sc.nextLine();
			String value = sc.nextLine();
			char ch = ' ';
			boolean isNumber = true;

			
			for (int i = 0; i < value.length(); i++) {
				ch = value.charAt(i);
				if(!(ch >= '0' && ch <= '9')) {
					isNumber = false;
					break;
				}
			}
			str = "";
			if (isNumber) {
				str = "숫자입니다";
			} else {
				str = "숫자가 아닙니다";
			}
			System.out.println(str);
	
	}
	

}
