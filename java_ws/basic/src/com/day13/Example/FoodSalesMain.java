package com.day13.Example;
import java.util.Scanner;

class Foodsale {
   private String foodname;
   private int quantity;
   private int price;
   
   private static int discount = 15;
   private static int finalprice;
   
   Foodsale(String foodname, int quantity, int price) {
      this.foodname = foodname;
      this.quantity = quantity;
      this.price = price;
   }
   
   public String getFoodname() {
      return foodname;
   }
   
   public int getFoodquantity() {
      return quantity;
   }
   
   public int salePrice() {
      discount = quantity * price * discount / 100;
      
      return discount;
   }
   
   public int finalPrice() {
      finalprice = quantity * price - discount;
      
      return finalprice;
   }
   
}

public class FoodSalesMain {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      while(true) {
         System.out.println("메뉴, 수량, 단가를 입력하세요.");
         System.out.print("메뉴: ");
         String foodname = sc.nextLine();
         System.out.print("수량: ");
         int quantity = sc.nextInt();
         System.out.print("단가: ");
         int price = sc.nextInt();
         
         Foodsale fs = new Foodsale(foodname, quantity, price);
         
         System.out.println("\n메뉴: " + fs.getFoodname() + "\t" + fs.getFoodquantity() + "개");
         System.out.println("할인 금액: " + fs.salePrice() + "원");
         System.out.println("판매금액: " + fs.finalPrice() + "원");
         
         System.out.print("\n그만하시겠습니까? <Q>: ");
         String quit = sc.next();
         
         if(quit.equalsIgnoreCase("Q")) {
            System.out.println("\n종료합니다.");
            break;
         }
      }

}
}