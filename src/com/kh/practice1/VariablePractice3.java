package com.kh.practice1;

import java.util.Scanner;

public class VariablePractice3 {
	Scanner sc = new Scanner(System.in);
	public void practice3() {
		// 키보드로 가로, 세로 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 곘ㄴ하여 출력하세요.
		
		System.out.println("가로의 길이 : ");
		int horizontal = sc.nextInt();
		
		System.out.println("세로의 길이 : ");
		int vertical = sc.nextInt();
		
		System.out.println("면적 : "+ (horizontal*vertical));
		System.out.println("둘레 : "+ ((horizontal+vertical)*2));
	}
}
