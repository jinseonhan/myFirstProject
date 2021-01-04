package com.hw6.view;

import java.util.Scanner;

import com.hw6.controller.LibraryManager;
import com.hw6.model.vo.Book;
import com.hw6.model.vo.Member;

public class LibraryMenu {
	LibraryManager lm = new LibraryManager();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		// 이름, 나이, 성별을 키보드로 입력 받은 후  Member 객체 생성
		// LibraryManager의 insertMember()메소드에 전달
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("성별을 입력하세요.(M/F)");
		char gender = sc.nextLine().charAt(0);
		Member mem = new Member(name, age, gender);
		lm.insertMember(mem);
		
		while(true) {
			System.out.println("==== 메 뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("0. 프로그램 종료");
			int num =sc.nextInt();
			sc.nextLine();
			switch(num) {
				case 1 : System.out.println(lm.myInfo().toString());break;
				case 2 : selectAll();break;
				case 3 : searchBook();break;
				case 4 :  rentBook();break;
				case 0 : System.out.println("프로그램을 종료합니다.");return;
				default : System.out.println("잘못 입력하였습니다.");break;
			}
			
		}
	}
	public void selectAll() {
		Book[] bList = lm.selectAll();
		
		for(int i=0;i<bList.length;i++) {
			if(bList[i]!=null) {
				System.out.println(bList[i].toString());
			}
		}
	}
	public void searchBook() {
		System.out.println("도서명을 입력하세요.");
		String keyword =sc.nextLine();
		Book[] book = lm.searchBook(keyword);
		
		for(Book b: book) {
			if(b!=null) {
				System.out.println(b.toString());
			}
		}
	}
	public void rentBook() {
		System.out.println("도서번호를 입력하세요.(0~4)");
		int index = sc.nextInt();
		int result= lm.rentBook(index);
		if(result==0) {
			System.out.println("성공적으로 대여되었습니다.");
		}else if(result==1) {
			System.out.println("나이 제한으로 대여 불가능합니다.");
		}else if(result==2) {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
		}
	}
}
