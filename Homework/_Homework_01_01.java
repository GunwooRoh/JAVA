package Homework;

import java.io.IOException;


public class _Homework_01_01 {
	
	public static void main(String[] args) throws IOException{
	
		//영문자 판별하기2
        
		char data = 0; 
		
		try {
		System.out.println("영문자를 입력하세요. : ");
		data = (char) System.in.read();
		
		
	
		
		boolean result1 = (97 <= data) && (data <= 122);
		System.out.println("(65 <= data) && (data <= 90)");
		
		
		boolean result2 = (65 <= data) && (data <= 90);
	    System.out.println("(97 <= data) && (data <= 122)");}
	
	
	    catch (IOException e) {
	    }
		
	    }
}
	
	


