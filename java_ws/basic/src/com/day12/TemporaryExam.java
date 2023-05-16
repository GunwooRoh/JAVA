package com.day12;

import java.util.Scanner;

class Temporary{	
	private String name;
	private int time; //일한시간
	private int pay;  //시간당 급여

	public Temporary(String name, int time, int pay){
		this.name = name;
		this.time = time;
		this.pay = pay;
	}

	public String getName()	{
		return this.name; 
	}
	
	public void setName(String name){
		this.name = name;
	}

	public void setTime(int time){
		this.time = time;	
	}
	
	public int getTime(){
		return this.time;
	}
	
	public void setPay(int pay){
		this.pay = pay;	
	}
	
	public int getPay()	{
		return this.pay;
	}
	
	public int calcPay(){
		return time*pay;
	}
}//

public class TemporaryExam {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 일한시간, 시간당 급여를 입력하세요");
		String name = sc.nextLine();
		int time = sc.nextInt();
		int pay =sc.nextInt();

		System.out.println("----------------------------------------");
		Temporary t = new Temporary(name, time, pay);

		System.out.println("고용형태: 임시직");
		System.out.println("이름:"+t.getName());
		System.out.println("급여:"+t.calcPay());		
	}
}
