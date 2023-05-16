package com.day5;

import java.util.Scanner;

public class OverlapIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("회원여부를 입력하세요<1. 회원, 2. 비회원>");
		
		int member = sc.nextInt();
		
		String gift = "";
		
		if (member == 1) {
			System.out.println("회원이 구매한 금액을 입력하세요");
			int pay = sc.nextInt();
			if (pay >= 1000000) {
				gift = "외장하드";
			}else if (pay >= 500000) {
				gift = "스피커";
			}else if (pay >= 100000) {
				gift = "마우스";
			}else {
				gift = "10만원 미만은 사은품이 없습니다.";
			}
		}else {
			gift = "비회원은 사은품 증정 불가";
		}
		System.out.println("구매금액별 사은품 : " + gift);
		
		

	}

}
