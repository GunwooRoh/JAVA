package com.day21;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		
		TreeSet<Integer> tSet = new TreeSet<>();
		tSet.add(1);
		tSet.add(5);
		tSet.add(2);
		tSet.add(3);
		tSet.add(2);
		
		System.out.println("데이터 개수 : " + tSet.size());
		
		Iterator<Integer> iter = tSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		TreeSet<String> set = new TreeSet<>();
		set.add("홍길동");
		set.add("이길동");
		set.add("김길동");
		set.add("xyz");
		set.add("ab");
		set.add("java");
		set.add("JAVA");
		set.add("Spring");
		set.add("7");
		set.add("4");
		set.add("1");
		
		Iterator<String> iter2 = set.iterator();
		while(iter2.hasNext()) {
			String s = iter2.next();
			System.out.println(s);
		}
		
		
	}

}
