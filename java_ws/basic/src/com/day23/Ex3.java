package com.day23;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex3 {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E요일 hh:mm:ss a");
		Date today = new Date();
		String sToday = sdf.format(today);
		System.out.println(sToday);
		

	}

}
