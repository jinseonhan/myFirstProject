package com.hw5.view;

import java.util.Scanner;

import com.hw5.controller.MemberController;

public class MemberMenu {
	private MemberController mc;
	
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		// 메뉴 출력 >> 반복 처리
		int num =0; // 반복문 실행을 위한 변수
		while(num!=9){
			System.out.println("===== 회원 관리 메뉴 =====");
			System.out.println("1.신규 회원 등록");
			System.out.println("2.회원 정보 검색");
			System.out.println("3.회원 정보 수정");
			System.out.println("4.회원 정보 삭제");
			System.out.println("5.회원 정보 출력");
			System.out.println("6.회원 정보 정렬");
			System.out.println("9.프로그램 종료");
			num=sc.nextInt();
	
			switch(num) {
				case 1 : inserMember();
				break;
				case 2 : searchMember();
				break;
				case 3 : updateMember();
				break;
				case 4 : deleteMember();
				break;
				case 5 : printAllMember();
				break;
				case 6 : sortMember();
				break;
				case 9 : System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
	
	public void inserMember() {
		// member count가 최대 회원수를 넘어설 경우 return처리
		if(mc.SIZE<=mc.getMemberCount()) {
			System.out.println("최대 회원을 넘어섰습니다.");
			return;
		}
		
		System.out.println("추가할 아이디를 입력하세요.");
		String name = sc.nextLine();
		mc.checkId(name);
		
	}
	
	public void searchMember() {
		
	}
	public void updateMember() {
		
	}
	public void deleteMember() {
		
	}
	public void printAllMember() {
		
	}
	public void sortMember() {
		
	}
}
