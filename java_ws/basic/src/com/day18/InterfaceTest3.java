package com.day18;

class A {
	public void methodA(C c) {
		c.methodC();
	}
}

class B {
	public void methodB() {
		System.out.println("B - methodB()메서드");
	}
	
} 

class C {
	public void methodC() {
		System.out.println("C - methodC()메서드");
	}
}
public class InterfaceTest3 {

	public static void main(String[] args) {
		A a = new A();
		a.methodA(new C());

	}

}
