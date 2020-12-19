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
	
	// 3. 역으로 별찍기
	public void practice3(int n) {
//		for(int i=n;i<=1;i--) {      
//			for(int j=1;j<=i;j++) { 
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for(int i=1;i<=n;i++) {      
			for(int j=i;j<=n;j++) { 
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 4. 등차수열
	public void practice4(int start, int n) {
		// start : 초기값  , n : 공차  
		System.out.println("시작숫자 : "+ start);
		System.out.println("공차 : "+n);
		System.out.print(start+" ");
		for(int i=1;i<=9;i++) {
			start+=n;
			System.out.print(start+" ");
		}
		
		
	}
	
	// 5-1. 소수 구하기
	public String practice5(int n) {
		// 사용자가 입력한 숫자가 소수인지 확인
		// 2이하의 수를 입력하면 잘못입력하였습니다. 출력
		String str="";
		if(n<=2) {
		 	return str="2보다 큰 숫자를 입력해주세요.";
		}else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {					
					return str=n+"는 소수가 아닙니다.";
				}
			}			
		}
		return str=n+"는 소수입니다.";
	}

	// 6. 트리 만들기
	public void practice6(int n) {
		// n = 4   1-1 ,2-3, 3-5, 4-7 // n*2-1 |4| 3,4,5| 2,3,4,5,6| 1,2,3,4,5,6,7
		// xxxOxxx
		// xxOOOxx
		// xOOOOOx
		// OOOOOOO
		for(int i=1;i<=n;i++) {
			if(n/2-1==i) { // 가운데 *
				System.out.print("*");
			}else{
			
				System.out.println();
			}
		}
	}
}
