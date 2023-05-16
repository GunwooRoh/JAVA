package com.day21;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest1 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>(4);
		
		//저장
		set.add("First");
		set.add("Second");
		set.add("Thrid");
		set.add("First");
		
		System.out.println("저장된 데이터의 개수 : " + set.size());
		
		//읽어오기
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
	}

}
