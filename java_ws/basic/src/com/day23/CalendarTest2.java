package com.day23;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest2 {

	public static void main(String[] args) {

		final String[] WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};
		
		Calendar cal1 = new GregorianCalendar();
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2023, 3, 1);
		
		System.out.println("cal1 : " + showDate(cal1));
		System.out.println("요일 : " + WEEK[cal1.get(Calendar.DAY_OF_WEEK)]);
		
		System.out.println("cal2 : " + showDate(cal1));
		System.out.println("요일 : " + WEEK[cal2.get(Calendar.DAY_OF_WEEK)]);
		
		//두 날짜 사이의 간격
		long gap = (cal1.getTimeInMillis() - cal2.getTimeInMillis())/1000;
		System.out.println("두 날짜 사이의 간격 (초) : " + gap);
		
		gap = gap / (24 * 60 * 60);
		System.out.println("두 날짜 사이의 간격(일) : " + gap);
	}
	
	public static String showDate(Calendar cal) {
		return cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH) + 1) + "월 " + (cal.get(Calendar.DATE)) + "일 ";
	}
}
