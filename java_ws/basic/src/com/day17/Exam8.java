package com.day17;

public class Exam8 {
	public static void action(Robot arr) {
		if(arr instanceof DanceRobot) {
			DanceRobot d = (DanceRobot)arr;
			d.dance();
		}else if(arr instanceof SingRobot) {
			SingRobot s = (SingRobot)arr;
			s.sing();
		}else if(arr instanceof DrawRobot) {
			DrawRobot d = (DrawRobot)arr;
			d.draw();
		}
	}
	
	public static void main(String[] args) {   
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		for (int i = 0; i < arr.length; i++) {
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof DanceRobot) {
				DanceRobot d = (DanceRobot)arr[i];
				d.dance();
			} else if (arr[i] instanceof SingRobot) {
				SingRobot s = (SingRobot)arr[i];
				s.sing();
			} else if (arr[i] instanceof DrawRobot) {
				DrawRobot r = (DrawRobot)arr[i];
				r.draw();
			}
		}
		
		System.out.println("---------------------------");
		
		for (Robot robot : arr) {
			if (robot instanceof DanceRobot) {
				DanceRobot d = (DanceRobot)robot;
				d.dance();
			} else if (robot instanceof SingRobot) {
				SingRobot s = (SingRobot)robot;
				s.sing();
			} else if (robot instanceof DrawRobot) {
				DrawRobot r = (DrawRobot)robot;
				r.draw();
			}
		}
	}
}

class Robot {
	
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}	
}