package Homework;


//Homework
import java.io.IOException;

public class _01Homework_ {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//영문자 판별하기
		char data = 0; 
		
		try {
		System.out.println("영문자를 입력하세요. : ");
		data = (char) System.in.read();
		
		
		if(data >= 65 && data <= 90 || data >= 97 && data <= 122)
		
				System.out.println(data + "(은)는 ");
		if(data >= 65 && data <= 90 )
			System.out.println("대");
		
		else 
			System.out.println("소");
		
		
		System.out.println("문자 입니다.");}
		
		catch (IOException e) {
		}
		
		  
		System.out.println("-----------------------------");
		
	}
	
	
}
		

		
		

	
	

	
	
	
	
	

	
	
	
		  
			
			
			


	


