package com.day16;

import java.util.Scanner;

class Employee {
	protected String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int findPay() {
		return 0;
	}
	
}

class Permanent extends Employee {
	protected int salary;
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int findPay() {
		return salary;
	}
	
	public String type() {
		return "고용직";
	}
	
}

class Temporary extends Employee {
	public int time;
	public int pay;
	
	public int getTime() {
		return time;
	}
	
	public int getPay() {
		return pay;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public int findPay() {
		return time * pay;
	}
	
	public String type() {
		return "임시직";
	}
	
}

class SalesPerson extends Permanent {
	public int earnings;
	public static double RATE = 0.15;
	
	public int getEarnings() {
		return earnings;
	}
	
	public void setEarnings(int earnings) {
		this.earnings = earnings;
	}
	
	public int findPay() {
		return salary + (int)(earnings * RATE);
	}
	
	public String type() {
		return "판매직";
	}
}

public class Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("고용형태 - 고용직(P), 임시직(T), 판매직(S)를 입력하세요.");
		
		String input = sc.nextLine();
		while (true) {
		if (input.equalsIgnoreCase("P")) {
			System.out.println("이름, 기본급여를 입력하세요.");
			String name = sc.nextLine();
			int salary = sc.nextInt();
			System.out.println("---------------------------");
			Permanent p = new Permanent();
			p.setSalary(salary);
			p.setName(name);
			System.out.println("고용형태 : " + p.type());
			System.out.println("이름 : " + name);
			System.out.println("급여 : " + p.findPay());
			
		}else if (input.equalsIgnoreCase("T")) {
			System.out.println("이름, 일한시간, 시간당 급여를 입력하세요.");
			String name = sc.nextLine();
			int time = sc.nextInt();
			sc.nextLine();
			int pay = sc.nextInt();
			System.out.println("---------------------------");
			Temporary t = new Temporary();
			t.setPay(pay);
			t.setName(name);
			t.setTime(time);
			System.out.println("고용형태 : " + t.type());
			System.out.println("이름 : " + name);
			System.out.println("급여: " + t.findPay());
			
		}else if (input.equalsIgnoreCase("S")) {
			System.out.println("이름, 기본급여, 판매수익을 입력하세요.");
			String name = sc.nextLine();
			int salary = sc.nextInt();
			sc.nextLine();
			int earnings = sc.nextInt();
			System.out.println("---------------------------");
			SalesPerson s = new SalesPerson();
			s.setName(name);
			s.setSalary(salary);
			s.setEarnings(earnings);
			System.out.println("고용형태 : " + s.type());
			System.out.println("이름 : " + name);
			System.out.println("급여 : " + s.findPay());
		} else {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println();
			return;
		}
	}

	}

}
