package programers.codingtest.heap;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution2 {
	public void solution1() {
		int answer=0; // 평균 대기 시간
		int now=0; // 흘러가는 시간
		
		int[][] jobs = {{0,3},{1,9},{2,6}}; // [입력 시간]과 [작업 시간]
		PriorityQueue<Integer> delay  = new PriorityQueue<>(Collections.reverseOrder()); // 대기 큐
		Queue<Integer> working = new LinkedList<Integer>(); // 작업 큐
		
		int[][] temp=new int[jobs.length][2];// 정렬용 임시 변수
		
		for(int i=0;i<jobs.length;i++) {
			if(jobs[i][0]>jobs[i+1][0]&&jobs[i+1]!=null) {
				System.out.println(i+"번 반복");
			}
		}
		
		
		// 1. 시간을 기준으로 들어오는 순서를 정렬하여 대기 큐로 넣는다.
		// 2. 시간이 되면 대기 큐에 넣는다.
		// 3. 기존 작업이 끝나면 대기 큐에 있는 것 중 우선순위는 처리시간이 짧은 것을 먼저 처리한다.
		// 4. 대기 큐가 비어있다면 반복문을 끝내고 반환한다.
		// * 대기시간+처리시간 = 현재시간 -입력시간
		
		// 현재시간를 저장할 것이 필요
		// 처리 시작시간+ 작업시간 => poll
		
		
		// 작업을 처리 시작할 때 poll -> 현재시간 - 입력시간 = answer
		// 작업을 종료하고 새로운 작업을 시작할 때 offer -> 남은 것들 중 value값이 가장 작은 것 부터 넣는다.
		
		
		
//		return answer/jobs.length;
	}
	
	public static void main(String[] args) {
		new Solution2().solution1();
	}
}
