package programers.codingtest.stackQ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution3 {
	public static void main(String[] args) {
		System.out.println(new Solution3().solution());
	}
	
	
	// 조건 1 : 트럭은 1초에 1씩 움직임
	// 조건 2 : 트럭이 다리에 완전히 올랐을때의 무게만 고려
	public int solution() {
		int answer=1; // 흘러간 시간을 담아 반환
		int bridge_length=2; // 다리의 길이
		int weight=10; // 한계 중량
		int[] truck_weights = {7,4,5,6}; // 트럭의 무게
		int limitWeight=0; // 현재 중량
		// 여러개가 들어갔을때 어떻게?
		// 큐에 들어갔을때의 시간을 센다.
		// 배열에 그 큐에 들어갔을때의 시간을 담아 
		Queue<Integer> startTime = new LinkedList<>(); // 다리를 건너기 시작 시간을 담을 큐
		Queue<Integer> totalWeight = new LinkedList<>(); // 다리 총 중량
		// 대기 트럭들을 que에 옮겨 담는다.
		
		Queue<Integer> queDelay = new LinkedList<Integer>(); // 대기 트럭
		// 트럭정보를 queDelay로 옮겨담기
		for(int i=0;i<truck_weights.length;i++) {
			queDelay.add(i);
		} 	
			// 건너기 시작하는 초기값 세팅
			totalWeight.add(queDelay.peek());
			startTime.add(answer);
			limitWeight=queDelay.peek();
			queDelay.remove();
		while(queDelay.size()>0||startTime.size()>0) { // 큐의 값이 모두 null이 될때까지 반복
			answer++; // 1초 가 지나감			
			if(queDelay.size()!=0) {
				limitWeight+=queDelay.peek(); // 현재 중량을 늘리고
				totalWeight.add(queDelay.peek()); // 트럭의 무게를 담는다.
				startTime.add(answer); // 차량이 건너는 시작시간을 answer에 넣는다.
				queDelay.remove();			// 트럭을 내보낸다.	
			}
			// 다리로 건너기
			if(limitWeight+queDelay.peek()<=weight) { // 트럭이 추가로 건널수 있을지 확인
				// 다리에서 트럭 제거하기
				if(totalWeight.size()>=0&&bridge_length<answer-startTime.peek()) { // 트럭이 다리를 완전히 건널 때
					
					limitWeight-=totalWeight.peek(); //중량을 뺀다.
					totalWeight.remove(); // 무게를 뺀다.
					startTime.remove(); // 시간을 뺀다.
				}
				// 다리에 대기트럭 올리기
			}
		}
			return answer;
	}
	
}
