package com.day18etc;

class Child {
	private int numOfBead;
	
	Child (int numOfBead) {
		this.numOfBead = numOfBead;
	}
	
	public int getNumOfBead() {
		return numOfBead;
	}
	
	public void setNumOfBead(int numOfBead) {
		this.numOfBead = numOfBead;
	}
	
	public int loseBead(int loseBead) {
		if (loseBead > numOfBead) {
			loseBead = numOfBead;
		}
		numOfBead -= loseBead;
		return numOfBead;
	}
	
	public void obtainBead(Child child, int obtainCount) {
		child.loseBead(obtainCount);
		numOfBead += obtainCount;
	}
	
	public void showProperty() {
		System.out.println("보유 구슬의 개수 : " + numOfBead + "개");
	}
}

public class BeadPlay {

	public static void main(String[] args) {
		Child c1 = new Child(15);
		Child c2 = new Child(9);
		
		System.out.println("게임 전 구슬의 보유 개수");
		System.out.println("-----어린이 1-----");
		c1.showProperty();
		
		System.out.println("-----어린이 2-----");
		c2.showProperty();
		
		c1.obtainBead(c2, 2);
		c2.obtainBead(c1, 7);
		
		System.out.println("\n게임 후 구슬의 보유 개수");
		System.out.println("-----어린이 1-----");
		c1.showProperty();
		
		System.out.println("-----어린이 2-----");
		c2.showProperty();
	}

}
