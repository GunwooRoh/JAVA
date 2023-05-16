package com.day15;

class Card {
	final String KIND;
	final int NUMBER;
	
	Card (String kind, int num) {
		KIND = kind;
		NUMBER = num;
	}
	
	public void showInfo2() {
		System.out.println("카드 종류 : " + KIND);
		System.out.println("카드 숫자 : " + NUMBER + "\n");
	}
}

public class FinalTest2 {
	public static void main(String[] args) {
		
		Card c1 = new Card("Heart", 7);
		c1.showInfo2();
		
		Card c2 = new Card("Diamond", 3);
		c2.showInfo2();

	}

}

