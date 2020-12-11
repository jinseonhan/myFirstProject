package com.kh.practice2;

import java.util.ArrayList;
import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		// 키보드로 입력받은 하나의 정수가 양수이면 "양수다", 양수가 아니면 "양수가 아니다"를 출력하세요.
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num%2==0&&num!=0) {
			System.out.println("양수입니다.");
		}else if(num%2==1){
			System.out.println("양수가 아닙니다.");
		}else if(num==0) {
			System.out.println("0 입니다.");
		}
	}
	
	public void practice2() {
		// 모든 사람이 사탕을 골고루 나눠가지려고  한다. 인원수와 사탕개수를 키보드로 입력받아 
		// 1인당 동일 사탕을 나눠주고 남은 갯수를 구하시오
		System.out.println("사탕의 갯수를 입력하세요");
		int candy = sc.nextInt();
		System.out.println("사람의 수를 입력하세요");
		int people = sc.nextInt();
		
		System.out.println("1인당 사탕의 갯수 : "+(candy/people));
		System.out.println("남은 사탕의 개수  : "+(candy%people));
		
	}
	
	// 아이오트리 코딩 문제
	public int practice3(int n) {
		// 입력받은 숫자의 자릿수를 모두 합한 값을 출력하자
		// 오른쪽부터 하나씩 나머지를 뽑아내서 자릿수를 내리며 출력한다.
		
		int sum =0; // 숫자를 저장하여 리턴할 값
		
		while(n!=0) {
			int a= n%10; // 가장 오른쪽 한자리수를 추출
			sum+=a; // 추출한 값을 sum에 담기
			n=n/10; // 자릿수 줄이기
		}
		
		return sum;
	}
	
	// 학원 문제
	public void practic4() {
		// 주민등록번호를 이요하여 남자인지 여자인지 구분하여 출력하기
		
		System.out.println("주민등록번호를 입력하세요. ('-' 포함)");
		String str = sc.nextLine();	// 주민등록번호를 저장할 변수(String)
		char gender = str.charAt(7); // 성별을 구분할 변수(char)
		
		
		// char를 비교해 분기처리하여 결과값을 출력한다.
		if(gender=='1'||str.charAt(7)=='3') {
			System.out.println("남자 입니다.");
		}else if(str.charAt(7)=='2'||gender=='4') {
			System.out.println("여자 입니다.");
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
	}
	
	
	
	
}
