package com.hw3.model.vo;

public class Student extends Person{
	private int grade;
	private String major;
	
	public Student() {
		super();
	}
	public Student(int age, double weight, double height, int grade, String major,String name) {
		super(age, weight, height);
		this.name=name;
		this.grade=grade;
		this.major=major;
	}
	public String infromation() {
		return super.information()+",name : "+name+", grade : "+grade+", major : "+major;
	}
	
	public int getGrade(){
		return grade;
	}
	public String getMajor() {
		return major;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public void setMajor(String major) {
		this.major=major;
	}
	
	
}
