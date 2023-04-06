package com.day17;

class Unit {
	protected int x, y;
	
	public void move (int x, int y) {
		System.out.println("이동하는 메서드를 구현한다.");
	}
	
	public void stop() {
		System.out.println("현재 위치에 정지합니다.");
	}
}

class Marine extends Unit {
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		
		System.out.println("해병이 " + x + ", " + y + " 위치로 이동한다.");
	}
	
	public void stimPack() {
		System.out.println("스팀팩을 사용한다.");
	}

}

class Tank extends Unit {
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		
		System.out.println("탱크가 " + x + ", " + y + " 위치로 이동한다.");
	}
	
	public void changeMode() {
		System.out.println("공격모드를 변환한다.");
	}
	
}

class Dropship extends Unit {
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		
		System.out.println("수성선의 위치를 " + x + ", " + y + " 로 이동한다.");
	}
	
	public void load() {
		System.out.println("선택된 대상을 태운다.");
	}
	
	public void unload() {
		System.out.println("선택한 대상을 내린다.");
	}
}

public class BindingTest2 {

	public static void main(String[] args) {
		Unit[] uArr = new Unit[4];
		uArr[0] = new Marine();
		uArr[1] = new Tank();
		uArr[2] = new Dropship();
		uArr[3] = new Marine();
			
		Unit u = new Marine();
		if(u instanceof Marine) {
			Marine m = (Marine)u;
			m.stimPack();
			}
		
		for (int i = 0; i < uArr.length; i++) {
			if (uArr[i] instanceof Marine) {	
			Marine m = (Marine)uArr[i];
				m.stimPack();
			}else if (uArr[i] instanceof Tank) {
				Tank t = (Tank)uArr[i];
				t.changeMode();
			}else if (uArr[i] instanceof Dropship) {
				Dropship d = (Dropship)uArr[i];
				d.load();
				d.unload();
			}
		}
		
		for (Unit unit : uArr) {
			if (unit instanceof Marine) {	
				Marine m = (Marine)unit;
					m.stimPack();
				}else if (unit instanceof Tank) {
					Tank t = (Tank)unit;
					t.changeMode();
				}else if (unit instanceof Dropship) {
					Dropship d = (Dropship)unit;
					d.load();
					d.unload();
				}
		}
	}

}
