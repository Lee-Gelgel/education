package com.multi.day05;

public class ShopService {
	
	//변수
	private static ShopService shopService;
	static{
		shopService = new ShopService();
	}
	//생성자의 접근권한을 private로 설정한다
	private ShopService(){
	
	}
	//외부에서 접근가능한 함수정의
	public static ShopService getInstance(){
		return shopService;
	}
	
	
}
