package my.study.coding;

import java.util.ArrayList;
import java.util.HashMap;
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
	
	public int coding3(int a) {
		String dartResult="";
		switch(a) {
			case 1 :
				 dartResult ="1S2D*3T";
				break;
			case 2 :
				 dartResult ="1D2S#10S";
				break;
			case 3 :
				 dartResult ="1D2S0T";
				break;
			case 4 :
				 dartResult ="1S*2T*3S";				
				break;
			case 5 :
				 dartResult ="1D#2S*3S";				
				break;
			case 6 :
				 dartResult ="1T2D3D#";				
				break;
			case 7 :
				 dartResult ="1D2S3T*";				
				break;
		}		
		int[] arr = new int[3];
		int Idx =0; // 배열에 담을 인덱스
		String tempNum=""; // 
		for(char c:dartResult.toCharArray()) {
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
		
	// 4.숫자들을 더해 합계 반환하기
	public long coding4(int a, int b) {
		long answer=0;
		
		if(a<b) {
			for(int i=a;i<=b;i++) {
				answer+=i;
			}
		}else {
			for(int i=a;i>=b;i--) {
				answer+=i;
			}
		}
		
		return answer;
	}
	
	// 5.문자열을 숫자로 변환하기
	public int coding5(String s) {
		int answer =0;
		
		answer=Integer.parseInt(s); // Integer.parseInt(string) : 음수를 인식할 수 있음 => Integer객체로 반환
									// Integer.valueOf(string) : 음수를 인식하지 못함 => 자료형으로 반환
									// Integer.valueOf(Integer.parseInt(String)) => 음수,양수를 구분하여 Integer 객체로 반환

		return answer;
	}
	
	// 6. 프로그래머스 문제
	// 입력받은 자연수 n의 다음수를 구하라
	// 조건은 2진수 변환시 1의 갯수가 입력받은 n과 같아야 한다.
	public int coding6(int n) {
		int answer =0;
		
		int initBit = Integer.bitCount(n); 
		// Integer.bitCount(n) : int형 n를 2진수를 변환한 후 1의 갯수를 세는 함수
		int nextBit = 0;
		
		while(true) {
			n++; // 기존 n의 숫자를 증가시키고
			nextBit = Integer.bitCount(n); // 1의 갯수를 세어본다.
			if(initBit==nextBit) { // 만약 증가시킨 값과 기존값의 1의 숫자가 같은지 확인
				answer=n; // 그 자연수 n을 담고
				break; // 나온다.
			}
		}
		
		
		return answer;
	}
	
	//  프로그래머스 문제
	// n진수 게임(n : 진법, t : 말해야할 숫자의 갯수, m : 참여 인원, p : 튜브의 순서)
	public String coding7(int n, int t, int m, int p) {
		String str = "0"; // 전체를 담을 문자형 변수, 0부터 시작하기 때문에 0을 초기에 담아준다.
		int count = 0;
        
		while (str.length() < (t * m + p)) { // t*m은 내가 마지막-1까지의 숫자들 //p는 마지막에 내가 말해야할 숫자
			String byNum = ""; // num에 담긴 숫자를 n진법으로 나눠 하나씩 담을 변수
			int num = count++; 
			
			// N진법 구하는 방법
			while (num != 0) { //  
				if (num % n >= 10) // 16진수의 알파벳을 대비해 존재
					byNum += String.valueOf((char) (num % n + 55)); // 10+55 = A, 11+55= B. ....
				else	// 16진수 이하 진법 계산
					byNum += String.valueOf(num % n);

				num /= n; // num= num/n
			}

			str += new StringBuffer(byNum).reverse().toString(); // byNum으로 뽑아낸 값을 역으로 str에 담는다. 0 1 10 11 100.....
		}

		String answer = ""; // return 값을 초기화

		for (int i = 0; i < t; i++)
			answer += String.valueOf(str.charAt(m * i + p - 1)); // 튜브가 말할 순서의 숫자 를 answer에 담는다.

		return answer;
	}
	
	
	// 프로그래머스 2단계 문제
	// 2진수 변환 반복하기
	public int[] coding8(String s) {
		int[] answer = {};
		answer = new int[2];
		
		int count=0; // 반복 횟수를 저장할 변수
		int countZero =0; // 지워진 0의 갯수를 저장할 변수

		// 반복문으로 1의 갯수를 센 값과 길이가 같을 경우까지 반복시킨다.
		while(!s.equals("1")) { // "1"로만 구성되지 않았다면 무한 반복
			int countOne=0;	// 1의 갯수를 세어 자연수로 만들 변수이자 s에 2진수로 다시 담을 변수
			for(int i=0;i<s.length();i++) { // s의 길이까지 반복하며 
				if(s.charAt(i)=='0') {	// 문자에 0이 있으면 제거 할 0에 담고
					countZero++;
				}else {	// 그렇지 않으면(1일경우) 자연수로 만들 변수에 담는다.
					countOne++;
				}
			}
			s=Integer.toBinaryString(countOne); // 반복문이 끝나고 자연수를 다시한번 2진수로 만든다.
			count++;	// 그리고 반복횟수를 저장한다.
		}
		answer[0]=count;	// 총 반복횟수를 return값에 저장하고
		answer[1]=countZero;	// 총 제거된 0의 갯수를 return값에 저장한다.
		
		return answer;
	}
	
	// 프로그래머스 2단계 문제
	// 오픈채팅방
	public String[] coding9(String[] record) {
        ArrayList<String> arr = new ArrayList();
		HashMap<String, String> map = new HashMap();
		for (int i = 0; i < record.length; i++) {
			String[] command = record[i].split(" ");

			if (command[0].equals("Enter")) {
				arr.add(command[1] + "님이 들어왔습니다.");
				map.put(command[1], command[2]);
			} else if (command[0].equals("Change")) {
				map.put(command[1], command[2]);
			} else {
				arr.add(command[1] + "님이 나갔습니다.");
			}
		}
		String[] answer = new String[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			int idx = arr.get(i).indexOf("님");
			String id = arr.get(i).substring(0, idx);
			String[] temp = arr.get(i).split(" ");
			answer[i] = map.get(id) + "님이 " + temp[1];
		}
        return answer;
    }
	
}
