package com.jdbc.day3;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.pd.model.PdDAO;
import com.pd.model.PdDTO;

public class PdManager {
	private Scanner sc=new Scanner(System.in);
	private PdDAO pdDao;	
	
	public PdManager() {
		pdDao=new PdDAO();
	}

	public void printTitle() {
		System.out.println("\n--------------상품 목록---------------");
		System.out.println("번호\t상품명\t가격\t등록일");
		System.out.println("---------------------------------------");
	}

	public void register() throws SQLException {
		//1.
		System.out.println("상품명, 가격 입력!");
		String pdName=sc.nextLine();
		int price=Integer.parseInt(sc.nextLine());
		
		//2.
		PdDTO dto=new PdDTO();
		dto.setPdName(pdName);
		dto.setPrice(price);
		int cnt = pdDao.insertPd(dto);
		
		//3.
		String result=(cnt>0)?"상품등록 성공":"상품등록 실패";
		System.out.println(result);
	}

	public void mainMenu() {
		System.out.println("------------------------------------------");
		System.out.println("1.등록 2.전체조회 3.수정 4.삭제 5.검색 6.종료");
		System.out.println("------------------------------------------");
		System.out.println("번호를 입력하세요");
	}

	public void printAll() throws SQLException {
		//1.사용자로부터 입력받기		
		//2. db작업 - 로직 처리
		List<PdDTO> list=pdDao.selectAll();
		
		//3. 결과 처리 (화면 출력)
		printTitle();
		for(int i=0;i<list.size();i++) {
			PdDTO dto=list.get(i);
			
			System.out.println(dto.getNo()+"\t"+dto.getPdName()+"\t"
					+ dto.getPrice()+"\t"+dto.getRegdate());
		}//for
		
	}

	public void printByNo() throws NumberFormatException, SQLException {
		//1. 사용자로부터 입력받기
		System.out.println("번호 입력!");
		String no=sc.nextLine();
		
		if(no==null || no.isEmpty()) {
			System.out.println("조회할 번호를 입력하세요!");
			return;
		}
		
		//2. db작업 - 로직 처리
		PdDTO dto=pdDao.selectByNo(Integer.parseInt(no));
		
		//3. 결과 처리 (화면 출력)
		printTitle();
		System.out.println(dto.getNo()+"\t"+dto.getPdName()+"\t"
				+ dto.getPrice()+"\t"+dto.getRegdate()+"\n");		
	}

	public void edit() {
		//1
		System.out.println("수정할 번호,상품명,가격 입력!");
		String no=sc.nextLine();
		String pdName=sc.nextLine();
		String price=sc.nextLine();
		
		//2
		
		//3
		
	}

}








