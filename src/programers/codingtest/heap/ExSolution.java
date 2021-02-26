package programers.codingtest.heap;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
// 주말에 파악합시다! 주말에 노트북에 세팅하고 TEST
public class ExSolution {
	 class Job {
	        int requestTime;
	        int workingTime;
	        
	        Job(int requestTime, int workingTime){
	            this.requestTime = requestTime;
	            this.workingTime = workingTime;
	        }
	    }
	    
	    public int solution() {
	    	int[][] jobs = {{0,3},{2,6},{1,9}}; // [입력 시간]과 [작업 시간]
	    	LinkedList<Job> waiting = new LinkedList<>();
	    	PriorityQueue<Job> pq = new PriorityQueue<>(new Comparator<Job>() {
	    		@Override
	    		public int compare(Job j1, Job j2) {
	    			return j1.workingTime - j2.workingTime;
	    		}
	    	});
	    	
	    	for(int[] job : jobs) {
	    		waiting.offer(new Job(job[0], job[1]));
	    	}
	    	
	    	Collections.sort(waiting, new Comparator<Job>() {
				@Override
				public int compare(Job j1, Job j2) {
					return j1.requestTime - j2.requestTime;
				}
	    	});
	    	
	    	int answer = 0;
	    	int cnt = 0;
	    	int time = waiting.peek().requestTime;

	    	while(cnt < jobs.length) {
	    		while(!waiting.isEmpty() && waiting.peek().requestTime <= time) {
	    			pq.offer(waiting.pollFirst());
	    		}
	    		
	    		if(!pq.isEmpty()) {
	    			Job job = pq.poll();
	    			time += job.workingTime;
	    			answer += time - job.requestTime;
	    			cnt++;
	    		} else {
	    			time++;
	    		}
	    	}
	    	
	    	return answer / cnt;
	    }
	    public static void main(String[] args) {
			System.out.println(new ExSolution().solution());
		}
}
