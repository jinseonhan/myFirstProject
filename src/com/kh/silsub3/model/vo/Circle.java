package com.kh.silsub3.model.vo;

public class Circle {
	static double PI = 3.14;
	private int radius;
	
	public Circle() {}
	
	public Circle(int radius) {
		this.radius=radius;
	}
	
	public double getPI() {
		return PI;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius=radius;
	}

	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	public void incrementRadius() {
		System.out.println("둘레 : "+ ((radius+1)*2*PI));
		System.out.println("넓이 : "+ ((radius+1)*(radius+1)*PI));
	}
	
}
