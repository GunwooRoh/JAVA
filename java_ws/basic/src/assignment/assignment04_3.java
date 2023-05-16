package assignment;

import java.util.Scanner;

public class assignment04_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하세요");
		String str = sc.nextLine();
		String a = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch < '0' || ch > '9') {
				a = "숫자가 아닙니다.";
			} else {
				a = "숫자입니다.";
			}
		}
		System.out.println(str + "는 " + a);

	}

}
