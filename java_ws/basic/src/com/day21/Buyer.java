package com.day21;

import java.util.ArrayList;

//고객 - 물건을 사는 사람
public class Buyer { 
	private int myMoney; //1000, 900, 700
	private int point; //2, 6
	
	//구입한 상품을 저장할 ArrayList 추가
	private ArrayList<Product> list = new ArrayList<>();
		
	public Buyer(int myMoney) {
		this.myMoney=myMoney;
	}
	
	//물건을 구매하는 메서드
	public void buy(Product p) {
		if(myMoney < p.getPrice()) {
			System.out.println("잔액이 부족하여 물건을 구매할 수 없습니다.");
			return;
		}
		
		//잔고는 줄고, 포인트는 늘어난다
		this.myMoney -= p.getPrice(); //-100/ -200
		this.point += p.getPoint(); //+2/ +4
		
		//구매한 상품을 배열에 저장한다
		list.add(p);
		
		System.out.println(p + "을(를) 구매하였습니다.");	//tv / Computer
	}
	
	public void showInfo() {
		System.out.println("현재 잔고 : " + myMoney );
		System.out.println("포인트 : " + point+"\n");		
	}
	
	public void summary() {
		//구매한 상품명들과 상품 가격의 합계 출력
		if(list.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		int sum=0;
		String itemList="";
		for(int i=0;i<list.size();i++) {
			Product p = list.get(i);
			sum += p.getPrice() ; //100 + 200
			itemList += p ; //TV, Computer
			if(i<list.size()-1) {
				itemList+=",";
			}
		}
		
		System.out.println("\n구매하신 물건의 총 금액은 " +  sum +"입니다");	
		System.out.println("구매하신 제품은 " + itemList +"입니다\n");		
	}
	
	public void refund(Product p) { //구입한 제품을 환불한다
		//boolean remove(Object o)
		if(list.remove(p)) { //구매한 제품을 ArrayList에서 제거한다
			myMoney += p.getPrice();
			point -= p.getPoint();
			System.out.println(p + "을/를 반품하셨습니다.");
		}else {
			System.out.println("구매하신 제품 중 해당 제품이 없습니다. 다시 확인하세요");
		}
	}
	
}












