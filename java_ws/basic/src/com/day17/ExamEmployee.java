package com.day17;

import java.util.Scanner;

class Employee{	
	protected String name;

	public Employee(String name){
		this.name = name;
	}
	
	public void setName(String name){
			this.name = name;
	}
	
	public String getName(){
			return this.name;
	}
	
	public int findPay(){
		return 0;
	}
}//

class Permanent extends Employee{	
	protected int salary; //기본급여

	public Permanent(String name, int salary){
		super(name);
		this.salary = salary;
	}	
	
	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int findPay(){
		return salary;
	}	
}//

class Temporary extends Employee{	
	private int time; //일한시간
	private int pay;  //시간당 급여

	public Temporary(String name, int time, int pay){
		super(name);
		this.time = time;
		this.pay = pay;
	}	
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int findPay(){
		return time*pay;
	}	
}//

class SalesPerson extends Permanent{	
	private final double RATE = 0.15;

	private int earnings; //판매수익

	public SalesPerson(String name, int salary, int earnings){
		super(name, salary);
		this.earnings = earnings;
	}
		
	public int getEarnings() {
		return earnings;
	}

	public void setEarnings(int earnings) {
		this.earnings = earnings;
	}

	public int findPay(){
		return (int)(salary+(earnings*RATE));
	}
}//

public class ExamEmployee {
	public static void main(String[] args){
		//배열 요소 3개
		//1. 모든 직원의 findPay() 호출
		//2. 자식만의 메서드 getSalary(), getEarnings()호출
		//for, 확장 for 이용
		Scanner sc = new Scanner(System.in);
		Employee[] e = new Employee[3];
		e[0] = new Permanent("a", 100000);
		e[1] = new Temporary("b", 10, 200000);
		e[2] = new SalesPerson("c", 300000, 400000);
		for (int i = 0; i < e.length; i++) {
			System.out.println("이름 : " + e[i].getName());
			System.out.println("급여 : " + e[i].findPay());
			System.out.println("----------------------------");
		}	
		for (int i = 0; i < e.length; i++) {
			if(e[i] instanceof Permanent) {
				Permanent p = (Permanent)e[i];
				System.out.println("급여 : " + p.getSalary());
			} else if(e[i] instanceof Temporary) {
				Temporary t = (Temporary)e[i];
				System.out.println("일한 시간 : " + t.getTime());
			} else if(e[i] instanceof SalesPerson) {
				SalesPerson s = (SalesPerson)e[i];
				System.out.println("판매수익 : " + s.getEarnings());
			} 
			
			System.out.println("----------------------------");
		}
		
		for (Employee em : e) {
			if(em instanceof Permanent) {
				Permanent p = (Permanent)em;
				System.out.println("급여 : " + p.getSalary());
			} else if(em instanceof Temporary) {
				Temporary t = (Temporary)em;
				System.out.println("일한 시간 : " + t.getTime());
			} else if(em instanceof SalesPerson) {
				SalesPerson s = (SalesPerson)em;
				System.out.println("판매수익 : " + s.getEarnings());
			} 
		}
		
		
	}
}
