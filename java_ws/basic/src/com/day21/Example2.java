package com.day21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Example2 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "boy => 소년");
		map.put(2, "girl => 소녀");
		map.put(3, "school => 학교");
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		
		
		System.out.println("------------------------------------");
		
		
		Iterator<Integer> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			String value = map.get(key);
			System.out.println("key : " + key + ", value : " + value);
		}
		
		System.out.println("------------------------------------------------------------------");
		//65 ~ 90
		
		System.out.println("ArrayList 출력");
		ArrayList<Character> list = new ArrayList<>(26);
		for (int i = 65; i < 91; i++) {
			list.add((char)i);
		}
		System.out.println("For문");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println("\n");
		
		System.out.println("확장For문");
		for (Character i : list) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n");
		System.out.println("------------------------------------------------------------------");
		System.out.println("HashMap 출력");
		HashMap<Integer, Character> map2 = new HashMap<>();
		for (int i = 65; i < 91; i++) {
			map2.put(i, (char)(i));	
		}
		
		
		
		Iterator<Integer> iter2 = map2.keySet().iterator();
		while (iter2.hasNext()) {
			int key = iter2.next();
			char value = map2.get(key);
			System.out.print(value + " ");
		}
		
		System.out.println("\n");
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("HashSet 출력");
		HashSet<Character> set = new HashSet<>();
		for (int i = 65; i < 91; i++) {
			set.add((char)i);
		}
		
		Iterator<Character> iter3 = set.iterator();
		while(iter3.hasNext()) {
			char ch2 = iter3.next();
			System.out.print(ch2 + " ");
		}
		System.out.println("\n");
	}

}
