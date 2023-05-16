package com.day17;

abstract class Player {
	protected boolean pause;
	protected int currentPos;
	
	Player() {
		pause = false;
		currentPos = 0;
	}
	
	abstract public void play(int pos);
	
	abstract public void stop();
	
	public void play() {
		play(currentPos);
	}
	
	public void pause() {
		if (pause) {
			pause = false;
			play(currentPos);
		}else {
			pause = true;
			stop();
		}
	}
}

public class AbstractTest3 {

	public static void main(String[] args) {
	}

}
