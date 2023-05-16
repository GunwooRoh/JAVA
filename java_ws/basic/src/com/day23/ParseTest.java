package com.day23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ParseTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("오늘 이전 날짜 입력 (2023-01-01 형식)");
		String str = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d = sdf.parse(str);
			Date today = new Date();
			System.out.println("d : " + d);
			long gap = (today.getTime() - d.getTime())/1000;
			gap = gap / (24 * 60 * 60);
			System.out.println("두 날짜 사이의 간격 : " + gap);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
