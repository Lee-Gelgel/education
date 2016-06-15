package com.multi.day23;

public class Product {
	private String prodId;
	private String maker;
	private String prodName;
	private int price;
	private int amount;

	public Product(String prodId, String maker, String prodName, int price,	int amount) {
		this.prodId = prodId;
		this.maker = maker;
		this.prodName = prodName;
		this.price = price;
		this.amount = amount;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String toString() {
		return "Product [prodId=" + prodId + ", maker=" + maker + ", prodName="
				+ prodName + ", price=" + price + ", amount=" + amount + "]";
	}	
	
}