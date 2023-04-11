package com.day20.Collection;

import java.util.ArrayList;

public class ArrayListTest1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(3);
		list.add(new Integer(10));
		list.add(new Integer(20));
		
		list.add(30);
		
		System.out.println("ArrayList의 크기 : " + list.size() + "\n");
		
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			Integer n = (Integer)obj;
			System.out.println(n);
		}
		
		list.add(new Double(3.14));
		list.add("java");
		Object obj = list.get(3);
		Double d = (Double)obj;
		System.out.println("\n" + d);
		
		String str = (String)list.get(4);
		System.out.println("\n" + str);
	}

}
