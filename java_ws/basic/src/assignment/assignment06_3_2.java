package assignment;

import java.util.Scanner;


public class assignment06_3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
		System.out.println("선택하세요....");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 프로그램 종료");
		System.out.print("선택: ");
		int choice = sc.nextInt();
		
		if (choice == 2) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		
		System.out.print("이름 : ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("전화번호 : ");
		String num = sc.nextLine();
		System.out.print("생년월일 : ");
		String brth = sc.nextLine();
		
		PhoneInfo Info = new PhoneInfo(name, num, brth);
		
		
		System.out.println("=====입력된 정보 출력 ======");
		
		Info.showinfo();
		}
	}

}
