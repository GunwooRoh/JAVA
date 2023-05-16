package com.day18;

class TV {
	public void onTV() {
		System.out.println("TV 영상 출력 중");
	}
}

interface Computer {
	public void dataReceive();
}

class IPTV extends TV implements Computer {
	public void dataReceive() {
		System.out.println("영상 데이터 수신 중");
	}
	
	public void powerOn() {
		dataReceive();
		onTV();
	}
}

public class InterfaceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
