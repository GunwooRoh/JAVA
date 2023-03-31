package com.day14;

import com.day13.MyParents;

class Child extends MyParents {
	public void childInfo() {
		System.out.println("-------------Child-------------");
		//System.out.println("private num1 = " + num1); << error
		// System.out.println("default num2 = " + num2); << error
		System.out.println("protected num3 = " + num3);
		System.out.println("public num4 = " + num4);
	}
}

public class ProtectedTest {

	public static void main(String[] args) {
		MyParents p = new MyParents();
		
		System.out.println("main MyParents num4 = " + p.num4);
		
		
		Child ch = new Child();
		//System.out.println("main Child num1 = " + ch.num1);
		//System.out.println("main Child num2 = " + ch.num2);
		//System.out.println("main Child num3 = " + ch.num3);
		System.out.println("main Child num4 = " + ch.num4);
		
		ch.childInfo();
	}

}
