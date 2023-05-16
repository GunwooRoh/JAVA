package com.day18;

interface Attackable {
	public abstract void attack(Unit unit);
}

interface Movable {
	void move (int x, int y);
}

interface Fightable extends Attackable, Movable {
	
}

abstract class Unit {
	protected int x;
	protected int y;
	protected int currentHP;
	
	Unit(int x, int y, int currentHP) {
		this.x = x;
		this.y = y;
		this.currentHP =currentHP;
	}
}
class Fighter extends Unit implements Fightable {
	Fighter(int x, int y, int currentHP) {
		super(x, y, currentHP);
	}
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(x + ", " + y + " 위치로 이동한다");
	}
	public void attack(Unit unit) {
		System.out.println(unit.x + ", " + unit.y + " 위치에 있고, " + 
				unit.currentHP + " 의 체력을 갖는 유닛을 공격한다");
	}	
}


public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter(0, 0, 0);
		f.attack(new Fighter(10, 30, 200));
		f.move(50, 70);

		f.attack(new Fighter(50, 70, 150));
		
		f.move(60, 80);
		
		f.attack (new Fighter(60, 80, 100));
		
		System.out.println("---------------------");
		
		if (f instanceof Fighter) {
			System.out.println("f는 Fighter의 인스턴스이다");
		}
		
		if(f instanceof Unit) {
			System.out.println("f는 Unit의 인스턴스이기도 하다");
		}
		
		if (f instanceof Movable) {
			System.out.println("f는 Movable의 인스턴스이다");
		}
		
		if (f instanceof Attackable) {
			System.out.println("f는 Attackable의 인스턴스이다");
		}
	}

}
