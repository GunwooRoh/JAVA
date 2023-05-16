package com.day19.etc;

public class CardMain {
	public static void main(String[] args) {
		Deck d = new Deck(); //카드 한벌 만들기
		Card c = d.pick(0);  //0번째 위치의 카드 뽑기
		System.out.println(c.findInfo());
		
		//카드 한벌 출력하기
		System.out.println("\n=========카드 한벌========");
		Card[] cardArr = d.getCardList();
		for(Card card : cardArr) {
			System.out.println(card.findInfo());
		}
		
		//카드 섞기
		d.shuffle();
		
		//카드 섞은 후 0번째 위치의 카드 뽑기
		c = d.pick(0);
		System.out.println("\n카드 섞은 후 0번째 카드:"+ c.findInfo());
		
		System.out.println("\n===========카드 섞은 후 카드 한벌=============");
		//cardArr = d.getCardList();
		for(Card card : cardArr) {
			System.out.println(card.findInfo());
		}
		
	}
}








