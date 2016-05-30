package com.multi.day13.model;

import java.util.ArrayList;
import java.util.List;

//업무로직...Business Logic
//DAO(Data Access Object)
public class CustomerDAO {
	// 조회
	public List<CustomerDTO> selectAll() {
		List<CustomerDTO> custList = new ArrayList<>();
		custList.add(new CustomerDTO(100, "gelgel", "010-1234-1234"));
		custList.add(new CustomerDTO(200, "lulu", "010-5678-5678"));
		custList.add(new CustomerDTO(300, "simon", "010-3456-3456"));
		custList.add(new CustomerDTO(400, "donald", "010-2345-2345"));
		custList.add(new CustomerDTO(500, "jhon", "010-6789-6789"));
		return custList;
	}
	// 조건조회
	public CustomerDTO selectById(int custId){
		 List<CustomerDTO> custList = new ArrayList<>();
		 custList.add(new CustomerDTO(100, "gelgel", "010-1234-1234"));
		 custList.add(new CustomerDTO(200, "lulu", "010-5678-5678"));
		 custList.add(new CustomerDTO(300, "simon", "010-3456-3456"));
		 custList.add(new CustomerDTO(400, "donald", "010-2345-2345"));
		 custList.add(new CustomerDTO(500, "jhon", "010-6789-6789"));
		 for (int i = 0; i < custList.size(); i++) {
			if(custList.get(i).getCustId()==custId){
				return custList.get(i);
			}
		}
		return null;
	}
	
	
}
