package com.day13;

class BankAccount {
	private int balance;
	public static final double INTEREST = 0.03;
	private static int totalBalance;
	
	BankAccount(int balance){
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balace) {
		this.balance = balance;
	}
	
	public static int getTotalBalance() {
		return totalBalance;
	}
	
	public static void setTotalBalance(int totalBalance) {
		BankAccount.totalBalance = totalBalance;
	}
	
	public void findTotal() {
		totalBalance += balance;
	}
	
}

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount(50000);
		BankAccount ba2 = new BankAccount(100000);
		ba1.findTotal();
		ba2.findTotal();
		
		System.out.println("계좌 1의 원금 : " + ba1.getBalance());
		System.out.println("계좌 2의 원금 : " + ba2.getBalance());
		System.out.println("전 계좌의 원금 합계 : " + BankAccount.getTotalBalance());
		System.out.println("이자율 : " + BankAccount.INTEREST);
		
	}

}
