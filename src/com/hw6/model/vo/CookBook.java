package com.hw6.model.vo;

public class CookBook extends Book{
	private boolean coupon;
	public CookBook() {super();	}
	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title,author,publisher);
		this.coupon=coupon;
	}
	public String toString() {
		return super.toString()+",coupon : "+coupon;
	}
	public boolean getCoupon() {
		return coupon;
	}
	public void setCoupon(boolean coupon) {
		this.coupon=coupon;
	}
	
}
