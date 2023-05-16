package assignment;

import java.util.Scanner;

class Student {
	private String name;
	private int idNm;
	
	Student(String name, int idNm) {
		this.name = name;
		this.idNm = idNm;
	}
	
	public String getName() {
		return name;
	}
	
	public int getidNm() {
		return idNm;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setidNm(int idNm) {
		this.idNm = idNm;
	}
	
	public void showInfo() {
		System.out.println("\n=====학생 리스트=====\n");
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + idNm + "\n");
		
	}
}	


	public class assignment06_1 {
	
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				Student s[] = new Student[100];
				int totalCount = 0;
				
				while (true) {
				
					System.out.println("1.저장 2.전체학생 조회 3.종료 선택");
					System.out.println("메뉴를 선택하세요");
					String choice = sc.nextLine();
					
					switch (choice) {
					case "1" :
						System.out.println("이름, 학번을 입력하세요");
						String newname = sc.nextLine();
						int newnum = sc.nextInt();
						sc.nextLine();
						
						s[totalCount] = new Student(newname, newnum);
						totalCount++;
						continue;
						
					case "2" :	
						for (int i = 0; i < totalCount; i++) {
							s[i].showInfo();
						}
						continue;
						
					case "3" :
						System.out.println("종료합니다");
						return;
					
					default :
						System.out.println("다시 입력");
						continue;
						
				}
					
		}

	}
}