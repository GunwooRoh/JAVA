package com.day20.Collection;

import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) {
		ArrayList<Double> Generic = new ArrayList<Double>(3);
		
		Generic.add(1.23);
		Generic.add(1.24);
		Generic.add(1.25);
		
		for (int i = 0; i < Generic.size(); i++) {
			double d = Generic.get(i);
			System.out.println(d + " ");
		}
		
		System.out.println("\n----------------------------\n");
		
		for (double n : Generic) {
			System.out.println(n + " ");
		}

		System.out.println("\n----------------------------\n");
		
		
		ArrayList<String> Generic2 = new ArrayList<String>(5);
		
		
		for (int i = 0; i < 5; i++) {
			Generic2.add(i + 1 + " : Hello java!");
		}
		
		for (String s : Generic2) {
			System.out.println(s + " ");
		}
	}

}
