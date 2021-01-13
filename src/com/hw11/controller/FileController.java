package com.hw11.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileController {
	Scanner sc= new Scanner(System.in);
	
	public FileController() {}
	
	public void fileSave() {
		// 어떤 파일에 어떤 내용을 저장할지 입력 받아 파일 출력을 실행하는 메소드
		StringBuilder sb = new StringBuilder();
		// "파일에 저장할 내용을 입력하시오("exit"을 입력하면 내용 입력 끝);
		// 값을 scannner로 입력 받아 StringBuilder에 저장하고, "exit"을 입력 했을 시 빠져나가는 while문 생성
		
		// "저장하시겠습니까(Y/N)"
		// 입력 받은 값이 대문자이든 소문자이든 상ㅇ관없이 "y"이면,
		// 저장할 파일명을 입력받음
		try {
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			// 열었던 스트림 close
		}
		// 입력 받은 값이 Y가 아닌 어떤 값이든 "다시 메뉴로 돌아갑니다." 출력과 메소드
		// 종료
	}
	
	public void fileOpen() {
		// 원하는 파일을 파일 입력 후 콘솔 화면에 출력하는 메소드
		
		// "열기 할 파일명 : "
		// 파일명을 sCANNER로 입력받아 , bUFFEREDrEADER와 FileReader스트림 사용
		try {
			// try구문 안에서 readLine()메소드를 통해 한줄씩 콘솔로 입력받은 값 출력
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			// 열었던 슽트림 close
		}
	}
	
	public void fileEdit() {
		// FileController 클래스 객체 생성 후 각 메소드를 메뉴 선택에 따라 실행
		
		// "수정할 파일명 : "
		// 파일명을 입력받아 BufferedReader와 bufferedWriter, FileReader와 FileWriter
		// 스트림 사용
		
		try {
			// 반복문을 통해 해당 파일의 내용을 readLine()메소드를 통해 콘솔에 출력
			// "파일에 추가할 내용을 입력하시오 : "
			// 사용자가 "exit"를 입력하기 전까지 내용을 StringBuilder에 담는다.
			
			// "변경된 내용을 파일에 추가하시겠습니까?(y/n)"
			// 입력받은 값이 대문자이든 소문자이든 상관없이 "y"이면,
			// "입력받은 파일명. txt파일의의 내용이 변경되었습니다." 출력과 저장
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			// 열었던 스트림 close
		}
		
	}
	
	
	
}
