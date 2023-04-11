package com.day20.Collection;

import java.util.ArrayList;

class Product {
	private String code;
	private String pdName;
	private int price;
	
	Product(String code, String pdName, int price) {
		this.code = code;
		this.pdName = pdName;
		this.price = price;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getPdName() {
		return pdName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setCode() {
		this.code = code;
	}
	
	public void setPdName() {
		this.pdName = pdName;
	}
	
	public void setPrice() {
		this.price = price;
	}
	
	
	public String toString() {
		return " Product [code : " + code + " pdName : " + pdName + " price : " + price + "]\n";
	}
	
}

public class ProductExample {

	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<>(3);
		
		list.add(new Product("12345", "장난감", 1000));
		list.add(new Product("123456", "가구", 2000));
		list.add(new Product ("1234567", "전자제품", 3000));

		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-----------------------------------------------------------------");
		
		for (Product p : list) {
			System.out.println(p);
		}
		
		System.out.println("-----------------------------------------------------------------");
		Product[] p2 = new Product[3];
		p2[0] = new Product("12345", "장난감", 1000);
		p2[0] = new Product("123456", "가구", 2000);
		p2[0] = new Product("1234567", "전자제품", 3000);
		
		for (int i = 0; i < p2.length; i++) {
			p2[i] = list.get(i);
			System.out.println(p2[i]);
			
		}
		System.out.println("-----------------------------------------------------------------");	
		
		for (Product p3 : p2) {
			System.out.println(p3);
		}
	}

}
