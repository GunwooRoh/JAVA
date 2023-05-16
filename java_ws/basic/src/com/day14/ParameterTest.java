package com.day14;

class Data {
	int x;
}

public class ParameterTest {
	public static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}
	
	public static void  change2(Data d) {
		d.x = 2000;
		System.out.println("main() : x = " + d.x);
	}
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("change1()메서드 호출 후 main() : x = " + d.x);
		
		System.out.println("-------------------------------------------------------");
		
		Data d2 = new Data();
		d2.x = 20;
		System.out.println("main() : x = " + d2.x);
		
		change2(d2);
		System.out.println("change2() 메서드 호출 후 main() : x = " + d2.x);

	}

}
