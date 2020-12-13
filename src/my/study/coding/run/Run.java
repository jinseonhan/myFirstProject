package my.study.coding.run;

import java.util.Scanner;

import my.study.coding.coding;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.제곱근 구하기
//		System.out.println(new coding().coding2(121));
		
		// 2.다트게임
		String dartResult1 ="1S2D*3T";
		String dartResult2 ="1D2S#10S";
		String dartResult3 ="1D2S0T";
		String dartResult4 ="1S*2T*3S";
		String dartResult5 ="1D#2S*3S";
		String dartResult6 ="1T2D3D#";
		String dartResult7 ="1D2S3T*";
		
		String str = "";
		
		System.out.println("숫자를 하나 입력하세요.");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			str=dartResult1;
			break;
		case 2:
			str=dartResult2;
			break;
		case 3:
			str=dartResult3;
			break;
		case 4:
			str=dartResult4;
			break;
		case 5:
			str=dartResult5;
			break;
		case 6:
			str=dartResult6;
			break;
		case 7:
			str=dartResult7;
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			break;
		}
		if(str!="") {			
			System.out.println("다트의 점수의 총합은 "+new coding().coding3(str));
		}else {
			System.out.println("입력된 값이 없습니다.");
		}
		
	}
}
