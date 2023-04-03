package assignment;

import java.util.Scanner;

class Account {
	protected String account;
	protected int balance;
	
   public String getAccount() {
	   return account;
   }
   
   public int getBalance() {
	   return balance;
   }
   
   public void setAccount(String account) {
	   this.account = account;
   }
   
   public void setBalance(int balance) {
	   this.balance = balance;
   }
   
}

class KBAccount extends Account {
	private int limit;
	
	public int getLimit() {
		return limit;
	}
	
	public void setLimit(int limit) {
		this.limit = limit;
	}	
	
	public void showInfo() {
		System.out.println("계좌번호 : " + account);
		System.out.println("계좌잔액 : " + balance);
		System.out.println("이체한도 : " + limit);
		
	}
	
}


public class assignment07_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		KBAccount acc = new KBAccount();
		
		System.out.println("계좌번호, 잔액, 이체한도를 입력하세요.");
		System.out.print("계좌번호 : ");
		String account = sc.nextLine();
		System.out.print("잔액 : ");
		int balance = sc.nextInt();
		System.out.print("이체한도 : ");
		int limit = sc.nextInt();
		
		System.out.println("-----------------------------------");
		
		acc.setAccount(account);
		acc.setBalance(balance);
		acc.setLimit(limit);
		
		acc.showInfo();

	}

}
