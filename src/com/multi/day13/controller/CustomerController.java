package com.multi.day13.controller;

import java.util.List;
import java.util.Scanner;

import com.multi.day13.model.CustomerDAO;
import com.multi.day13.model.CustomerDTO;
import com.multi.day13.view.SuccessView;

public class CustomerController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomerDAO custDAO = new CustomerDAO();
		while(true){
			System.out.println("===작업을 선택하세요===");
			System.out.println("1. 전체조회 2.아이디조회");
			System.out.print("입력>>");
			int selectNo = sc.nextInt();
			if(selectNo==1){
				List<CustomerDTO> custList = custDAO.selectAll();
				SuccessView.print(custList);
			} else if(selectNo==2){
				System.out.print("아이디입력>>");
				int id = sc.nextInt();
				CustomerDTO cust = custDAO.selectById(id);
				SuccessView.print(cust);
			} else {
				break;
			}
		}
		System.out.println("종료");
	}
}
