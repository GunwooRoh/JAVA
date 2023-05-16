package assignment;

import java.util.Scanner;

public class assignment01_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String str = "";
		
		if (num > 0) {
			str = "양수입니다.";
		
		}else if (num < 0) {
			str = "음수입니다.";
			
		}else {
			str = "0 입니다.";
		}
		
		System.out.println(str);
		

	}

}
