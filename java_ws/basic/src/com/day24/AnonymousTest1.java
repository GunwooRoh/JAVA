package com.day24;

public class AnonymousTest1 {

	Object iv = new Object() {
		void method() {}
	};
	
	static Object cv = new Object() {
		void method() {}
	};
	
	void myMethod() {
		Object lv = new Object() {
			void method() {}
		};
	}
	public static void main(String[] args) {

	}

}
