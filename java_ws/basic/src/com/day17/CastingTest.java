package com.day17;

class Car {
	public void drive() {
		System.out.println("운전하는 기능");
	}
	
	public void stop() {
		System.out.println("멈춤");
	}
}

class FireEngine extends Car {
	public void water() {
		System.out.println("water");
	}
	
	public void drive() {
		System.out.println("소방차를 운전합니다");
	}
}

class Ambulance extends Car {
	public void siren() {
		System.out.println("siren");
	}
	
	public void drive() {
		System.out.println("앰뷸런스를 운전합니다");
	}
}

public class CastingTest {

	public static void main(String[] args) {
		Car c = new FireEngine();
		c.drive();
		
		FireEngine f = (FireEngine)c; // down-casting 명시적 형변환
		f.water();
		
		//FireEngine f2 = (FireEngine)new Car(); << 실행에러
		
		if (c instanceof FireEngine) {
			FireEngine f3 = (FireEngine)c;
			f3.water();
		}else if (c instanceof Ambulance) {
			Ambulance am = (Ambulance)c;
			am.siren();
		}else {
			System.out.println("형변환 불가");
		}
		
		Car c2 = new Car();
		if (c2 instanceof FireEngine) {
			FireEngine f3 = (FireEngine)c;
			f3.water();
		}else {
			System.out.println("c2를 FireEngine으로 형변환 불가");
		}
		// 자식 instanceof 부모클래스 : true (자식은 부모의 인스턴스를 포함)
	
		FireEngine f4 = new FireEngine();
		if (f4 instanceof FireEngine) {
			System.out.println("f4는 FireEngine의 인스턴스");
		}
		if (f4 instanceof Car) {
			System.out.println("f4는 Car의 인스턴스이기도 하다");
		}
		if (f4 instanceof Object) {
			System.out.println("f4는 Object의 인스턴스이기도 하다");
		}
		
	}

}
