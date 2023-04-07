package com.day18.Eaxmple;

import java.util.Scanner;

abstract class Employee {
	protected String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract int getPay();
	
	public abstract String type();

	protected abstract void showInfo();
}

class Permanent extends Employee {
	public int salary;
	public int bonus;
	
	public Permanent(String name, int salary, int bonus) {
		super(name);
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public int getBonus() {
		return bonus;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public int getPay() {
		return salary + bonus;
	}
	
	public void showInfo() {
		System.out.println("기본급여 : " + salary);
		System.out.println("보너스 : " + bonus);
	}
	
	public String type() {
		return "고용직";
	}
}


class Temporary extends Employee {
	public int time;
	public int payy;
	
	public Temporary(String name, int time, int payy) {
		super(name);
		this.time = time;
		this.payy = payy;
	}
	
	public int getTime() {
		return time;
	}
	
	public int getPayy() {
		return payy;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
	public void setPayy(int payy) {
		this.payy = payy;
	}

	public int getPay() {
		 return time * payy;
	}
	
	public void showInfo() {
		System.out.println("일한 시간 : " + time);
		System.out.println("시간당 급여 : " + payy);
	}
	
	public String type() {
		return "임시직";
	}
}
public class InterfaceExample2 {

	public static void main(String[] args) {
		Employee e = null;
		Scanner sc = new Scanner(System.in);
		Employee[] em = new Employee[3];
		for(int i = 0; i < em.length; i++) {
			System.out.println("고용형태 - 고용직(P), 임시직(T)를 입력하세요.");
			String input = sc.nextLine();
			if (input.equalsIgnoreCase("p")) {
				System.out.println("이름, 기본급여, 보너스를 입력하세요.");
				String name = sc.nextLine();
				int salary = sc.nextInt();
				sc.nextLine();
				int bonus = sc.nextInt();
				em[i] = new Permanent(name, salary, bonus);

			}else if (input.equalsIgnoreCase("T")) {
				System.out.println("이름, 일한시간, 시간당 급여를 입력하세요.");
				String name = sc.nextLine();
				int time = sc.nextInt();
				sc.nextLine();
				int payy = sc.nextInt();
				em[i] = new Temporary(name, time, payy);
			}else {
				System.out.println("잘못 입력하셨습니다.");
				return;
			}
			System.out.println("고용형태 : " + em[i].type());
			em[i].showInfo();
			System.out.println("급여 : " + em[i].getPay());
		}
		
	}

}
