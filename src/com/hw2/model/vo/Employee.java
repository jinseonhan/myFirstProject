package com.hw2.model.vo;

public class Employee {
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	public Employee() {}

	public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary,
			double bonusPoint, String phone, String address) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}

	public Employee(int empNo, String empName, int age, char gender, String phone, String address) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
	}

	public String information() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", dept=" + dept + ", job=" + job + ", age=" + age
				+ ", gender=" + gender + ", salary=" + salary + ", bonusPoint=" + bonusPoint + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	
	public int getEmpNo() {
		return empNo;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public String GetDept() {
		return dept;
	}
	
	public String GetJob() {
		return job;
	}
	
	public char getGender() {
		return gender;
	}
	public int getSalary() {
		return salary;
	}
	public double getBonusPoint() {
		return bonusPoint;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	public void setEmpNo(int empNo) {
		this.empNo=empNo;
	}
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	public void setJob(String job) {
		this.job=job;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint=bonusPoint;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
}
