package assignment;

import java.util.Scanner;

class Account4 {
	protected String num;
	protected double balance;
	
	public Account4(String num, double balance) {
		this.num = num;
		this.balance = balance;
	}
	
	public void deposit(double money) {
		balance += money;
	}
	
	public void withdraw(double money) {
		balance -= money;
	}
	
	public void display() {
		System.out.println("--------------------------------");
		System.out.println("계좌번호 : " + num);
		System.out.println("계좌잔액 : " + balance);
	}
}

class FaithAccount extends Account4 {
	public FaithAccount(String num, double balance) {
		super(num, balance);
	}
	
	public void deposit (double money) {
		balance += money + money * 0.01;
	}
	
}

class ContriAccount extends Account4 {
	private double contribution;
	
	public ContriAccount(String num, double balance) {
		super(num, balance);
		this.contribution = balance * 0.01;
	}
		
	public void withdraw(double money) {
		balance -= balance - balance * 0.01;
	}
	
	public void contribution() {
		double contribution = balance * 0.01;
	}
	
	public void display() {
		System.out.println("--------------------------------");
		System.out.println("잔액 : " + balance * 0.99);
		System.out.println("총 기부액 : " + contribution);
	}
	
	public void deposit(double money) {
		super.deposit(money * 0.99);
		contribution += money * 0.01;
	}
}



public class assignment09_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("개설할 계좌 종류 - 일반계좌<A>, 신용계좌<F>, 기부계좌<C>, 계좌번호, 잔액을 입력하세요.");
		String type = sc.nextLine();
		String num = sc.nextLine();
		int balance = sc.nextInt();
		
		if (type.equalsIgnoreCase("A")) {
			Account4 acc = new Account4(num, balance);
			acc.display();
			System.out.println("--------------------------------");
			System.out.println("입금할 금액을 입력하세요.");
			double money = sc.nextDouble();
			acc.deposit(money);
			acc.display();
			
		}else if (type.equalsIgnoreCase("F")) {
			FaithAccount facc = new FaithAccount(num, balance);
			facc.display();
			System.out.println("--------------------------------");
			System.out.println("입금할 금액을 입력하세요.");
			double money = sc.nextDouble();
			facc.deposit(money);
			facc.display();
		
		}else if (type.equalsIgnoreCase("C")) {
			ContriAccount cacc = new ContriAccount(num, balance);
			cacc.display();
			System.out.println("--------------------------------");
			System.out.println("입금할 금액을 입력하세요.");
			double money = sc.nextDouble();
			cacc.deposit(money);
			cacc.contribution();
			cacc.display();
		
		}else {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
	}

}
