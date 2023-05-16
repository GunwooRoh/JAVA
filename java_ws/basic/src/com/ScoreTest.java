package com;

import java.util.Scanner;

class Score {
	private String name;
	private String course;
	private int java;
	private int oracle;
	private int JSP;
	
	Score(String name, String course, int java, int oracle, int JSP) {
		this.name = name;
		this.course = course;
		this.java = java;
		this.oracle = oracle;
		this.JSP = JSP;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCourse() {
		return course;
	}
	
	public int getJava() {
		return java;
	}
	
	public int getOracle() {
		return oracle;
	}
	
	public int getJsp() {
		return JSP;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	public void setJava(int java) {
		this.java = java;
	}
	
	public void setOracle(int oracle) {
		this.oracle = oracle;
	}
	
	public void setJsp(int JSP) {
		this.JSP = JSP;
	}
	
	public int getTotal() {
		return java + oracle + JSP;
	}
	
	public double getAverage() {
		return (double)(getTotal() / 3);
	}
	
	public String grade() {
		double average = getAverage();
		if (average >= 90) {
			return "A";
		} else if (average >= 80 && average < 90) {
			return "B";
		} else if (average >= 70 && average < 80) {
			return "C";
		} else if (average >= 60 && average < 70) {
			return "D";
		} else {
			return "F";
		}
	}
	
	public void showInfo(int total, double average, String grade) {

		System.out.println("=============================전체 학생 성적 조회 결과==============================");
		System.out.println("학생이름\t클래스\tjava\toracle\tjsp\t총점\t평균\t학점");
		System.out.println("=============================================================================");
		System.out.println(name +"\t"+ course + "\t" + java + "\t" + oracle + "\t" + JSP + "\t" + total + "\t" + average + "\t" + grade);
		System.out.println("=============================================================================");
	}
	
}

class ScoreTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Score[] s = new Score[100];
		int count = 0;
		while (true) {
			System.out.println("1. 성적입력");
			System.out.println("2. 전체학생의 성적 조회");
			System.out.println("3. 학생별 성적 조회");
			System.out.println("4. 클래스(반)별 성적 조회");
			System.out.println("5. 학생 성적 수정");
			System.out.println("6. 종료");
			
			System.out.print("선택하세요 : ");
			
			int input = sc.nextInt();
			for(int i = 0; i < s.length; i++) {
				switch (input) {
				case 1 :
					System.out.println("학생이름, 반, java, oracle, jsp 점수를 입력하세요.");
					String name = sc.nextLine();
					String course = sc.nextLine();
					sc.nextLine();
					int java = sc.nextInt();
					int oracle = sc.nextInt();
					int JSP = sc.nextInt();
					s[i] = new Score(name, course, java, oracle, JSP);
					break;
				
				case 2 :
					s[i].getName();
					s[i].getCourse();
					s[i].getJava();
					s[i].getOracle();
					s[i].getJsp();
					int total = s[i].getTotal();
					double average = s[i].getAverage();
					String grade = s[i].grade();
					s[i].showInfo(total, average, grade);
					break;
					
				case 3 :
				    System.out.print("조회할 학생의 이름을 입력하세요: ");
				    String nameToSearch = sc.nextLine();
				    boolean found = false;
				    for (int j = 0; j < i; j++) {
				        if (s[j].getName().equals(nameToSearch)) {
				            found = true;
				            int total2 = s[j].getTotal();
				            double average2 = s[j].getAverage();
				            String grade2 = s[j].grade();
				            s[j].showInfo(total2, average2, grade2);
				        } else {
				        	System.out.println("잘못입력하셨습니다.");
				        	continue;
				        }
				        break;
				    }
				    if (!found) {
				        System.out.println("해당 학생을 찾을 수 없습니다.");
				    }
				    break;
				    
				case 4 : 
					System.out.println("조회할 반을 입력하세요.");
					String courseToSearch = sc.nextLine();
					boolean found2 = false;
					for (int j = 0; j < i; i++) {
						if (s[j].getCourse().equals(courseToSearch)) {
							found2 = true;
							int total3 = s[j].getTotal();
							double average3 = s[j].getAverage();
				            String grade3 = s[j].grade();
				            s[j].showInfo(total3, average3, grade3);
						}else {
							System.out.println("잘못 입력하셨습니다.");
							continue;
						}
					}
					break;
				
				case 5 :
					System.out.println("클래스<반>와 학생이름을 입력하세요.");
					String ac = sc.nextLine();
					String an = sc.nextLine();
					for (int j = 0; j <i; j++) {
						if (s[j].getCourse().equals(ac) && s[j].getName().equals(an)) {
					System.out.println("수정하려는 점수를 java, oracle, jsp 과목 순으로 입력하세요.");
					int java2 = sc.nextInt();
					int oracle2 = sc.nextInt();
					int JSP2 = sc.nextInt();
					s[j].setJava(java2);
					s[j].setOracle(oracle2);
					s[j].setJsp(JSP2);
					int total2 = s[j].getTotal();
					double average2 = s[j].getAverage();
					String grade2 = s[j].grade();
					s[j].showInfo(total2, average2, grade2);
					break;
					}
				}
			
				case 6 :
					System.out.println("종료합니다.");
					return;
					
				default :
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					continue;
			}
			}
		}
	}
}
	



