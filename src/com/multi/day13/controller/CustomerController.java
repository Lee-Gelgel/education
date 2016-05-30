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
			System.out.println("===�۾��� �����ϼ���===");
			System.out.println("1. ��ü��ȸ 2.���̵���ȸ");
			System.out.print("�Է�>>");
			int selectNo = sc.nextInt();
			if(selectNo==1){
				List<CustomerDTO> custList = custDAO.selectAll();
				SuccessView.print(custList);
			} else if(selectNo==2){
				System.out.print("���̵��Է�>>");
				int id = sc.nextInt();
				CustomerDTO cust = custDAO.selectById(id);
				SuccessView.print(cust);
			} else {
				break;
			}
		}
		System.out.println("����");
	}
}
