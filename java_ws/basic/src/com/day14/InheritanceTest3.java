package com.day14;

class GrandFather {
	public GrandFather() {
		System.out.println("GrandFather 생성자");
	}
	public void displayGrand() {
		System.out.println("GrandFather의 displayGrand()");
		for (int i = 0; i < 3; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}

class Father extends GrandFather {
	public Father() {
		System.out.println("Father 생성자");
	}
	
	public void displayFather() {
		System.out.println("Father의 displayFather()");
		for (int i = 0; i < 5; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}	

class Child2 extends Father {
	public Child2() {
		System.out.println("Child 생성자");
	}
	public void displayChild2() {
		System.out.println("Child의 displayChild()");
		for (int i = 0; i < 7; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}


public class InheritanceTest3 {

	public static void main(String[] args) {
		Child2 c = new Child2();
		c.displayGrand();
		c.displayFather();
		c.displayChild2();

	}

}
