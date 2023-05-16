package com.day20.Collection;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		//ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<Integer>(3);
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		for (int i = 0; i < list.size(); i++) {
			int k = list.get(i);
			System.out.println(k);
		}
		
		//삭제
		list.remove(1); //index가 1인 데이터 삭제
		System.out.println("\n-----------삭제후------------");
		for (int n : list) {
			System.out.println(n);
		}
		
		//for문에서 초기화
		ArrayList<Integer> list2 = new ArrayList<>();
			
		/*
		for (int i = 0; i < list2.size(); i++) {
			list2.add(i + 1);			
		} 
		*/
		
		for (int i = 0; i < 4; i++) {
			list2.add(i + 1);
		} 
		
		System.out.println("-------------------------------");
		
		//읽어오기
		for (int n : list2) {
			System.out.print(n + " ");
		}
		
		System.out.println("\n\nlist2.size = " + list2.size());
		
	}
	

}
