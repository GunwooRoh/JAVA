package com.day20;

import java.util.Scanner;

class IdinputException extends Exception {
	IdinputException() {
		super("잘못 입력하셨습니다.");
	}
}

public class IdTest {
	public static String Idinput() throws IdinputException {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호 14자리를 입력하세요. (- 포함)");
		String id = sc.nextLine();
		if(id.length()!=14) {
			throw new IdinputException();
		}	
		return id;
	}
		
	public static void main(String[] args) {
		try {
			String id = Idinput();
				System.out.println("주민등록번호 : " + id);
			}catch (IdinputException e) {
				System.out.println(e.getMessage());
			}
		System.out.println("\n-------------------------");
		

	}

}
