package com.day18;

interface I {
	void method();
}

class AA {
	public void methodA(I i) {
		i.method();
	}
}

class BB implements I {
	public void method() {
		System.out.println("B - methodB()메서드");
	}
	
} 

class CC implements I {
	public void method() {
		System.out.println("C - methodC()메서드");
	}
}

public class InterfaceTest4 {

	public static void main(String[] args) {
		AA a = new AA();
		a.methodA(new BB());
		a.methodA(new CC());

	}

}
