package my.study.coding.run;

import java.util.Scanner;

import my.study.coding.coding;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.제곱근 구하기
//		System.out.println(new coding().coding2(121));
		
		// 3.다트게임
		System.out.println(new coding().coding3(1));
		
		// 4. 숫자 2개의 합계 구하기
		System.out.println(new coding().coding4(2,4));
	
		// 6. 다음숫자 구하기
		System.out.println(new coding().coding6(3));
		
		// 7. n진수 게임
		System.out.println(new coding().coding7(2, 5, 2, 1));
	}
}
