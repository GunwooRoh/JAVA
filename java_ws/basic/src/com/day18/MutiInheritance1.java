package com.day18;

interface TV2 {
	public abstract void onTV2();
	
}

interface Computer2 {
	public abstract void dataReceive();
}

class IPTV2 implements TV2, Computer2 {
	public void onTV2() {
		System.out.println("TV 영상 출력 중");
	}
	
	
	public void dataReceive() {
		System.out.println("영상 데이터 수신 중");
	}
	
	public void powerOn() {
		dataReceive();
		onTV2();
	}
}

public class MutiInheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
