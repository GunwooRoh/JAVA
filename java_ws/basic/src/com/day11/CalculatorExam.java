package com.day11;

import java.util.Scanner;

class Calculator{
	public double add(double a, double b){	// 덧셈
		return a+b;
	}

	public double subtract(double a, double b){	// 뺄셈
		return a-b;
	}

	public double multiply(double a, double b){	// 곱셈
		return a*b;
	}

	public double divide(double a, double b){	// 나눗셈
		return a/b;
	}
}

public class CalculatorExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두실수를 입력하세요");
		double a = sc.nextDouble();
		double b = sc.nextDouble();

		Calculator ca = new Calculator();
		double res=ca.add(a, b);
		System.out.println("a=" +a +",b="+ b);
		System.out.println("a+b = "+ res);
		
		System.out.println("a-b = "+ ca.subtract(a, b));
		System.out.println("a*b = "+ ca.multiply(a, b));
		System.out.println("a/b = "+ ca.divide(a, b));
	}

}
