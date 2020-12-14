package my.study.coding;

import java.util.Scanner;

public class coding {
	Scanner sc =new Scanner(System.in);
	// 1. 두개의 정수 n 과 m 이 주어진다.
	// 별(*) 문자를 이용해 길이가 n, 세로의 길이가 m인 직사각형의 형태를 출력하자.
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
	
	public int coding3(String str) {
		
		int[] arr = new int[3];
		int Idx =0; // 배열에 담을 인덱스
		String tempNum=""; // 
		for(char c:str.toCharArray()) {
			// str.toCharArray() : 문자열 str을 배열로 만든다.
			if(Character.isDigit(c)) { // 반복을 돌면서 c의 값이 숫자이면 true를 반환 
				// Character.isDigit(c) : c 의 값이 숫자이면 true반환, 숫자가 아니면 false 반환하는 함수
				tempNum+=c; // tempNum에 글자 하나 "c"를 담는다. // 10일 수 있기 때문에 담는다.
			}else { // 문자라면
				if(!"".equals(tempNum)) { // tempNum이 공백이 아니면
					arr[Idx++] =Integer.parseInt(tempNum); // tempNum에 담긴 String형을 숫자로 변환하여 arr[]에 담고 Idx를 1을 후위연산으로 증가시킨다.
					tempNum=""; // 기존 tempNum을 초기화한다.
				}
				switch(c) {
					case 'S' :
						arr[Idx-1] = (int)Math.pow(arr[Idx-1], 1); // if문에서 arr에 담은 값과 c에 담긴 문자를 비교하여 제곱한다.
						break;
					case 'D' :
						arr[Idx-1] = (int)Math.pow(arr[Idx-1], 2);
						break;
					case 'T' :
						arr[Idx-1] = (int)Math.pow(arr[Idx-1], 3);
						break;
					case '*' :
						arr[Idx-1] =arr[Idx-1]*2;
						if(Idx-2>=0) { // arr의 자릿수를 확인하여 arr[2]가 마지막이기 떄문에 arr[1]까지 값이 있으면 arr[0]의 값에 2배를 더 곱해준다.
							arr[Idx-2]=arr[Idx-2]*2; 
						}
						break;
					case '#' :
						arr[Idx-1] =arr[Idx-1]*(-1); // '#'이 있다면 음수로 만든다.
						break;
				}
			}
		}
		return arr[0]+arr[1]+arr[2];
		
	}
}
