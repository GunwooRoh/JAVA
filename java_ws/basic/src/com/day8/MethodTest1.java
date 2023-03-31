package com.day8;

public class MethodTest1 {

	public static void main(String[] args) {
		/*
		 메서드
		 - 특정 기능을 수행하는 최소 실행 단위
		 - 자주 반복하여 사용하는 내용에 대해 특정 이름으로 정의한 묶음
		 - 필요할 때마다 호출하여 원하는 작업을 시킬 수 있다
		 - 불필요한 반복 제거, 코드의 재사용성을 높이는 역할
		 
		 객체 지향 기법 - 클래스에 소속되는 함수를 메서드라고 부름
		 
		 메서드 형식
		 접근제한자  반환형  메서드이름(매개변수){
		 	특정기능;
		 	
		 	return 결과값;
		 } 
		 
		 입력값 - 매개변수, parameter, 인수, 인자
		 결과값의 형태 - 반환형, return type		 
		*/
		
		double n=calcInterest(1000000);
		System.out.println(n);
		
		/*
		 메서드 호출
		 static메서드인 경우
		 [1] 같은 클래스 안에 있는 메서드 호출
		 메서드명();
		 
		 [2] 다른 클래스 안에 있는 메서드 호출
		 클래스명.메서드명();
		*/
	}//main
	
	//반환형 - return 해주는 결과값의 자료형을 써준다
	//반환값(결과값)이 없는 메서드의 반환형은 void
	public static double calcInterest(int money) {
		double interest = money*0.03; //이자 계산 로직, 특정 기능
		
		return interest; //결과값 반환
		/*
		  return
		  [1] 메서드의 실행을 종료하고 호출원으로 복귀함(자신을 호출한 곳으로 돌아감)
		  	예) if(조건) return; 
		  [2] 메서드의 처리 결과를 호출원으로 돌려주는 기능도 함
		  	예) return 결과값;
		  	
		  	한 개의 값만 반환해줄 수 있다.
		*/

	}

}
