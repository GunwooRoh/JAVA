package com.day16;

import java.util.Scanner;

class Employee {
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName() {
		this.name = name;
	}
	
	public int findPay() {
		return 0;
	}
	
}

class Permanent {
	protected int salary;
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary() {
		this.salary = salary;
	}
	
	public int findPay() {
		return salary;
	}
	
	public void type() {
		
	}
	
}

class Temporary {
	public int time;
	public int pay;
	
	public int getTime() {
		return time;
	}
	
	public int getPay() {
		return pay;
	}
	
	public void setTime() {
		this.time = time;
	}
	
	public void setPay() {
		this.pay = pay;
	}
	
	public int findPay() {
		return time * pay;
	}
	
}

class SalesPerson extends Permanent {
	public int earnings;
	public static double RATE = 0.15;
	
	public int getEarnings() {
		return earnings;
	}
	
	public void setEarnings() {
		this.earnings = earnings;
	}
	
	public int findPay() {
		return salary + (int)(earnings * RATE);
	}
}

public class Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("고용형태 - 고용직(P), 임시직(T), 판매직(S)를 입력하세요.");
		
		String input = sc.nextLine();
		
		if (input.equalsIgnoreCase("P")) {
			System.out.println("이름, 기본급여를 입력하세요.");
			String name = sc.nextLine();
			int salary = sc.nextInt();
			System.out.println("---------------------------");
			
			System.out.println("고용형태 : " + );
		}

	}

}
