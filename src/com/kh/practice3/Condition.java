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
}
