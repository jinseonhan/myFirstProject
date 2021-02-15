package programers.codingtest.heap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution2 {
	public void solution1() {
		int answer=0; // 평균 대기 시간
		
		int[][] jobs = {{0,3},{1,9},{2,6}}; // [입력 시간]과 [작업 시간]
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder()); // 작업시간이 짧은 것을 넣을 	q
		Map<Integer, Integer> pro = new HashMap<Integer, Integer>();

		int k=0;
		int val=0;
		// map형태로 변경
		for(int i=0;i<jobs.length;i++) {
			for(int j=0;j<jobs[i].length;j++) {
				if(j==0) {
					k=jobs[i][j];
				}else {
					val=jobs[i][j];
				}
			}
			pro.put(k, val);
		}
		// 1. 우선순위는 처리시간이 짧은 것이 먼저 처리된다.
		// 대기 시간이 길어지는 만큼 값을 더한다.
		// * 대기시간+처리시간 = 현재시간 -입력시간
		
		// 현재시간를 저장할 것이 필요
		int now=0; // 흘러가는 시간
		int start=0; // 처리 시작시간
		// 처리 시작시간+ 작업시간 => poll
		
		
		// 작업을 처리 시작할 때 poll -> 현재시간 - 입력시간 = answer
		// 작업을 종료하고 새로운 작업을 시작할 때 offer -> 남은 것들 중 value값이 가장 작은 것 부터 넣는다.
		while(true) {
			// q에 넣을 때, 
			if(pro.containsKey(now)) {
				// 기존 것이 나갈 시점에 해야함 pro.put(now, pro.get(now)+now);
				q.offer(pro.get(now));
			}
			
			// q에서 뺄 때
			if(now==pro.get(now)) {
				
			}
			now++;
			
		}
		
		
//		return answer/jobs.length;
	}
	
	public static void main(String[] args) {
		new Solution2().solution1();
	}
}
