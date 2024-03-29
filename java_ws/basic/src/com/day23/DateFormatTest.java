package com.day23;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2023, 0, 12);
		
		Date d = cal.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy - MM - dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy - MM - dd HH : mm : ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy - MM - dd E요일");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy - MM - dd hh : mm : ss.SSS");
		
		String str = sdf.format(d);
		System.out.println(str);
		System.out.println(sdf2.format(d));
		System.out.println(sdf3.format(d));
		System.out.println(sdf4.format(d));
	}

}
