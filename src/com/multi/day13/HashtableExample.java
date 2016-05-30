package com.multi.day13;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fail", "1234");
		map.put("winter","12345");
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("아이디와 비밀번호 입력");
			System.out.print("아이디>>");
			String id = sc.nextLine().trim();
			
			System.out.print("비밀번호>>");
			String password = sc.nextLine().trim();
			System.out.println();
			
			if(map.containsKey(id)){
				if(map.get(id).equals(password)){
					System.out.println("로그인");
					break;
				} else {
					System.out.println("비밀번호 일치하지 않음");
				}
			} else {
				System.out.println("입력하신 아이디 존재하지 않음");
			}
		}
	}
}
