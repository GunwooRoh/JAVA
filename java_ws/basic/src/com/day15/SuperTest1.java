package com.day15;

class Parents5 {
	protected int x = 10;
}

class Child5 extends Parents5 {
	private int x = 20;
	
	public void showInfo() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}

public class SuperTest1 {

	public static void main(String[] args) {
		Child5 ch = new Child5();
		ch.showInfo();

	}

}
