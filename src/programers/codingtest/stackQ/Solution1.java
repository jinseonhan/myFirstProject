package programers.codingtest.stackQ;

import java.util.Stack;

//  1.스택이란 ? : 한쪽 끝에서만 자료를 넣고 뺄 수 있는 LIFO형식의 자료구조
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
// 수식의 괄호 검사 (연산자 우선순위 표현을 위한 괄호 검사)

public class Solution1 {
	public static void main(String[] args) {
		new Solution1().solution();
	}
	
	 public void solution() {
		int[] prices= {1,2,3,2,3};
        int[] answer = new int[prices.length];
//        Stack<Integer> st = new Stack<>();
        
//        for(int j=prices.length-1;j>=0;j--) {
//        	st.push(prices[j]);
//        }
        int num=0;
        int count=0; // 떨어지는 시점을 계산하는 변수
        for(int i=0;i<prices.length;i++) {
        	if(prices[num]>prices[i]||) {
        		answer
        		continue;
        	}else {
        		
        	}
        }
        	
//        System.out.println(st.toString());
   
    }
}
