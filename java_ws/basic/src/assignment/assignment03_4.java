package assignment;

import java.util.*;
import java.io.IOException;

public class assignment03_4 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("0~9나 알파벳, 그외 문자를 입력하세요");
		int a = System.in.read();
		char ch1 = (char)a;
		String str = "";

		if ((ch1 >= '0') && (ch1 <= '9')) {
			str = "숫자입니다";
		} else if ((ch1 >= 'A') && (ch1 <= 'Z') || (ch1 >= 'a') && (ch1 <= 'z')) {
			str = "알파벳 문자입니다";
		} else {
			str = "기타 문자입니다";
		}
		
		System.out.println("입력한 값: " + ch1 + "\n" + str);
		
		/*
	        System.out.println("0~9나 알파벳, 그외 문자를 입력하세요");
	
	        char ch = sc.next().charAt(0);
	        String str = "";
	
	        if (Character.isDigit(ch)) {
	            str = "숫자입니다";
	        } else if (Character.isAlphabetic(ch)) {
	            str = "알파벳 문자입니다";
	        } else {
	            str = "기타 문자입니다";
	        }
	
	        System.out.println("입력한 값: " + ch);
	        System.out.println(str); */
    

			
			
	}

}


