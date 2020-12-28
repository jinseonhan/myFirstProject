package com.hw4.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {}
	public Student(int grade, int classroom, String name, int kor, int eng, int math) {
		this.grade=grade;
		this.classroom=classroom;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	public String information() {
		return "grade : "+grade+", classroom : "+classroom+", name : "+name +", kor : "+kor+",eng : "+ eng+",math : "+math;
	}
	
	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public String getName() {
		return name;
	}
	public int getMath() {
		return math;
	}
	public int getEng() {
		return eng;
	}
	public int getKor() {
		return kor;
	}
	
}
