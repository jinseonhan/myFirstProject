package com.kh.practice2;

import java.util.Scanner;

public class CastingPractice1 {
	Scanner sc = new Scanner(System.in);
	
	// 1. 입력받은 문자를 유니코드로 바꾸기
	public void practice1() {
		System.out.println("문자 하나를 입력하세요");
		char ch = sc.next().charAt(0);
		sc.nextLine();
		
		System.out.println(ch+"의 유니코드 숫자는 "+(int)ch+"입니다.");
	}
	
	// 2. 선언 및 초기화 된 5개의 변수를 가지고 알맞은 사칙연산과 형변환을 이용하여 주석에 적힌값과 같은 값이 나오도록 코드를 작성하시오
	public void practice2() {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch ='A';	
		
		System.out.println( iNum1 /iNum2 ); // 2
		System.out.println( (int)dNum ); // 2
		System.out.println( iNum2* dNum ); // 10.0
		System.out.println( (double)iNum1 ); // 10.0
		System.out.println( iNum1 /(double)iNum2 ); // 2.5
		System.out.println( dNum ); // 2.5
		System.out.println( (int)fNum ); // 3
		System.out.println( iNum1 /(int)fNum ); // 3
		System.out.println( iNum1 /fNum );// 3.3333333
		System.out.println( iNum1 /(double)fNum ); // 3.3333333333333335 //X
		System.out.println( ch ); // 'A'
		System.out.println( (int)ch ); // 65
		System.out.println( (int)ch +iNum1 ); // 75
		System.out.println( (char)((int)ch +iNum1) ); // 'K'
	}
}
