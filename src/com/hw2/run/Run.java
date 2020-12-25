package com.hw2.run;

import com.hw2.model.vo.Employee;

public class Run {
	// 3명의 정보를 입력하고 3명의 보너스율이 적용된 연봉을 출력한다.
	public static void main(String[] args) {
		Employee emp1= new Employee(1, "김철수", "인사부", "인사관리", 30, 'M', 3000000, 0.03, "01012345678", "경기도 고양시");
		Employee emp2= new Employee(2, "이슬이", "영업부", "영업관리", 25, 'F', 3400000, 0.06, "01012345679", "경기도 성남시");
		Employee emp3= new Employee(3, "홍길동", "뷰티사업부", "MD", 31, 'M', 3000000, 0.09, "01012345670", "서울 용산구");
		
		System.out.println(emp1.getEmpName()+"의 월급은 "+(int)(emp1.getSalary()+(emp1.getSalary()*emp1.getBonusPoint())));
		System.out.println(emp2.getEmpName()+"의 월급은 "+(int)(emp2.getSalary()+(emp2.getSalary()*emp2.getBonusPoint())));
		System.out.println(emp3.getEmpName()+"의 월급은 "+(int)(emp3.getSalary()+(emp3.getSalary()*emp3.getBonusPoint())));
	}
}
