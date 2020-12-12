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
		
//		*******************************************************************************
//		*******************************************************************************
//		*******************************************************************************
		
		// 1 번째 풀이
//		double doubleSqrt = Math.sqrt(n);
//		int intSqrt = (int)doubleSqrt;
//		
//		return doubleSqrt==intSqrt ? (long)Math.pow(intSqrt=1,2) : -1;
		
		// 2번째 풀이
		if(Math.pow((int)Math.sqrt(n),2)==n) // 입력 받은 n의 값과 n을 제곱근한 int값의 2제곱과 같다면
			return (long)Math.pow(Math.sqrt(n)+1,2); // long형의 주어진 값을 반환하고
		return -1;									// 아니면 -1을 반환한다.
		
		
	}
	
	// 3. 다트게임
	// *는 *2,#은 -1을 앞 숫자는 0~10
	// *와 #은 중첩된다.
	// *가 2개 나오면 첫번째는 *2*2, *가 3개가 나오면 첫번째 는 *2*2*2
	// 예제1 dartResult 1S2D*3T answer=37
	// 예제2 dartResult 1D2S#10S answer=9
	// 예제3 dartResult 1D2S0T answer=3
	// 예제4 dartResult 1S*2T*3S answer=23
	// 예제5 dartResult 1D#2S*3S answer=5
	// 예제6 dartResult 1T2D3D# answer=-4
	// 예제7 dartResult 1D2S3T* answer=59
	
	public void coding3() {
		String dartResult1 ="1S2D*3T";
		String dartResult2 ="1D2S#10S";
		String dartResult3 ="1D2S0T";
		String dartResult4 ="1S*2T*3S";
		String dartResult5 ="1D#2S*3S";
		String dartResult6 ="1T2D3D#";
		String dartResult7 ="1D2S3T*";
		
	}
}
