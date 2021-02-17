package programers.codingtest.heap;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class workT{
	int it; // 입력 시간
	int wt; // 작업 시간
	int st; // 작업 시작시간
	public int getIt() {
		return it;
	}
	public void setIt(int it) {
		this.it = it;
	}
	public int getWt() {
		return wt;
	}
	public void setWt(int wt) {
		this.wt = wt;
	}
	
	public int getSt() {
		return st;
	}
	public void setSt(int st) {
		this.st = st;
	}
	public workT(int it, int wt,int st) {
		super();
		this.it = it;
		this.wt = wt;
		this.st = st;
	}
	
}

public class Solution2 {
	
	public void solution1() {
		int answer=0; // 평균 대기 시간
		int now=0; // 흘러가는 시간
		
		int[][] jobs = {{0,3},{1,9},{2,6}}; // [입력 시간]과 [작업 시간]
		PriorityQueue<workT> delay  = new PriorityQueue<>(Collections.reverseOrder()); // 대기 큐
		Queue<workT> working = new LinkedList<>(); // 작업 큐
		//workT w = new workT();
		int temp=0;// 정렬용 임시 변수
		
		// 1. 시간을 기준으로 들어오는 순서를 정렬하여 대기 큐로 넣는다.
		for(int i=0; i<jobs.length-1;i++) {
			if(jobs[i][1]>jobs[i+1][1]) {
				temp=jobs[i][1];
				jobs[i+1][1]=jobs[i][1];
				jobs[i][1]=temp;
			}
		}
		// now가 0일때 시작 큐에 넣음
		if(jobs[now][1]==now) {
			working.offer(new workT(now, jobs[now][1], now));
		}
		
		while(working.size()!=0) {
			// 시간 증가
			now++;
			// 3-1. 시간이 되면 나오기
			if(working.size()!=0&&working.peek().getIt()+working.peek().getWt()==now) {
				answer+=now-working.peek().getIt(); // 현재시간 - 대기큐에 입력된 시간
				working.poll(); // 작업 큐를 비운다.
			}
			
			// 2. 시간이 되면 대기 큐에 넣는다.
			if(jobs[now][1]==now) {
				delay.offer(new workT(jobs[now][0], jobs[now][1], now));
			}			
			// 3. 기존 작업이 끝나면 대기 큐에 있는 것 중 우선순위는 처리시간이 짧은 것을 먼저 처리한다.
			// 객체의 우선순위를 어떻게 알지??
			if(working.size()==0) {
				// 대기 큐에서 우선순위가 높은 것을 작업 큐에 넣는다.
			}
			// 3-2. 시간이 되면 넣기
			
			
		}
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
