package com.multi.day13.view;

import java.util.List;

import com.multi.day13.model.CustomerDTO;

public class SuccessView {
	public static void print(List<CustomerDTO> custList) {
		System.out.println("****������ �����ֱ�****");
		for (CustomerDTO cust : custList) {
			System.out.println(cust);
		}
	}

	public static void print(CustomerDTO cust) {
		System.out.println("****�ѰǸ� �����ֱ�****");
		System.out.println(cust);
	}
	
	public static void print(String msg){
		System.out.println(msg);
	}
}
