package com.day24;

class Point implements Cloneable {
	private int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x : " + x + ", y : " + y;
	}
	
	public Point copy() throws CloneNotSupportedException {
		Object obj = null;
		obj = clone();
		return (Point)obj;
	}
}

public class CloneTest {

	public static void main(String[] args) {
		try {
			Point original = new Point(10, 30);
			Point p = original.copy();
			
			System.out.println("original : " + original);
			System.out.println("copy p : " + p);
			
			System.out.println("original 주소 : " + original.hashCode());
			System.out.println("p 주소 : " + p.hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
