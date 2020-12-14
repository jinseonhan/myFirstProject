package com.kh.practice4;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);
	// 1. 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하시오
	public void practice1() {
		System.out.println("숫자 하나를 입력하세요.");
		int num = sc.nextInt();
		int sum =0;
		for(int i=1;i<=num;i++) {
			sum+=i;
			if(i==num) {
				System.out.print(i+" = ");				
			}else {
				System.out.print(i+" + ");				
			}
		}
		System.out.print(sum);
		
	}
}
