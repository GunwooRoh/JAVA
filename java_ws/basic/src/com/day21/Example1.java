package com.day21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;



public class Example1 {

	public static void main(String[] args) {
		
		double list1[] = new double[4];
		
		for (int i = 0; i < list1.length; i++) {
			list1[i] = 1.5 + i;
		}
		
		for (Double i : list1) {
			System.out.println(i);
		}
		
		System.out.println("--------------------------");
		
		ArrayList<Double> list = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			list.add(1.5 + i);
		}
		
		System.out.println("--------------------------");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("--------------------------");
		
		for (Double i : list) {
			System.out.println(i);
		}
		System.out.println("--------------------------");
		
		HashSet<Double> hs = new HashSet<Double>();
		
		for (int i = 0; i < 4; i++) {
			hs.add(1.5 + i);
		}
		
		Iterator<Double> iter = hs.iterator();
		
		while (iter.hasNext()) {
			Double d = iter.next();
			System.out.println(d);
		}
	}

}
