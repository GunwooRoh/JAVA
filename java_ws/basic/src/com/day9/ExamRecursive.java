package com.day9;

public class ExamRecursive {
	public static int fibonacci(int num){
		/*
		 fib(n) = 	0                  n=0
      				1			 	   n=1 			
	      fib(n-2) + fib(n-1)          n=2 이상

		 */
		int result=0;
		if (num==0) {
			result = 0;
		}else if (num==1) {
			result = 1;
		}else {
			result = fibonacci(num-2)+fibonacci(num-1);  
			/*
			  f(0)+f(1)
			   0+1
			*/
			/*
			 f(1)+f(2)
			  1 + f(0)+f(1)
			       0 + 1
			*/
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		for (int i=0;i<10 ; i++){
			int num = fibonacci(i);
			System.out.print(num); //0, 1, 1, 2, 
			
			if (i!=9)  
				System.out.print(", ");
		}
		
	}

}
