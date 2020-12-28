package com.hw4.run;

import java.util.Scanner;

import com.hw4.model.vo.Student;


public class Run {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// 최대 10명의 학생 정보를 기록하게 ㅂ객체 배열 할당
		// 반복문을 통해 학생정보를 입력 받도록 구현
		// 3명의 학생 정보를 입력 받아, 각 객체에 저장, 학생들의 정보와 학생의 평균점수를 출력
		
		Student[] st = new Student[10];
		int num=0;
		char yn ='Y';
		
		while(yn!='N') {
			System.out.println("학생의 정보를 입력하시겠습니까?(Y/N)");
			yn=sc.next().charAt(0);
			if(yn=='y') {
				yn='Y';
			}else if(yn=='n') {
				yn='N';
			}
			switch(yn) {
			case 'Y' : if(num<st.length) {
				st[num] = enter();
				num++;
			}
				break;
			case 'N' :
				for(int i=0;i<st.length;i++) {
					if(st[i]!=null) {
						System.out.println(st[i].information());
					}
				}
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		
		}
		
	}
	public static Student enter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 학년을 입력하세요.");
		int grade = sc.nextInt();
		System.out.println("학생의 반을 입력하세요.");
		int classroom = sc.nextInt();
		sc.nextLine();
		System.out.println("학생의 이름을 입력하세요.");
		String name = sc.nextLine();
		System.out.println("국어점수를 입력하세요.");
		int kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요.");
		int eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요.");
		int math = sc.nextInt();
		Student std = new Student(grade, classroom, name, kor, eng, math);
		
		return std;
	}
}
