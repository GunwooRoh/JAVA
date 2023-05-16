package assignment;

class Shape {
	public double findArea() {
		double result = 0;
		return result;
	}
	
}

class Circle extends Shape {
	private int radius = 2;
	public double findArea() {
		double result = radius * 3.14 * radius;
		return result;
	}
	
}

class Rectangle extends Shape {
	private int w = 3;
	private int h = 4;
	public double findArea() {
		double result = w * h;
		return result;
	}
	
}
public class assginment07_1 {

	public static void main(String[] args) {
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		
		System.out.println("원의 면적 : " + c.findArea());
		System.out.println("사각형의 면적 : " + r.findArea());

	}

}
