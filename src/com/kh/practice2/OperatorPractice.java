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
	
	public void practice2() {
		// 모든 사람이 사탕을 골고루 나눠가지려고  한다. 인원수와 사탕개수를 키보드로 입력받아 
		// 1인당 동일 사탕을 나눠주고 남은 갯수를 구하시오
		System.out.println("사탕의 갯수를 입력하세요");
		int candy = sc.nextInt();
		System.out.println("사람의 수를 입력하세요");
		int people = sc.nextInt();
		
		System.out.println("1인당 사탕의 갯수 : "+(candy/people));
		System.out.println("남은 사탕의 개수  : "+(candy%people));
		
	}
}
