package com.kh.silsub2.run;

import com.kh.silsub2.model.vo.Product;

public class Run {
	public static void main(String[] args) {
		Product p = new Product("galaxy", 1000000, "Samsung");
	
		System.out.println(p.information());
		p.setPrice(700000);
		System.out.println(p.information());
	
	}
}
