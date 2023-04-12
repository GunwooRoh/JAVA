package com.day12;

import java.util.Scanner;

class Programmer{	
	private String name;
	private String language;
	private int career;
	
	public Programmer(String name, String language, int career) {		
		this.name = name;
		this.language = language;
		this.career = career;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;		
	}

	public void setLanguage(String lang){
		this.language = lang;
	}

	public String getLanguage()	{
		return language;
	}

	public int getCareer(){
		return career;
	}

	public void setCareer(int career){
		this.career = career;			
	}

	public void work(){									
		System.out.println("프로그래밍을 합니다\n");
	}		
}

public class ProgrammerExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 개발언어, 개발경력을 입력하세요");	
		String name = sc.nextLine();
		String lang = sc.nextLine();
		int career = sc.nextInt();
		System.out.println("==================================");

		Programmer p = new Programmer(name, lang, career);

		System.out.println("이름:"+p.getName());
		System.out.println("개발언어:"+p.getLanguage());
		System.out.println("개발경력: "+ p.getCareer() +"년");

		p.work();
		
		p.setName("김길동");
		p.setLanguage("c");
		p.setCareer(5);
		
		System.out.println("이름:"+p.getName());
		System.out.println("개발언어:"+p.getLanguage());
		System.out.println("개발경력: "+ p.getCareer() +"년");
		
	}
}
