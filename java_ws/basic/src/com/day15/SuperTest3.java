package com.day15;

import java.util.Scanner;

class Employee {
	protected String name;
	
	Employee (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
	}
	
	public int findPay() {
		return 0;
	}
}

class Permanent extends Employee {
	private int salary;
	private int bonus;
	
	Permanent(String name, int salary, int bonus) {
		super(name);
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getBonus() {
		return bonus;
	}
	
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public int findPay() {
		return salary + bonus;
	}
	
	public void showInfo() {
		System.out.println("------------------------");
		System.out.println("고용형태 : 고용직");
		super.showInfo();
	}
}

class Temporary extends Employee {
	private int time;
	private int timePerpay;
	
	Temporary(String name, int time, int timePerpay) {
		super(name);
		this.time = time;
		this.timePerpay = timePerpay;
	}
	
	public int getTime() {
		return time;
	}
	
	public int getTimePerPay() {
		return timePerpay;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
	public void setTimePerPay(int timePerpay) {
		this.timePerpay = timePerpay;
	}
	
	public int findPay() {
		return time * timePerpay;
	}
	
	public void showInfo() {
		System.out.println("------------------------");
		System.out.println("고용형태 : 임시직");
		super.showInfo();
	}
}

public class SuperTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("고용형태 - 고용직(P), 임시직(T)을 입력하세요.");
		
		String a = sc.next();
		String name = null;
		int salary = 0, bonus = 0, time = 0, timePerpay = 0;
		
		if(a.equalsIgnoreCase("P")) {
			System.out.println("이름, 기본급여, 보너스를 입력하세요.");
			System.out.print("이름 : ");
			sc.nextLine();
			name = sc.nextLine();		
			System.out.print("기본급여 : ");
			salary = sc.nextInt();
			System.out.print("보너스 : ");
			bonus = sc.nextInt();
			
			Permanent p = new Permanent(name, salary, bonus);
			
			p.showInfo();
			System.out.println("급여 : " + p.findPay());
			
		} else if(a.equalsIgnoreCase("T")) {
			System.out.println("이름, 일한시간, 시간당 급여를 입력하세요.");
			System.out.print("이름 : ");
			sc.nextLine();
			name = sc.nextLine();		
			System.out.print("일한시간 : ");
			time = sc.nextInt();
			System.out.print("시간당 급여 : ");
			timePerpay = sc.nextInt();
			
			Temporary t = new Temporary(name, time, timePerpay);
			
			t.showInfo();
			System.out.println("급여 : " + t.findPay());
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

}
