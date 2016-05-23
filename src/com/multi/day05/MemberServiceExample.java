package com.multi.day05;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("gelgel", "0505");
		if(result){
			System.err.println("로그인 되었습니다.");
			memberService.logout("gelgel");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
