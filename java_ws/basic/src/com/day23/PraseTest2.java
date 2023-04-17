package com.day23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PraseTest2 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("오늘 이전 날짜 입력 (2023-01-01 형식)");
			String str = sc.nextLine();
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			try {
				Date d = sdf.parse(str);
				Date today = new Date();
				long gap = 0;
				if(today.getTime() > d.getTime()) {
					gap = (today.getTime() - d.getTime())/1000; //초
				}else {
					//미래 날짜 - 오늘 날짜
					//오늘 날짜의 시분초 제거
					String sToday = sdf.format(today);
					System.out.println("sToday : " + sToday);
					
					Date today2 = sdf.parse(sToday);
					System.out.println("d : " + d.toLocaleString() + ", today2 : " + today2.toLocaleString());
					gap = (d.getTime() - today2.getTime())/1000;
				}
				
				gap = gap / (24 * 60 * 60);
				System.out.println("두 날짜 사이의 간격 : " + gap);
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
		

	}

}
