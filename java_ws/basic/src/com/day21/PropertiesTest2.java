package com.day21;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.IOException;

public class PropertiesTest2 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("text/input.txt"));
		}catch (IOException e) {
			System.out.println("예외 : " + e.getMessage());
		}
		
		String name = prop.getProperty("name");
		String data = prop.getProperty("data");
		
		System.out.println("name : " + name);
		System.out.println("data : " + data);

	}

}
