package com.day15;

final class Parent7 {
	void func() {
		System.out.println("Parent7");
	}
	
	public final void finalFunc() {
		System.out.println("ppppppppp");
	}
} 
/*class Child extends Parent7 {
	public void func() {
}
	System.out.println("Child");
} */
class MyFinal {
final public static double PI=3.14;
int age=10;
}//
class FinalTest1 {

	public static void main(String[] args) {

		MyFinal my=new MyFinal();

		System.out.println("my.age="+ my.age);
		System.out.println("MyFinal.PI: " + MyFinal.PI);
		my.age=20;
		//MyFinal.PI=3.1415; //에러
		System.out.println("my.age = "+ my.age);
		System.out.println("MyFinal.PI: " + MyFinal.PI);
	}
}