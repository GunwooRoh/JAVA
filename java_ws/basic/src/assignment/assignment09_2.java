package assignment;

import java.util.Scanner;

class PhoneInfo8 {
	protected String name, tel;
	
    public PhoneInfo8(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
	
	public void showInfo() {
		System.out.println("name : " + name);
		System.out.println("phone : " + tel);
	}
}

class PhoneUnivInfo extends PhoneInfo8 {
	public String major;
	public int year;
	
	public PhoneUnivInfo(String name, String tel, String major, int year) {
		super(name, tel);
		this.major = major;
		this.year = year;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("major : " + major);
		System.out.println("year : " + year);
	}
}

class PhoneCompanyInfo extends PhoneInfo8 {
	public String company;

	public PhoneCompanyInfo(String name, String tel, String company) {
		super(name, tel);
		this.company = company;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("company : " + company);
	}
}
public class assignment09_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhoneInfo8[] p = new PhoneInfo8[3];
		int count = 0;
		while (true) {
			System.out.println("선택하세요.");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 전체 데이터 조회");
			System.out.println("3. 데이터 검색");
			System.out.println("4. 데이터 삭제");
			System.out.println("5. 프로그램 종료");
			
			int input = sc.nextInt();
			
			switch (input) {
			case 1 : 
				System.out.println();
				System.out.println("데이터 입력을 시작합니다...");
				System.out.println();
				System.out.println("1. 일반 2. 대학 3. 회사");
				int input2 = sc.nextInt();
				sc.nextLine();
				
				System.out.print("이름: ");
				String name = sc.nextLine();
				System.out.print("전화번호: ");
				String tel = sc.nextLine();
				
				switch (input2) {
				case 1 :
					p[count] = new PhoneInfo8(name, tel);
					break;
				
				case 2 :
					System.out.print("전공 : ");
					String major = sc.nextLine();
					System.out.print("학번 : ");
					int year = sc.nextInt();
					p[count] = new PhoneUnivInfo(name, tel, major, year);
                    break;
                    
				case 3 :
					System.out.print("회사 : ");
					String company = sc.nextLine();
					p[count] = new PhoneCompanyInfo(name, tel, company);
					break;
				
				default : 
					System.out.println("잘못 입력하셨습니다.");
					System.out.println();
					continue;
				}
				count++;
				System.out.println("데이터 입력이 완료되었습니다.");
				System.out.println("-------------------------------");
				break;
				
			case 2 :
				System.out.println("전체 데이터를 출력합니다.");
				for (int i = 0; i < count; i++) {
					p[i].showInfo();
					
					
					System.out.println("-------------------------------");
				}
				break;
			
			case 3 :
			    System.out.print("검색할 이름을 입력하세요 : ");
			    String searchName = sc.next();

			    for (PhoneInfo8 phoneInfo : p) {
			        if (phoneInfo.name.equals(searchName)) {
			            phoneInfo.showInfo();
			            System.out.println();
			            System.out.println("데이터 검색이 완료되었습니다.");
			            System.out.println("-------------------------------");
			            break;
			        }
			        System.out.println("검색 결과가 없습니다.");
			    }
			    break;
			    
			case 4 :
			    System.out.println("데이터 삭제를 시작합니다...");
			    if (count == 0) {
			        System.out.println("삭제할 데이터가 없습니다.");
			        break;
			    }
			    System.out.print("삭제할 이름을 입력하세요 : ");
			    String deleteName = sc.next();
			    int deleteIndex = -1;
			    for (int i = 0; i < count; i++) {
			        if (p[i].name.equals(deleteName)) {
			            deleteIndex = i;
			            break;
			        }
			    }
			    if (deleteIndex == -1) {
			        System.out.println("삭제할 데이터가 없습니다.");
			        break;
			    }
			    for (int i = deleteIndex; i < count - 1; i++) {
			        p[i] = p[i + 1];
			    }
			    count--;
			    System.out.println("데이터 (" + deleteName + ")가 삭제되었습니다.");
			    break;
			    
			case 5 : 
				System.out.println("프로그램을 종료합니다.");
				return;
			}		
		}
	}

}
