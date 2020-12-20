package my.study.coding.run;

import java.util.Scanner;

import my.study.coding.coding;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.제곱근 구하기
//		System.out.println(new coding().coding2(121));
		
		// 3.다트게임
//		System.out.println(new coding().coding3(1));
		
		// 4. 숫자 2개의 합계 구하기
//		System.out.println(new coding().coding4(2,4));
	
		// 6. 다음숫자 구하기
//		System.out.println(new coding().coding6(3));
		
		// 7. n진수 게임
//		System.out.println(new coding().coding7(2, 5, 2, 1));
	
		// 8. 2진수 반복 변환
//		System.out.println(new coding().coding8("110110001")[0]+" "+new coding().coding8("110110001")[1]);
	
		// 9. 오픈 채팅방
//		String [] a = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
//		String[] answer =new coding().coding9(a);
//		for(int i=0;i<answer.length;i++) {
//			System.out.println(answer[i]);
//		}
		
		// 10-1. 피보나치 수열(내가 해결한 방법)
		System.out.println(new coding().coding10_1(8));
		
		// 10-2. 피보나치 수열(솔루션)
		System.out.println(new coding().coding10_2(8));
		
		
		
	}
	
}
