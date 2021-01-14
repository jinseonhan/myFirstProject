package com.hw11.run;

import java.util.Scanner;

import com.hw11.controller.FileController;

public class NoteMenu {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		FileController fc = new FileController();
		
		// 반복문을 통한 메뉴 실행
		// ****** MyNote ******
		while(true) {
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("4. 끝내기");
			System.out.println("번호를 입력하세요 : ");
			int num = sc.nextInt();
			switch(num) {
			case 1 : fc.fileSave(); break;
			case 2 : fc.fileOpen(); break;
			case 3 : fc.fileEdit(); break;
			case 4 : System.out.println("프로그램을 종룝합니다."); return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		// 반복문 내에서 입력받은 번호에 따라서 FileController의 메소드를 실행
		
		// 4번의 끝내기는 "프로그램을 종료합니다." 라는 출력과 함께 프로그램이 종료되게 함
		// 1~4번을 제외한 값을 입력 받으면 " 잘목입력하셨습니다."출력하고 메뉴 반복
		
		
	}
}
