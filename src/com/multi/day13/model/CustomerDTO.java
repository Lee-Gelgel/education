package com.multi.day13.model;

//DTO(Data Transfer Object)
public class CustomerDTO {
	private int custId;
	private String name;
	private String phone;

	public CustomerDTO(int custId, String name, String phone) {
		super();
		this.custId = custId;
		this.name = name;
		this.phone = phone;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "CustomerDTO [custId=" + custId + ", name=" + name + ", phone=" + phone + "]";
	}

}
