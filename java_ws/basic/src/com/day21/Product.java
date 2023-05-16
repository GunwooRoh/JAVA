package com.day21;

abstract public class Product {
	private int price; //상품의 가격, 100 / 200
	private int point;	//포인트 점수, 2 / 4
	private final double POINT_RATE=0.02;	//가격의 2%가 포인트 점수
	
	public Product(int price) {
		this.price=price;
		this.point=(int)(price*POINT_RATE);
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getPoint() {
		return point;
	}
	
}

class TV extends Product{
	TV(int price){
		super(price);
	}
	
	public String toString() {
		return "TV";
	}
}

class Computer extends Product{
	Computer(int price){
		super(price);
	}
	
	public String toString() {
		return "Computer";
	}
}







