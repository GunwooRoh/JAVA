package com.day21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest1 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		//저장
		map.put(1, "홍길동");
		map.put(2, "김길동");
		map.put(3, "이길동");
			
		System.out.println("1번 학생 : " + map.get(1));
		System.out.println("2번 학생 : " + map.get(2));
		
		System.out.println("\nsize = " + map.size());
		
		map.remove(3); //3번 지우기
		
		//읽어오기
		//Set<K> keySet() : Returns a Set view of the keys contained in this map
	
		Iterator<Integer> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			String value = map.get(key);
			System.out.println("key : " + key + ", value : " + value);
		}
	}

}
