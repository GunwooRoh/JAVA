package assignment;

import java.util.Scanner;

class Account8 {
	protected String acc;
	protected int balance;

	public Account8(String acc, int balance) {
		this.acc = acc;
		this.balance = balance;
	}

	public String getAcc() {
		return acc = acc;
	}
	
	public int getBalance() {
		return balance = balance;
	}
	
	public void setAcc(String acc) {
		this.acc = acc;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void display() {
		System.out.println("------------------------------------------");
		System.out.println("계좌번호 : " + acc);
		System.out.println("계좌잔액 : " + balance);
	}
}

class KBAccount8 extends Account8 {
	public int limit;
	public KBAccount8(String acc, int balance, int limit) {
		super(acc, balance);
		this.limit = limit;
	}
	
	public int getLimit() {
		return limit;
	}
	
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public void display() {
		super.display();
		System.out.println("이체한도 : " + limit);
	}
}



public class assignment08_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("계좌번호, 잔액, 이체한도를 입력하세요.");
		String acc = sc.nextLine();
		int balance = sc.nextInt();
		sc.nextLine();
		int limit = sc.nextInt();
		
		KBAccount8 a = new KBAccount8(acc, balance, limit);
		a.display();
		
	}

}
