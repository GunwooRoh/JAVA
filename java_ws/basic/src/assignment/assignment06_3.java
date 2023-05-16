package assignment;

class PhoneInfo {
	private String name;
	private String num;
	private String brth;
	
	PhoneInfo(String name, String num, String brth) {
		this.name = name;
		this.num = num;
		this.brth = brth;
	}
	
	PhoneInfo(String name, String num) {
		this.name = name;
		this.num = num;
	}

	
	public String getName() {
		return name;
	}
	public String getNum() {
		return num;
	}
	public String gertBrth() {
		return brth;
	}
	
	public void setName() {
		this.name = name;
	}
	public void setNum() {
		this.num = num;
	}
	public void setBrth() {
		this.brth = brth;
	}
	
	public void showinfo() {
		if (brth == null) {
			System.out.println("name : " + name);
			System.out.println("phone : " + num);
		} else {
			System.out.println("name : " + name);
			System.out.println("phone : " + num);
			System.out.println("birth : " + brth);
		}
		
	}
	
}

public class assignment06_3 {

	public static void main(String[] args) {
		
		PhoneInfo Info1 = new PhoneInfo("홍길동", "010-100-2000", "92-01-17");
		PhoneInfo Info2 = new PhoneInfo("김연아", "010-300-4000" );
		
		Info1.showinfo();
		System.out.println();
		Info2.showinfo();


	}

}
