package com.kh.silsub2.model.vo;

public class Product {
	String pName;
	int price;
	String brand;
	
	public Product() {}
	
	public Product(String pName, int price, String brand) {
		this.price=price;
		this.pName=pName;
		this.brand=brand;
	}
	
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String brand() {
		return brand;
	}
	public void setpName(String pName) {
		this.pName=pName;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String information() {
		return "pName : "+pName+", price : "+price+", brand : "+ brand;
	}
	
}
