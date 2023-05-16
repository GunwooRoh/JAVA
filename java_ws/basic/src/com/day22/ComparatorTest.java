package com.day22;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

//문자열을 코드 순이 아니라 길이 순으로 정렬
class StringLenComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
		//o1이 크면 양수, o2가 크면 음수, 같으면 0 리턴
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<>(new StringLenComparator());
		set.add("Orange");
		set.add("Apple");
		set.add("Dog");
		set.add("Individual");
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
	}

}
