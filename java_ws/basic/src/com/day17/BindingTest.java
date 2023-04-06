package com.day17;

class Parents {
	int x = 100;
	
	public void method() {
		System.out.println("Parents 메서드");
	}
}

class Child extends Parents {
	int x = 200;
	
	public void method() {
		System.out.println("Child 메서드 - 오버라이딩");
	}
}

public class BindingTest {

	public static void main(String[] args) {
		Parents p = new Child();
		p.method();
		
		System.out.println("p.x = " + p.x);
		//부모 참조변수로는 부모의 멤버만 접근 가능
		
		

	}

}
