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
			System.out.println("���̵�� ��й�ȣ �Է�");
			System.out.print("���̵�>>");
			String id = sc.nextLine().trim();
			
			System.out.print("��й�ȣ>>");
			String password = sc.nextLine().trim();
			System.out.println();
			
			if(map.containsKey(id)){
				if(map.get(id).equals(password)){
					System.out.println("�α���");
					break;
				} else {
					System.out.println("��й�ȣ ��ġ���� ����");
				}
			} else {
				System.out.println("�Է��Ͻ� ���̵� �������� ����");
			}
		}
	}
}
