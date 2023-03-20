package assignment;

import java.util.Scanner;

public class assignment03_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("산술연산자를 입력하세요(+, -, *, /, %)");
		String op = sc.nextLine();
		String a = "";
		switch(op) {
		
		case "+" :
		System.out.println("실수를 두 개 입력하세요");
		double c1 = sc.nextDouble();
		double d1 = sc.nextDouble();
		double plus = (c1 + d1);
			a = "결과값: " + plus ;
			break;
			
		case "-" : 
		System.out.println("실수를 두 개 입력하세요");
		double c2 = sc.nextDouble();
		double d2 = sc.nextDouble();
		double minus = (c2 - d2);
			a = "결과값: " + minus;
			break;
			
		case "*" :
		System.out.println("실수를 두 개 입력하세요");
		double c3 = sc.nextDouble();
		double d3 = sc.nextDouble();
		double multiple = (c3 * d3);
			a = "결과값: " + multiple;
			break;
			
		case "/" :
		System.out.println("실수를 두 개 입력하세요");
		double c4 = sc.nextDouble();
		double d4 = sc.nextDouble();
		double divide = (c4 / d4);
			a = "결과값: " + divide;
			break;
			
		case "%" :
		System.out.println("실수를 두 개 입력하세요");
		double c5 = sc.nextDouble();
		double d5 = sc.nextDouble();
		double garbage = (c5 % d5);
			a = "결과값: " + garbage;
			break;
			
		default :
			a = "잘못 입력하셨습니다.";
		}
		
		System.out.println(a);
	}
}	


