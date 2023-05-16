package com.day23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 E");

		try {
			System.out.println("날짜를 입력하세요. (2023/04/17 형식)");
			String str = sc.nextLine();
			Date d = sdf.parse(str);
			str = sdf2.format(d);
			System.out.println(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
