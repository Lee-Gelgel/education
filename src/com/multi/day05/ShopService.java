package com.multi.day05;

public class ShopService {
	
	//����
	private static ShopService shopService;
	static{
		shopService = new ShopService();
	}
	//�������� ���ٱ����� private�� �����Ѵ�
	private ShopService(){
	
	}
	//�ܺο��� ���ٰ����� �Լ�����
	public static ShopService getInstance(){
		return shopService;
	}
	
	
}
