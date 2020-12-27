package com.hw3.model.vo;

public class Employee extends Person{
	private int salary;
	private String dept;
	
	public Employee() {
		super();
	}

	public Employee(int age, double height, double weight,String name, int salary, String dept) {
		super(age, height,weight);
		this.name=name;
		this.salary=salary;
		this.dept=dept;
	}
	
	public String information() {
		return super.information()+",name : "+name+", salary :"+salary+",  dept : "+dept;
	}
	
	public int getSalary() {
		return salary;
	}
	public String getDept() {
		return dept;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	
}
