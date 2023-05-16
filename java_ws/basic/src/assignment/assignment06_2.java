package assignment;

import java.util.Scanner;

class RockSissPaper {
	
	private String rock;
	private String siss;
	private String paper;
	
	RockSissPaper(String rock, String siss, String paper) {
		this.rock = rock;
		this.siss = siss;
		this.paper = paper;
	}
	
	public String getRock() {
		return rock;
	}
	
	public String getSiss() {
		return siss;
	}
	
	public String getPaper() {
		return paper;
	}
	
	public void setRock() {
		this.rock = rock;
	}
	
	public void setSiss() {
		this.siss = siss;
	}
	
	public void setPaper() {
		this.paper = paper;
	}
	
	public void showInfo() {
		System.out.println("사용자 = " );
		System.out.println("이름 : " );
		System.out.println("학번 : "  + "\n");
		
	}
	
}

public class assignment06_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위<0>, 바위<1>, 보<2>, Q<Quit>를 입력해주세요");
		int choice = sc.nextInt();
		sc.nextLine();
		

	}

}
