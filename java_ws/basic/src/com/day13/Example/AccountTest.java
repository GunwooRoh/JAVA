package com.day13.Example;

public class AccountTest {

	public static void main(String[] args) {
		Account[] accList = new Account[3];
		Account acc1 = new Account("100-1123",10000);
		Account acc2;
		acc2= new Account("110-2128",20000);
		
		accList[0] = acc1;
		accList[1] = acc2;
		accList[2] = new Account("120-7129",30000);
		
		accList[0].deposit(5000);
		accList[1].withdraw(1000);

		System.out.println("첫번째 고객의 잔액: " + accList[0].getBalance());
		System.out.println("두번째 고객의 잔액: " + accList[1].getBalance());
		Account[] arr3=new Account[3];
	      arr3[0]=new Account("100-001-2000", 100000);
	      arr3[1]=new Account("100-002-3000", 200000);
	      
	      Account arr2 = new Account("100-003-4000", 300000);
	      arr3[2]=arr2;
	      
	      /*
	        int배열에는 int를 넣는다
	        String배열에는 String을 넣는다
	        Account배열에는 Account를 넣는다. 어떻게? new로 객체 생성해서 넣는다
	      */
	      
	      /*
	      arr3[0].withdraw(30000);
	      arr3[1].withdraw(30000);
	      arr3[2].withdraw(30000);
	      */
	      
	      System.out.println("\n=======모든 계좌 정보=========");
	      for(int i=0;i<arr3.length;i++) {
	         arr3[i].withdraw(30000);
	         arr3[i].display();
	      }
		
		
		
	}

}
