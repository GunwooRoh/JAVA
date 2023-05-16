package com.day13.Example;

class Student {
	//1. 멤버변수
	private String name;
	private int idNo;
	
	//2. 생성자
	public Student(String name, int idNo) {
		this.name = name;
		this.idNo = idNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getidNo() {
		return idNo;
		
	}
	public void setidNo(int idNo) {
		this.idNo = idNo;
	}
	public void display(){
	System.out.println("이름 : " + name);
	System.out.println("학번 :" + idNo+"\n");
	}
		
	
}

public class StudentList {

	public static void main(String[] args) {
		Student[] nameList = new Student[4];
		
		Student list1 = new Student("홍길동", 2012001);
		Student list2;
		Student list3;
		Student list4;
		list2 = new Student("김연아", 2012002);
 
		
		
		nameList[0] = list1;
		nameList[1] = list2;
		nameList[2] = new Student("유재석", 2012003);
		nameList[3] = new Student("김유정", 2012004);

		for (int i = 0; i < nameList.length; i++) {
		
		System.out.println("이름 : " + nameList[i].getName());
		System.out.println("학번 : " + nameList[i].getidNo());
		System.out.println("-------------------------------");

		}

	}
}
