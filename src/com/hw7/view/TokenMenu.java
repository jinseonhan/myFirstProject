package com.hw7.view;

import java.util.Scanner;

import com.hw7.controller.TokenController;

public class TokenMenu {
	Scanner sc = new Scanner(System.in);
	TokenController tc = new TokenController();
	
	public void mainMenu() {
		// 메인메뉴 출력
		while(true) {
			System.out.println("1.지정 문자열");
			System.out.println("2.입력 문자열");
			System.out.println("9.프로그램 끝내기");
			System.out.println("===============");
			System.out.println("메뉴 선택 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : tokenMenu();break;
			case 2 : inputMenu(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("번호를 잘못입력하셨습니다.");break;
			}
			
		}
	}
	
	public void tokenMenu() {
		
		String str= "J a v a P r o g r a m";
		// Token 처리 전 글자와 글자 갯수를 출력하고 
		// 위 str을 TokenController의 afterToken() 메소드의 인자로 보내 반환 값 출력
		// 그 반환 값을 이용해 Token 처리 후 글자 개수와 대문자 변환한 것을 출력
		System.out.print("토큰 처리 전 글자 : ");
		System.out.println(str);
		
		System.out.print("토큰 처리 전 개수 : ");
		System.out.println(str.length());
		
		System.out.print("토큰 처리 후 글자 :");
		System.out.println(tc.afterToken(str));
		
		System.out.print("토큰 처리 후 개수 : ");
		System.out.println(tc.afterToken(str).length());
		
		System.out.print("모두 대문자로 변환 : ");
		System.out.println(tc.afterToken(str).toUpperCase());
		
	}
	
	public void inputMenu() {
		// TokenController의 객체의 mainMenu메소드 호출
		// 입력받은 문자열을 tc의 firstCap()의 인자로 보내 반환 값 출력
		// 찾을 하나를 매개변수로 보내 반환값 출력
		System.out.println("문자열을 입력하세요.");
		String input = sc.nextLine();
		System.out.print("첫 글자 대문자로 변환 : ");
		System.out.println(tc.firstCap(input));
	}
	
	
}
