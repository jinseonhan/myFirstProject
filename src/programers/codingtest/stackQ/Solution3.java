package programers.codingtest.stackQ;

import java.util.LinkedList;
import java.util.Queue;

// 조건 1 : 트럭은 1초에 1씩 움직임
// 조건 2 : 트럭이 다리에 완전히 올랐을때의 무게만 고려
public class Solution3 {
	// 트럭의 정보를 담을 객체 생성
	class Truck {
        int weight;
        int entry;
        
        Truck(int weight, int entry){
            this.weight = weight;
            this.entry = entry;
        }
    }
	
	public int solution() {
		int answer=0; // 흘러간 시간을 담아 반환
		int bridge_length=2; // 다리의 길이
		int weight=10; // 한계 중량
		int[] truck_weights = {7,4,5,6}; // 트럭의 무게
		int limitWeight=0; // 현재 중량
		
		// 배열에 그 큐에 들어갔을때의 시간을 담아 
		Queue<Truck> bridge = new LinkedList<>(); // 다리 총 중량
		// 대기 트럭들을 que에 옮겨 담는다.
		Queue<Truck> queDelay = new LinkedList<>(); // 대기 트럭
		// 트럭정보를 queDelay로 옮겨담기
		for(int i=0;i<truck_weights.length;++i) {
			queDelay.offer(new Truck(truck_weights[i], 0));
		} 	
				
		while(!queDelay.isEmpty()||!bridge.isEmpty()) { // 큐의 값이 모두 null이 될때까지 반복
			answer++; // 1초 가 지나감		
			
			if(!bridge.isEmpty()) { // 다리를 건너는 트럭이 있다면 
				Truck t = bridge.peek(); // 트럭을 다리에 올린다
				if(answer-t.entry>=bridge_length) { // t라는 트럭이 다리를 건너게 되면
					limitWeight-=t.weight; // 다리의 중량에서 건넌 트럭의 무게만큼 빼주고
					bridge.poll();	// 다리에서 트럭을 빼준다.
				}
				
			}
			if(!queDelay.isEmpty()) { // 대기중인 트럭이 있다면
				if(limitWeight+queDelay.peek().weight<=weight) { // 한계중량을 알아보고
					Truck t = queDelay.poll(); // 기다리는 트럭의 정보를 t에 담아
					limitWeight +=t.weight; // 그 트런의 무게를 더해주고
					bridge.offer(new Truck(t.weight, answer)); // 트럭을 다리에 올린다.(트럭의무게와 현재 시간)
				}
			}
		}
			return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution3().solution());
	}
}
