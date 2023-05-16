package com.day23;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class BrithDay {

	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		cal1.set(1999, 8, 22);
		
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2023, 3, 27);
		
		long gap = (cal2.getTimeInMillis() - cal1.getTimeInMillis())/1000;
		
		gap = gap / (24 * 60 * 60);
		
		System.out.println("생일 < "+ (CalendarTest2.showDate(cal1)) + "> 이후 경과일 수 : " + gap);
		
		Calendar cal3 = Calendar.getInstance();
		cal3.set(2023, 7, 25);
		
		Date d1 =  new Date(2023-1900,7,25);
		Date d2 = new Date();
		long gap2 = (d1.getTime() - d2.getTime())/1000;
		gap2 = gap2 / (24 * 60 * 60);
		
		
		System.out.println("수료일 까지 남은 일수 : " + gap2 + "일");
		
		Calendar cal4 = new GregorianCalendar(2023, 5, 17);
		cal4.add(Calendar.DATE, 100);
		System.out.println("04/17 부터 100일 후 : " + (CalendarTest2.showDate(cal4)));
	}

}
