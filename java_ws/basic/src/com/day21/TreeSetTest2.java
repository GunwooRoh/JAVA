package com.day21;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Person[ name : " + name + ", age : " + age + " ]";
	}
	
	public int compareTo(Person p) {
		if(this.age > p.age) {
			return 1;
		}else if(this.age < p.age) {
			return -1;
		}else {
			return 0;
		}
	}
}

public class TreeSetTest2 {

	public static void main(String[] args) {
		TreeSet<Person> tset = new TreeSet<>();
		tset.add(new Person("홍길동", 20));
		tset.add(new Person("김길동", 17));
		tset.add(new Person("이길동", 31));
		
		Iterator<Person> iter = tset.iterator();
		while(iter.hasNext()) {
			Person p = iter.next();
			System.out.println(p);
		}

	}

}
