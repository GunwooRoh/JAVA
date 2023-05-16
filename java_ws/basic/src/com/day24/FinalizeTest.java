package com.day24;

class MyTest {
	private String objName;
	
	MyTest(String name) {
		this.objName = name;
	}
	
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println(objName + " 소멸");
	}
}

public class FinalizeTest {

	public static void main(String[] args) {
		MyTest obj1 = new MyTest("인스턴스1");
		MyTest obj2 = new MyTest("인스턴스2");
		
		//obj1 = null;
		//obj2 = null;
		
		obj1 = obj2;
		obj2 = null;
		obj1 = null;
		
		System.out.println("프로그램을 종료합니다");
		
		System.gc();
		System.runFinalization();

	}

}
