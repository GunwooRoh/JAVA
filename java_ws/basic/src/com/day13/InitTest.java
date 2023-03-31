package com.day13;

class BBB {
	static int cv = 1;
	int iv = 1;
	
	static {
		cv = 2;
		System.out.println("static 초기화 블럭");
	}
	
	BBB() {
		iv = 3;
		System.out.println("생성자!");
	}
	
}


public class InitTest {

	public static void main(String[] args) {
		System.out.println("BBB.cv = " + BBB.cv);
		
		BBB b = new BBB();
		System.out.println("b.iv = " + b.iv);

	}

}
