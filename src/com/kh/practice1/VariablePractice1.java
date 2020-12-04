package com.kh.practice1;

import java.util.Scanner;

public class VariablePractice1 {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요. : ");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력하세요. : ");
		int age = sc.nextInt();
		
		System.out.println("성별을 입력하세요(남/여) : ");
		char gender = sc.next().charAt(0);
		
		sc.nextLine();
		
		System.out.println("키를 입력하세요(cm) :");
		double height = sc.nextDouble();
		
		System.out.println("키 "+height+"cm인 "+ age+"살 "+gender+" "+name+"님 반갑습니다^^");
	}
}
