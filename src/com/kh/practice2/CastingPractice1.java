package com.kh.practice2;

import java.util.Scanner;

public class CastingPractice1 {
	Scanner sc = new Scanner(System.in);
	// 입력받은 문자를 유니코드로 바꾸기
	public void practice1() {
		System.out.println("문자 하나를 입력하세요");
		char ch = sc.next().charAt(0);
		sc.nextLine();
		
		System.out.println(ch+"의 유니코드 숫자는 "+(int)ch+"입니다.");
	}
}
