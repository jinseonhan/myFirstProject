package my.study.coding;

import java.util.Scanner;

public class coding {
	Scanner sc =new Scanner(System.in);
	// 1. 두개의 정수 n 과 m 이 주어진다.
	// 별(*)ㅂ 문자를 이용해 길이가 n, 세로의 길이가 m인 직사각형의 형태를 출력하자.
	public void coding1() {
		System.out.println("가로의 갯수를 입력하세요");
		int a= sc.nextInt();
		System.out.println("세로의 갯수를 입력하세요");
		int b= sc.nextInt();
		for(int i=0;i<b;i++) {
			for(int j=0; j<a;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
