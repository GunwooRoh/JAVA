package com.day24;

public class HashCodeTest {

	public static void main(String[] args) {
		//hashCode() - 객체의 메모리 주소를 리턴함
		
		String s1 = new String("java");
		String s2 = new String("java");
		String s3 = "java";
		String s4 = "java";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		//주소
		System.out.println("\n" + System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		Integer n1 = 10, n2 = 20; //주소
		System.out.println("\n---------------------------");
		System.out.println(n1.hashCode());
		System.out.println(n2.hashCode());
		System.out.println(System.identityHashCode(n1));
		System.out.println(System.identityHashCode(n2));
		
		Person3 p1 = new Person3();
		Person3 p2 = new Person3();
		
		System.out.println("\n---------------------------");
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(System.identityHashCode(p1));
		System.out.println(System.identityHashCode(p2));
	}

}

class Person3 {
	
}
