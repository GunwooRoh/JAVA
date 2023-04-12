package com.day11;

import com.day12.BBB;

public class DefaultTest {

	public static void main(String[] args) {
		//AAA a = new AAA(); //error
		BBB obj = new BBB();
		obj.showInfo();

		//System.out.println("private x = "+ obj.x); 
		//=> error:The field BBB.x is not visible

		//System.out.println("default y="+obj.y); //error
		//System.out.println("protected z="+obj.z); //error
		System.out.println("public w="+obj.w);
	}

}
