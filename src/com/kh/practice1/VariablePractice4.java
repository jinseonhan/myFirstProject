package com.kh.practice1;

import java.util.Scanner;

public class VariablePractice4 {
	Scanner sc = new Scanner(System.in);
	
	public void practice4() {
		System.out.println("문자열을 입력하세요. : ");
		String word= sc.nextLine();
		
		System.out.println("입력된 문자열 : "+ word);
		System.out.println("첫 번째 문자 : "+word.charAt(0));
		System.out.println("두 번째 문자 : "+word.charAt(1));
		System.out.println("두 번째 문자 : "+word.charAt(2));
		
	}
}
