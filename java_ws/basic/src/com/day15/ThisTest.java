package com.day15;

class Car {
	private String Color;
	private String gearType;
	private int door;
	
	Car() {
		this("white", "auto", 4);
	/*  this.Color = "white";
		this.gearType = "auto";
		this.door = 4; */
		
	}
	
	Car(String Color) {
		this(Color, "auto", 4);
	}
	
	Car (String Color, String gearType, int door) {
		this.Color = Color;
		this.gearType = gearType;
		this.door = door;
	}
	
	public void showInfo() {
		System.out.println("Color : " + Color + ", GearType : " + gearType + ", Door : " + door);
	}
}


public class ThisTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("blue");
		
		c1.showInfo();
		c2.showInfo();

	}

}
