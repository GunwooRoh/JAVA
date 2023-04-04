package assignment;

import java.util.Scanner;

class FoodSale2 {
	protected String menu;
	protected int amount;
	protected int cost;
	protected double price;
	protected static double totalPrice;
	
	public FoodSale2(String menu, int amount, int cost) {
		this.menu = menu;
		this.amount = amount;
		this.cost = cost;
	}

	public double getPrice() {
		return price;
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
		
	public void FindPrice() {
		price = amount * cost;
	}
	
	public void FindTotalPrice() {
		totalPrice += price;  // << error?
	}
	
}

class StudentFoodSale extends FoodSale2 {
	private double discount;
	private static double totalDiscount;
	private static double DiscountRate = 0.1;
	
	StudentFoodSale(String menu, int amount, int cost) {
		super(menu, amount, cost);
	}
	
	
	public static double getTotalDiscount() {
		return totalDiscount;
	}
	
	
	public void FindDiscount() {
		discount = (super.price * DiscountRate);
	}
	
	public void FindTotalDiscount() {
		totalDiscount += discount; //error?
	}
	
}

	
public class assignment_08_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
		System.out.println("메뉴, 수량, 단가, 학생여부(Y/N)를 입력하세요.");
		String menu = sc.nextLine();
		int amount = sc.nextInt();
		int cost = sc.nextInt();
		sc.nextLine();
		String input = sc.nextLine();
		StudentFoodSale fs = new StudentFoodSale(input, amount, cost);
		if (input.equalsIgnoreCase("Y")) {
			fs.FindPrice();
			fs.FindTotalPrice();
			fs.FindTotalDiscount();
			System.out.println("판매금액 : " + fs.getPrice() + ", 누적판매금액 : " + fs.getTotalPrice() + ", 누적할인금액 : " + fs.getTotalDiscount());
		} else if (input.equalsIgnoreCase("N")) {
			fs.FindPrice();
			fs.FindTotalDiscount();
			fs.FindTotalPrice();
			System.out.println("판매금액 : " + fs.getPrice() + ", 누적판매금액 : " + fs.getTotalPrice());
		}
		
		System.out.println("종료하시려면 Q를 눌러주세요.");
		System.out.println("계속 하려면 엔터를 눌려주세요.");
		String q = sc.nextLine();
		
		if (q.equalsIgnoreCase("Q")) {
			break;
			}
		}	
	}
}
