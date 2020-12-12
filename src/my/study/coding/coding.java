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
	
	// 2. 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
	//   n이 양의 정수 x의 제곱근이라면 x+1의 제곱을 리턴
	//   n이 양의 정수 x의 제곱근이 아니라면 -1을 리턴하는 함수를 완성하시오
	
	// 함수 정리
	// 제곱 함수 : Math.pow(밑, 지수) => 실수형
	// 제곱근 : Math.sqrt(숫자) => 실수형  
	
	public long coding2(long n) {
		// 나의 풀이 1
		long answer=0;
//		double x = Math.sqrt(n);
//		int y =(int)Math.sqrt(n);
//		
//		if((int)(x*10)==y*10) {
//			answer=(int)(x+1)*(int)(x+1);
//		}else {
//			answer=-1;
//		}
//		return answer;
		
		
		// 나의 풀이 2
//		int a =(int)Math.sqrt(n);
//		for(int i=a;i>0;i--){
//			if((i*i)==n) {
//				answer=(i+1)*(i+1);
//				break;
//			}else {
//				answer=-1;
//			}
//		}
//		return answer;
		
		// 1 번째 풀이
//		double doubleSqrt = Math.sqrt(n);
//		int intSqrt = (int)doubleSqrt;
//		
//		return doubleSqrt==intSqrt ? (long)Math.pow(intSqrt=1,2) : -1;
		
		// 2번째 풀이
		if(Math.pow((int)Math.sqrt(n),2)==n) 
			return (long)Math.pow(Math.sqrt(n)+1,2);
		return -1;
		
		
	}
	
}
