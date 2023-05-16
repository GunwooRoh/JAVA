package com.day21;

public class BuyerMain {

	public static void main(String[] args) {
		Buyer b = new Buyer(1000);

		//200만원 TV 구매
		Product p = new TV(200);
		b.buy(p);

		//150만원 Computer 구매
		Product p2 = new Computer(150);
		b.buy(p2);

		//300만원 TV구매
		Product p3 = new TV(300);
		b.buy(p3);

		//200만원 TV반품
		b.refund(p);
		b.summary();


	}

}
