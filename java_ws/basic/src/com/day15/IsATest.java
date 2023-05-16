package com.day15;

class Point1 {
	protected int x, y;
	
	Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Circle1 extends Point1 {
	private int r;
	
	Circle1(Point1 p, int r){
		super(p.x, p.y);
		this.r = r;
	}
	

	public void showInfo() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("r = " + r);
	}
}

public class IsATest {

	public static void main(String[] args) {
		Point1 p = new Point1(7, 8);
		Circle1 c1 = new Circle1(p, 10);
		c1.showInfo();
	}

}
