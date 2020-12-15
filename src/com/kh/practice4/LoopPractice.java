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
	
	// 2. 별찍기 1-1,2-2,3-3,4-4... 주어진 n에 알맞은 별을 찍어라
	public void practice2(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
