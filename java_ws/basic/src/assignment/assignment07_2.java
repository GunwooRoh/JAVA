package assignment;

import java.util.Scanner;

class Phone3 {
    private String name;
    private String tel;
    private String birth;

    public Phone3(String name, String tel, String birth) {
        this.name = name;
        this.tel = tel;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public String getBirth() {
        return birth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void showInfo() {
        System.out.println("name : " + name);
        System.out.println("phone : " + tel);
        if (birth != null && !birth.isEmpty()) {
            System.out.println("birth : " + birth);
        }
    }

}

public class assignment07_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone3 p[] = new Phone3[100];
        int count = 0;

        while (true) {

            System.out.println("메뉴를 선택하세요.");
            System.out.println("1. 데이터 입력");
            System.out.println("2. 전체 데이터 조회");
            System.out.println("3. 데이터 검색");
            System.out.println("4. 데이터 삭제");
            System.out.println("5. 프로그램 종료");

            System.out.print("선택 : ");
            int input = sc.nextInt();

            if (input == 1) {
                System.out.println("데이터 입력을 시작합니다");
                System.out.print("이름 : ");
                String name = sc.next();
                sc.nextLine();
                System.out.print("전화번호 : ");
                String tel = sc.nextLine();
                System.out.print("생년월일 : ");
                String birth = sc.nextLine();
                System.out.println("데이터 입력이 완료되었습니다.");

                p[count++] = new Phone3(name, tel, birth);

                System.out.println();
            } else if (input == 2) {
                System.out.println("--------------전체 데이터 조회--------------");
                for (int i = 0; i < count; i++) {
                    System.out.println(i + 1 + "번째 데이터");
                    p[i].showInfo();
                }
            } else if (input == 3) {
                System.out.println("데이터 검색을 시작합니다.");
                System.out.print("이름 : ");
                String name2 = sc.nextLine();
                for (int i = 0; i < count; i++) {
                    if (p[i].getName().equals(name2)) {
                        p[i].showInfo();
                        System.out.println("데이터 검색이 완료되었습니다.");
                        break;
                    }
                }
            } else if (input == 4) {
                System.out.println("데이터를 삭제합니다.");
                System.out.print("이름 : ");
                String delName = sc.nextLine();
                for (int i = 0; i < count; i++) {
                    if (p[i].getName().equals(delName)) {
                        count--;
                        //p = delete(p, i);
                        System.out.println("데이터 삭제가 완료되었습니다.");
                        break;
                    }
                }
            } else if (input == 5) {
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            }
        }
    }
}