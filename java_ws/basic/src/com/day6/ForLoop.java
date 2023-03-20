package com.day6;

import java.util.*;
class ForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.println("게임 중~");
			System.out.println("계속 하시겠습니까?(Y/N)");
			String gameYn = sc.nextLine();
			if(gameYn.equalsIgnoreCase("N")){
				break;
			}
		} 
		System.out.println("--------------------------");
		for (;;) {
			System.out.println("숫자 입력!");
			int num = sc.nextInt();

			String result = "";
			
			if (num % 2 == 0) {
				result = "짝수입니다.";
			} else {
				result = "홀수입니다.";
			}
			
			System.out.println(result);
			System.out.println("그만하려면 Q를 입력해주세요.");
			sc.nextLine(); //\r\n nextInt 다음에 nextLine을 써야할때
			String quit = sc.nextLine();
			if(quit.equalsIgnoreCase("Q"))
				break;
		}
	} 
}