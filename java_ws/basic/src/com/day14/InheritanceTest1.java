package com.day14;

class Parents {
	protected String name;
	protected int age;
	protected int money = 10000;
	
}

class Son extends Parents {
	Son () {
		this.name = "자식";
		this.age = 35;
	}

public void showInfo() {
	System.out.println("나는 " + this.name);
	System.out.println("나이는 " + this.age);
	System.out.println("물려받은 유산은 " + money);
	}
}

class Daughter extends Parents {
	Daughter () {
		this.name = "딸";
		this.age = 25;
	}

	public void showInfo() {
	System.out.println("나는 " + this.name);
	System.out.println("나이는 " + age);
	}	
}

class GrandChild extends Son {
	GrandChild () {
		this.name = "손자";
		this.age = 2;
	}
	
	public void showInfo() {
	System.out.println("나는 " + this.name);
	System.out.println("나이는 " + age);
	}
}

public class InheritanceTest1 {

	public static void main(String[] args) {
		Son son = new Son();
		son.showInfo();
		
		System.out.println("-----------------------");
		
		Daughter daughter = new Daughter();
		daughter.showInfo();
		
		System.out.println("-----------------------");
		
		GrandChild gc = new GrandChild();
		gc.showInfo();

	}

}
