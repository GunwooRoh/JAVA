package com.day20.Collection;

class Man {
	public void showInfo() {
		System.out.println("this = " + this);
	}
}

public class ObjectTest {
	public static void main(String[] ar) {
		Man m = new Man();
		System.out.println("m객체를 표현하는 기본 문자열은? " + m.toString());
		System.out.println("p객체를 표현하는 기본 문자열 약식은? " + m);
		System.out.println(m);
		m.showInfo();
	}
}
