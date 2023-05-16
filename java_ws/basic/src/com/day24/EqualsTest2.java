package com.day24;

class Person2 {
	private long id;
	
	Person2(long id) {
		this.id = id;
	}
	
	//Object의 equals() 오버라이딩
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Person2 ) {
			Person2 p = (Person2)obj;
			return this.id == p.id;
		}else {
			return false;
		}
	}
}

public class EqualsTest2 {

	public static void main(String[] args) {
		Person2 p1 = new Person2(99999999999L);
		Person2 p2 = new Person2(99999999999L);
		
		if (p1.equals(p2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	
		if (p1 == p2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	}

}
