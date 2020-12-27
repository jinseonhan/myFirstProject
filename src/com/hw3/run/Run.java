package com.hw3.run;

import com.hw3.model.vo.Employee;
import com.hw3.model.vo.Student;

public class Run {
	public static void main(String[] agrs) {
		// 3명의 학생정보를 기록할수 있는 객체배열을 만들어라
		// 반복문을 통해 출력
		Student[] st = new Student[3];
		st[0] = new Student(20, 178.2, 70.0, 1, "정보시스템공학과","홍길동");
		st[1] = new Student(21, 187.3, 80.0, 2, "경영학과","김개똥");
		st[2] = new Student(23, 167.0, 45.0, 4, "정보통신공학과","강개순");
		
		for(Student std:st) {
			System.out.println(std.infromation());
		}
		
		// 최대 10명의 사원 정보를 기록할 수있는 객체배열을 만들어라
		// 2명의 사원정보를 만들어 기록된 사원정보 출력하라
		Employee[] emp = new Employee[10];
		emp[0]= new Employee(26, 180.3, 72.0, "박보검", 1000000, "영업부");
		emp[1]= new Employee(38, 182, 76.0, "강동원", 2000000, "기획부");
		
		for(Employee empOutput:emp) {
			if(empOutput!=null) {
				System.out.println(empOutput.information());
			}
		}
		
	}
	
}
