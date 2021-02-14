package programers.codingtest.heap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

// Heap 이란?
// 1.완전 이진 트리의 일종으로 우선순위 큐를 위하여 만들어진 자료구조
// 2.여러 개의 값들 중에서 최댓값이나 최솟값을 빠르게 찾아내도록 만들어진 자료구조
// 3.힙은 일종의 반정렬 상태(느슨한 정렬 상태)를 유지한다.
// 4.힙 트리에서는 중복된 값을 허용한다.

// 우선순위 큐 : 우선순위의 개념을 도입한 자료구조
// 데이터들이 우선순위를 가지고 있고 우선순위가 높은 데이터가 먼저 나간다.
// 이용사례
// 1. 시뮬레이션 시스템
// 2. 네트워크 트래픽 제어
// 3. 운영 체제에서의 작업 스케줄링
// 4. 수치 해석적인 계산
// 우선순위 큐는 [배열] [연결리스트] [힙] 으로 구현 가능하다. 그중에서 [힙]이 가장 효율적

// 힙(heap)의 종류
// 최대 힙 : 부모 노드의 키 값이 자식 노드의 키 값보다 크거나 같은 완전 이진트리
// 최소 힙 : 부모 노드의 키 값이 자식 노드의 키 값보다 작거나 같은 완전 이진트리

// 힙의 구현
// 힙을 저장하는 표준적인 자료구조는 [배열]이다.
// 구현을 쉽게 하기 위하여 배열의 첫 번째 인덱스인 0은 사용되지 않는다.
// 특정 위치의 노드 번호는 새로운 노드가 추가되어도 변하지 않는다.

public class Solution {
	public int solution1() {
		int[] scoville = {1,2,3,8,10,12};
		int K = 7;
		int answer = 0; // 음식을 섞은 횟수(반환할 값)
		
		ArrayList<Integer> mix = new ArrayList<Integer>();
		
		
		for(int i =0;i<scoville.length;i++) {
			if(scoville[i]<K) {
				mix.add(scoville[i]);
			}
		}
		
		// 
		while(mix.get(0)<K&&mix.size()>=2) {
			// 반복 횟수
			answer++;
			mix.sort(null); // 오름차순
			
			mix.add(mix.get(0)+(mix.get(1)*2));
			mix.remove(0);
			mix.remove(0);

		}
		
		
		return answer;
	}
	
	public int solution2() {
		int[] scoville = {1,2,3,8,10,12};
		int K = 7;
		int answer = 0; // 음식을 섞은 횟수(반환할 값)
		
		PriorityQueue<Integer> heap = new PriorityQueue<>(); // 우선순위가 낮은 순서의 큐 생성
		//PriorityQueue<Integer> heapEx = new PriorityQueue<>(Collections.reverseOrder()); // 우선순위가 높은 순서의 큐 생성
		
		// 객체에 기존 배열의 값을 담는다.
		for(int i : scoville) {
			heap.offer(i);
		}
		
		// 큐의 처음 값이 K보다 작을 경우 반복한다.
		while(heap.peek()<K) {
			// 음식을 섞었는대도 남은 size가 1일 경우에는 더이상 K보다 커질 수 없다.
			if(heap.size()==1) {
				return -1;
			}
			
			// 우선순위가 낮은 값들 2개를 변수에 담아
			int a = heap.poll();
			int b = heap.poll();
			
			// 음식을 섞는다.
			int result = a+(b*2);
			
			// 섞은 음식을 다시 큐에 담는다.
			heap.offer(result);
			
			// 섞은 횟수를 증가시킨다.
			answer++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
//		System.out.println(new Solution().solution1());
		System.out.println(new Solution().solution2());
	}
}
