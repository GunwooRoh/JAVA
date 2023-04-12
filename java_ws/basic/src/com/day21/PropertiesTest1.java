package com.day21;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest1 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		System.out.println("size : " + prop.getProperty("size"));
		System.out.println("capacity : " + prop.getProperty("capacity", "20"));
		System.out.println("loadfactor : " + prop.getProperty("loadfactor", "0.75"));
		
		System.out.println("------------------------------------------");
		
		Enumeration en  = prop.propertyNames();
		while(en.hasMoreElements()) {
			String element = (String)en.nextElement();
			System.out.println(element + " => " + prop.getProperty(element));
;		}

	}

}
