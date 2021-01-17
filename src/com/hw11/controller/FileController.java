package com.hw11.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import com.sun.imageio.spi.OutputStreamImageOutputStreamSpi;

public class FileController {
	Scanner sc= new Scanner(System.in);
	
	public FileController() {}
	
	public void fileSave() throws IOException {
		// 어떤 파일에 어떤 내용을 저장할지 입력 받아 파일 출력을 실행하는 메소드
		StringBuilder sb = new StringBuilder();
		// "파일에 저장할 내용을 입력하시오("exit"을 입력하면 내용 입력 끝);
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			String str = sc.nextLine();
			if(str.equals("exit")) {
				System.out.println("지금까지 내용을 저장하시겠습니까?");
				str=sc.nextLine();
				str=str.toUpperCase();
				System.out.println(str);
				if(str.equals("Y")) {
					System.out.println("지금까지 내용을 파일에 저장합니다."); break;
				}
			}else {
				sb.append(str+"\r\n");
			}
		}
		// 값을 scannner로 입력 받아 StringBuilder에 저장하고, "exit"을 입력 했을 시 빠져나가는 while문 생성
		
		// "저장하시겠습니까(Y/N)"
		// 입력 받은 값이 대문자이든 소문자이든 상관없이 "y"이면,
		// 저장할 파일명을 입력받음
		String fileName;
		BufferedWriter fw = null;
		try {
			System.out.println("저장할 파일명을 입력하세요.");
			fileName=sc.nextLine();
			fw = new BufferedWriter(new FileWriter("C:/download/"+fileName+".txt"));
			fw.write(sb.toString());
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			// 열었던 스트림 close
			fw.flush();
			fw.close();
		}
		// 입력 받은 값이 Y가 아닌 어떤 값이든 "다시 메뉴로 돌아갑니다." 출력과 메소드
		while(true) {
		System.out.println("종료하시겠습니까?(Y/N)");
		char ch=sc.nextLine().charAt(0);
		// 종료
		
		if(ch=='y') {
			ch-=32;
		}else if(ch=='n') {
			ch-=32;
		}
		System.out.println(ch);
		
			if(ch=='Y') {
				System.out.println("파일저장을 종료합니다.");
				break;
			}else if(ch=='N') {
				fileSave();
			}else {
				System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
				
			}
			
		}
	}
	
	public void fileOpen() {
		// 원하는 파일을 파일 입력 후 콘솔 화면에 출력하는 메소드
		// "열기 할 파일명 : "
		// 파일명을 sCANNER로 입력받아 , bUFFEREDrEADER와 FileReader스트림 사용
		System.out.println("오픈할 파일명 : ");
		String fileName = sc.nextLine();
		BufferedReader br = null;
		try {
			// try구문 안에서 readLine()메소드를 통해 한줄씩 콘솔로 입력받은 값 출력
			br = new BufferedReader(new FileReader("C:/download/"+fileName+".txt"));
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			// 열었던 슽트림 close
			try {
				System.out.println(br.readLine());
				br.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
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
