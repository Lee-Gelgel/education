package com.multi.day05;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("gelgel", "0505");
		if(result){
			System.err.println("�α��� �Ǿ����ϴ�.");
			memberService.logout("gelgel");
		} else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}
}
