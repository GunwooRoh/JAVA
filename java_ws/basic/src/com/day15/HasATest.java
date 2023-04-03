package com.day15;

class Point2 {
	protected int x, y;
	
	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Circle2 {
	private Point2 p;
	private int r;
	
	Circle2(Point2 p, int r) {
		this.p = p;
		this.r = r;
	}
	
	public void showInfo() {
		System.out.println("x = " + p.x);
		System.out.println("y = " + p.y);
		System.out.println("r = " + r);
	}

}



public class HasATest {

	public static void main(String[] args) {
		Point2 p = new Point2(4, 5);
		Circle2 cr = new Circle2(p,3);
		
		cr.showInfo();
	}

}
