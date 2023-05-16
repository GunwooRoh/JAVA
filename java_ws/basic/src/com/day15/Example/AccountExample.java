package com.day15.Example;

import java.util.Scanner;

class Account3 {
	private int balance;
	private double interest_rate = 0.02;
	
	public int getBalance() {
		return balance;
	}
	
	public double getInterest_Rate() {
		return interest_rate;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void setInterest_Rate(double interest_rate) {
		this.interest_rate = interest_rate;
	}
	
	public void showInfo() {
		System.out.println("원금 : " + balance + "\t이자율 : " + interest_rate + "\t이자 : " + balance*interest_rate);
	}
}

public class AccountExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입금할 금액을 입력하세요.");
		int balance = sc.nextInt();
		
		Account3 acc = new Account3();
		acc.getBalance();
		
		System.out.println("---------------------------");
		acc.showInfo();

	}

}
