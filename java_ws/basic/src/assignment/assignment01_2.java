package assignment;

import java.util.Scanner;

public class assignment01_2 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("정수 하나를 입력 해주세요. : ");
      int a = sc.nextInt(); 
      if  (a % 2 == 1) 
         System.out.println("홀수 입니다.");
      else 
         System.out.println("짝수 입니다.");   
   }
}