package programers.codingtest.stackQ;

import java.util.Stack;

//  스택
//  1.스택이란 ? 한쪽 끝에서만 자료를 넣고 뺄 수 있는 LIFO형식의 자료구조
//  2.주요 메소드
// pop(): 스택에서 가장 위에 있는 항목을 제거한다.
// push(item): item 하나를 스택의 가장 윗 부분에 추가한다.
// peek(): 스택의 가장 위에 있는 항목을 반환한다.
// isEmpty(): 스택이 비어 있을 때에 true를 반환한다.

// 3.스택의 특징
// 배열과 달리 스택은 상수 시간에 i번째 항목에 접근할 수 없다.
// 하지만 스택에서 데이터를 추가하거나 삭제하는 연산은 상수 시간에 가능하다.
// 배열처럼 원소들을 하나씩 옆으로 밀어 줄 필요가 없다.

// 4. 스택 활용 예시
// 웹 브라우저 방문기록 (뒤로 가기) : 가장 나중에 열린 페이지부터 다시 보여준다.
// 역순 문자열 만들기 : 가장 나중에 입력된 문자부터 출력한다.
// 실행 취소 (undo) : 가장 나중에 실행된 것부터 실행을 취소한다.
// 후위 표기법 계산
// 수식의 괄호 검사 (연산자 우선순위 표현을 위한 괄호 검사)//


// 큐
// 1. 큐(Queue)란? 먼저 집어 넣은 데이터가 먼저 나오는 FIFO 구조로 저장하는 형식, 스택과 반대되는 개념
// 					프린터의 출력 처리나 윈도 시스템의 메시지 처리기, 프로세스 관리 등 데이터가 입력된 시간 순서대로 처리해야할 필요가 있는 상황에 사용
// 2. 주요 메소드
// put() : insert => 자료를 입력
// get() : delete => 자료를 꺼냄
// front() : get할 수 있는 위치
// rear() : put할 수 있는 위치
//
// 3. 주요용어
// 오버플로우 : 큐가 꽉차서 더이상 자료를 넣을 수 없는 경우
// 언더플로우 : 큐가 비어있어서 자료를 꺼낼 수 없는 경우
////
// 4. 종류////////./////111
// 선형 큐 : 막대 모양으로, 크기가 제한되어 있고 빈공간을 사용하려면 모든 자료를 꺼내거나 자료를 한칸씩 옮겨야하는 단점이 있음//
// 화환형 큐 : 선형 큐의 문제점을 보완한 것. front가 큐의 끝에 닿으면 맨앞으로 자료를 보내어 원형으로 연결하는 방식
////////1111111
public class Solution1 {
	public static void main(String[] args) {
		new Solution1().solution();
	}

	public void solution() {
		int[] prices= {1,2,3,2,3};
		int[] answer = new int[prices.length];


		//int num=0; // 배열의 갯수 컨트롤용
		int count=1; // 떨어지는 시점을 반환할 변수
		int temp=0;
		for(int num=0;num<prices.length;num++) {
			// 시작 값부터 끝값까지 반복
			temp=prices[num];
			for(int i=num+1;i<prices.length;i++) {
				if(temp>prices[i]) {        			
					answer[num]=count;
					break;
				}else {
					answer[num]=count;
					count++;        			
				}
			}
			System.out.println("answer["+num+"]의 값 :"+answer[num]);
			count=1;
		}

	}
}

// 프로그래머스 제출 답변
//class Solution {
//	public int[] solution(int[] prices) {
//		int[] answer = new int[prices.length];
//		int count=1; // 떨어지는 시점을 반환할 변수
//		int temp=0; // 시작 값을 담을 변수
//		
//		for(int num=0;num<prices.length;num++) {
//			temp=prices[num];
//			for(int i=num+1;i<prices.length;i++) {
//				
//				if(temp>prices[i]) {        			
//					answer[num]=count;
//					break;
//				}else {
//					answer[num]=count;
//					count++;        			
//				}
//			}
//
//			count=1;
//		}
//		return answer;
//	}
//}