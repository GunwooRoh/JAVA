package com.day13.Example;

import java.util.Scanner;

class BookSales {
	//1. 멤버변수
	//인스턴스 변수
	private String title;
	private int quantity;
	private int price;
	private int salesPrice; //판매금액
	
	//static 변수
	private static int totalSalesPrice; //누적판매금액
	
	//2. 생성자
	BookSales(String title, int quantity, int price) {
		this.title = title;
		this.quantity = quantity;
		this.price = price;
	}
	
	//3. getter / setter
	public int getSalesPrice() {
		return salesPrice;
	}
	
	public static int getTotalSalesPrice() {
        return totalSalesPrice;
    } 
	
	//4. 메서드
	public  void findSalesPrice() {
		salesPrice = price * quantity;
	}
	
	public void findTotal() {
		totalSalesPrice += salesPrice;
	}
}

public class BookSalesTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("책 제목, 수량, 단가를 입력하세요!");
		
			String title = sc.next();
			int quantity = sc.nextInt();
			int price = sc.nextInt();
			
			BookSales bs = new BookSales(title, quantity, price);
			bs.findSalesPrice();
			bs.findTotal();
			
			System.out.println("판매금액 : " + bs.getSalesPrice() + ", 누적판매금액 : " + BookSales.getTotalSalesPrice());
			
			System.out.println("그만 하려면 Q");
			sc.nextLine();
			String quit = sc.nextLine();
			if(quit.equalsIgnoreCase("Q")) {
				break;
			}
			
		}
		

	}

}
