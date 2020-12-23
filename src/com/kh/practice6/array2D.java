package com.kh.practice6;

public class array2D {
	
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
	
	public void pratice4() {		
		String[][] strArr = new String[][] {{"여", "수", "습", "진", "되"}, {"러", "고", "니", "개", "시"}, {"분",
			"많", "다", "발", "기"}, {"정", "이", "! ", "자", "를"}, {"말", "했", "멋", "가", "♥ "}};
			
			for(int i=0;i<strArr.length;i++) {
				
			}
			
	}
}
