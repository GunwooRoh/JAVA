package com.day14;

class Point {
	protected int x;
	protected int y;
	
	public String findLocation() {
		String result = "x =" + ", y = " + y; 
		return result;
	}
}

class Point3D extends Point {
	private int z;
	
	public String findLocation() {
		String result = "x = " + ", y = " + y + ", z =" + z;
		return result;
	}
}

public class OverridingTest1 {

	public static void main(String[] args) {
		Point3D p = new Point3D();
		String r = p.findLocation();
		System.out.println("3차원 좌표 = " + r);
		
		Point p2 = new Point();
		r = p2.findLocation();
		System.out.println("2차원 좌표 = " + r);

	}

}
