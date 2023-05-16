package com.day9;

import java.util.Scanner;

public class ExamMethod3 {
	public static double findPieceWages(int qty, int sellPrice)	{		
		double pieceWages =0;

		if (qty>=200){
			pieceWages=sellPrice*0.3;
		}else if (qty>=100){
			pieceWages=sellPrice*0.2;
		}else{
			pieceWages=sellPrice*0.1;
		}//if

		return pieceWages;
	}	
	
	public static boolean isNumeric(String value){		
		boolean isNumber = true;		
		for(int i=0; i < value.length() ;i++) {
			char ch = value.charAt(i);
			
			if(!(ch>='0' && ch<='9')) {
				isNumber = false;
				break;
			}
		}//for

		return isNumber;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("판매수량, 판매금액을 입력하세요.");
		int qty = sc.nextInt();	
		int price =sc.nextInt();
		
		double pieceWages=findPieceWages(qty, price);
		System.out.println("성과급 : " + pieceWages);
				
		System.out.println("\n값을 입력하세요.");
		sc.nextLine();
		String val = sc.nextLine();
		
		String result="";
		if(isNumeric(val)) {
			result="숫자입니다.";
		}else {
			result="숫자가 아닙니다.";
		}
		
		System.out.println(result);
		
	}

}