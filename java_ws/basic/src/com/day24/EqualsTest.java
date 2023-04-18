package com.day24;

public class EqualsTest {

	public static void main(String[] args) {
		
		Man m = new Man(20);
		Man m2 = new Man(20); 
			
			if (m==m2) {
				System.out.println("같다");
			}else {
				System.out.println("다르다");
			}
			
			
			if (m.equals(m2)) {
			System.out.println("같다");
			}else {
			System.out.println("다르다");
			}

	}

}

class Man {
	private int age;
	
	Man(int age) {
		this.age = age;
	}
	
}
