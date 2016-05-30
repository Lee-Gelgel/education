package com.multi.day13.view;

import java.util.List;

import com.multi.day13.model.CustomerDTO;

public class SuccessView {
	public static void print(List<CustomerDTO> custList) {
		System.out.println("****여러건 보여주기****");
		for (CustomerDTO cust : custList) {
			System.out.println(cust);
		}
	}

	public static void print(CustomerDTO cust) {
		System.out.println("****한건만 보여주기****");
		System.out.println(cust);
	}
	
	public static void print(String msg){
		System.out.println(msg);
	}
}
