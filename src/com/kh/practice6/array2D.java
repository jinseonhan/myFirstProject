package com.kh.practice6;

import java.util.Scanner;

public class array2D {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		// 3행 3열짜리 문자열 배열을 선언 및 할당하고
		// 인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 "(0,0)"과 같은 형식으로 저장 후 출력하세요.
		
		System.out.println("===실행결과===");
		for(int i =0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.print("("+i+","+j+")");
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		// 4행 4열 짜리 정수형 배열을 선언 및 할당하고
		// 1) 1~16까지 값을 차례대로 저장하세요.
		// 2) 저장된 값들을 차례대로 출력하세요.
		int num=1;
		System.out.println("실행결과");
		
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=3;j++) {
				if(num>9) {
					System.out.print(num+" ");
				}else {					
					System.out.print(" "+num+" ");
				}
				num++;
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		int num=16;
		System.out.println("실행결과");
		
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=3;j++) {
				if(num>9) {
					System.out.print(num+" ");
				}else {					
					System.out.print(" "+num+" ");
				}
				num--;
			}
			System.out.println();
		}
	}
	
	public void practice4() {		
		String[][] strArr = new String[][] {{"여", "수", "습", "진", "되"}, {"러", "고", "니", "개", "시"}, {"분",
			"많", "다", "발", "기"}, {"정", "이", "! ", "자", "를"}, {"말", "했", "멋", "가", "♥ "}};
			// [0][0], [0][1]
			for(int i=0;i<strArr.length;i++) {
				for(int j=0;j<strArr[i].length;j++) {
					System.out.print(strArr[j][i]);
				}
				System.out.println();
			}
		}
	
	public void practice5() {
		// 사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
		// 문자형 가변 배열을 선언 및 할당 하시오. 그리고 각 인덱스에 'a(97)'부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		System.out.println("행의 크기 : ");
		int row = sc.nextInt();
		int arr[][] = new int [row][];
		char ch = 97;
		
		for(int i =0; i<row;i++) {
			System.out.println(i+"열의 크기 : ");
			arr[i] = new int[sc.nextInt()];
		}
		
		System.out.println("===실행 결과===");	
		for(int i=0;i<row;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
	
	public void practice6() {
		// char 형 2차원 배열 5행 5열을 만들고
		// 행과 열을 이력 받아 해당 좌표의 값을 'X'로 변환해 2차원 배열을 출력하세요.
		
		while(true) {
			System.out.println("행을 입력하세요.(종료 : 99 입력)");
			int row = sc.nextInt()+1;
			if(row==100) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println("열을 입력하세요.");
			int col = sc.nextInt()+1;
			
			for(int i=0;i<=5;i++) {
				for(int j=0;j<=5;j++) {
					
					if(i==0&&j==0) {
						System.out.print(" ");
					}else if(i==0&&j!=0) {
						System.out.print(j-1);
					}else if(i!=0&&j==0) {
						System.out.print(i-1);				
					}else if(i==row&&j==col) {
						System.out.print("X");				
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
		}
	}
}
