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
}
