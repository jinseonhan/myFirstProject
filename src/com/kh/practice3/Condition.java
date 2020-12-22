package com.kh.practice3;

import java.util.Scanner;

public class Condition {
	Scanner sc= new Scanner(System.in);
	public void practice1() {
		// 1~10사이의 정수를 입력받아 홀수인지 짝수인지 확인하고 출력한다.
		// 1~10사이의 정수가 아닐경우 "반드시 1~10사이의 정수를 입력하세요"를 출력한다.
		System.out.println("1~10사이의 숫자를 입력하세요.(종료 : 0)");
		while(true) {

			int num = sc.nextInt();
			
			if(num>=1&&num<=10) {
				if(num%2==1) {
					System.out.println("홀수 입니다.");
					System.out.println("1~10사이의 숫자를 입력하세요.(종료 : 0)");
				}else {
					System.out.println("짝수 입니다.");
					System.out.println("1~10사이의 숫자를 입력하세요.(종료 : 0)");
				}
			}else if(num==0){
				System.out.println("프로그램을 종료합니다.");
				return;
			}else {
				System.out.println("1~10사이의 숫자를 입력하세요.(종료 : 0)");				
			}		
		}
	}
	
	// 사용자에게 두 개의 정수와 연산 기호(+,-,*,/,%)를 문자 혹은 문자열로 입력받아 연산의 수행 결과를 출력하기
	// 만약 연산이 없으면 "프로그램을 종료합니다"를 출력
	public void practice2() {
		System.out.println("첫 번째 정수를 입력하세요.");
		int first = sc.nextInt();
		System.out.println("두 번째 정수를 입력하세요.");
		int second = sc.nextInt();
		
		System.out.println("연산기호를 입력하세요.(+, -, *,/,%)");
		char cal = sc.next().charAt(0);
		
		if(cal=='+') {
			System.out.println(first+second);
		}else if(cal=='-') {
			System.out.println(first-second);
		}else if(cal=='*'){
			System.out.println(first*second);
		}else if(cal=='/') {
			if(second!=0) {				
				System.out.println(first/second);
			}else {
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}else if(cal=='%') {
			if(second!=0) {				
				System.out.println(first%second);
			}else {
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}else {
			System.out.println("연산기호를 입력하지않아 프로그램을 종료합니다.");
		}
	}
	
	// 키와 몸무게를 입력받고 BMI를 계산하여
	// 저체중(20미만), 정상체중 (20~25), 과체중 (25~30미만), 비만(30이상)
	// BMI = kg/m*m
	public void practice3() {
		System.out.println("체중을 입력하세요(kg)");
		double kg = sc.nextDouble();
		System.out.println("키를 입력하세요(m)");
		double tall =sc.nextDouble();
		double bmi =kg/(tall*tall);
		
		if(bmi<20) {
			System.out.println("저체중 입니다.");
		}else if(bmi>=20 && bmi <25) {
			System.out.println("정상체중 입니다.");
		}else if(bmi>=25 && bmi <30) {
			System.out.println("과체중 입니다.");
		}else {
			System.out.println("비만 입니다.");
		}
	}
	
	// 과일 이름(사과, 바나나, 복숭아, 키위)를 입력받아 해당하는 가격에 맞게 상품명과 가격을 출력하세요.
	public void practice4() {
		System.out.println("가격을 알고싶은 과일의 이름을 입력하세요(사과, 바나나, 복숭아, 키위)");
		String fru = sc.nextLine();
		
		if(fru.equals("사과")) {
			System.out.println("사과의 가격은 1,000원입니다.");
		}else if(fru.equals("바나나")) {
			System.out.println("바나나의 가격은 3,000원입니다.");
		}else if(fru.equals("복숭아")) {
			System.out.println("복숭아의 가격은 2,000원입니다.");
		}else if(fru.equals("키위")) {
			System.out.println("키위의 가격은 5,000원입니다.");
		}else {
			System.out.println("입력하신 정보가 없습니다.");
		}
	}
	
	// 국어, 영어, 수학 평균점수 구하기
	public void practice5() {
		System.out.println("국어 점수를 입력하세요.");
		int kor =sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int math=sc.nextInt();
		int avg =(kor+eng+math)/3;
		
		if(avg>=60) {
			System.out.println("합격!");
		}else {
			System.out.println("불합격!");
		}
	}
	
	// 영업 사원의 월급을 계산하는 프로그램
	public void practice6() {
		System.out.println("월 급여 입력 : ");
		int salary = sc.nextInt();
		System.out.println("매출액 입력 :");
		int sale = sc.nextInt();
		int bonus =0;
		if(sale>=50000000) {
			bonus=5;
		}else if(sale<50000000&&sale>=30000000) {
			bonus=3;
		}else if(sale<30000000&&sale>=10000000) {
			bonus=1;
		}else {
			bonus=0;
		}
		System.out.println("=====================");
		System.out.println("매출액 : "+sale);
		System.out.println("보너스율 : "+bonus+"%");
		System.out.println("월 급여 : "+salary);
		System.out.println("보너스 금액 : "+(sale*bonus/100));
		System.out.println("=====================");
		System.out.println("총 연봉 : "+((salary*12)+(sale*bonus/100)));
		
	}
	
}
