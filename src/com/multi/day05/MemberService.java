package com.multi.day05;

public class MemberService {
	// �޼���
	boolean login(String id, String password) {
		boolean result = false;
		if (id == "gelgel" && password == "0505") {
			result = true;
		}
		return result;
	}

	void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}

}
