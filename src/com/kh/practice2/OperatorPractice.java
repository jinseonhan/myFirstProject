package com.kh.practice2;

import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		// 키보드로 입력받은 하나의 정수가 양수이면 "양수다", 양수가 아니면 "양수가 아니다"를 출력하세요.
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num%2==0&&num!=0) {
			System.out.println("양수입니다.");
		}else if(num%2==1){
			System.out.println("양수가 아닙니다.");
		}else if(num==0) {
			System.out.println("0 입니다.");
		}
	}
}
