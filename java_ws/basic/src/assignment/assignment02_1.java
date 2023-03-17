package assignment;

import java.util.Scanner;

public class assignment02_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String result = "";
		System.out.println("아이디를 입력하세요");
		
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요");
		
		int password = sc.nextInt();
		
		boolean bool = id.equals("hong");
		
		if(id.equals("hong") && password == 1234) {
			result = "로그인되었습니다";
		}else {
			result = "아이디나 비밀번호가 틀렸습니다.";
		}
		System.out.println(result);
	}

}


