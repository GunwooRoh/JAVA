package assignment;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Shape9 {
	public abstract double findGirth(ArrayList<Shape9> list);
}

class Circle9 extends Shape9 {
	public static final double PI = 3.14;
	private double r;
	
	Circle9(double r) {
		this.r = r;
	}
	
	public double getR() {
		return r;
	}
	
	public void setR() {
		this.r = r;
	}
	
	public double findGirth(ArrayList<Shape9> list) {
		return (2 * r * PI);
	}
	
	public String toString() {
		return "[Circle, " + "r = " + r +  "]" + "\n원의 둘레 : " + 2 * r * PI;
	}

}

class Rect9 extends Shape9 {
	private int w;
	private int h;
	
	Rect9(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public int getW() {
		return w;
	}
	
	public int getH() {
		return h;
	}
	
	public void setW() {
		this.w = w;
	}
	
	public void setH() {
		this.h = h;
	}
	
	public double findGirth(ArrayList<Shape9> list) {
		return (int)(2 * (w + h));
	}

	
	public String toString() {
		return "[Rect, " + "w = " + w + ", h = " + h + "]" + "\n사각형의 둘레 : " + (int)(2 * (w + h));
	}
	
}

public class assignment10 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Shape9> list = new ArrayList<Shape9>();
		while (true) {
		System.out.print("1. 원 2. 사각형 3. 보기 4. 종료 ==> ");
		int input = sc.nextInt();
		
			switch (input) {
			case 1 : 
				System.out.print("반지름은 ? ");
				int input2 = sc.nextInt();
				list.add(new Circle9(input2));
				continue;
			
			case 2 :
				System.out.print("가로는 ? ");
				int input3 = sc.nextInt();
				System.out.print("세로는 ? ");
				int input4 = sc.nextInt();
				list.add(new Rect9(input3, input4));
				continue;
				
			case 3 :
				System.out.println("------------------보기---------------------\n");
				for(Shape9 s : list) {
					System.out.println(s.toString() + "\n");
				}
				System.out.println("\n------------------------------------------");
				continue;
			
			case 4 :
				System.out.println("프로그램을 종료합니다.");
				return;
			
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.\n");
				continue;
		
			}
		
		}
	}

}
