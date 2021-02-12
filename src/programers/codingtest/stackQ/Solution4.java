package programers.codingtest.stackQ;

import java.util.LinkedList;
import java.util.Queue;

public class Solution4 {
	 
	class Original{
		int prior; // 우선순위
		int lo; // 본래의 location
		public int getPrior() {
			return prior;
		}
		public void setPrior(int prior) {
			this.prior = prior;
		}
		public int getLo() {
			return lo;
		}
		public void setLo(int lo) {
			this.lo = lo;
		}
		public Original(int prior, int lo) {
			this.prior = prior;
			this.lo = lo;
		}
		
	}
    public int solution() {
        int answer = 0;
        int[] priorities = {1,1,9,1,1,1};
        int location = 4;
        int topScore =0; // 가장 높은값을 찾는다        
        Queue<Original> q = new LinkedList<>();
        
        // 반복문으로 key value와 같은 형식으로 큐에 담는다.
        for(int i=0;i<priorities.length;i++) {
        	q.offer(new Original(priorities[i], i));
        }
        // 무한으로 돌리고 location =4일때 반환 시킨다.
        int tempNum=0;
        while(true) {
        	tempNum = q.size();
        	
        	// 가장 높은 숫자를 찾는다.
        	for(int j=0;j<tempNum;j++) {
        		if(q.peek().getPrior()>topScore) {
        			topScore=q.peek().getPrior(); 
        		}
        		q.add(q.peek());
        		q.remove();
        	}
        	// 가장 높은 숫자들을 반복해서 뺀다.
        	for(int h=0;h<tempNum;h++) {
        		if(q.peek().getPrior()==topScore) {
        			answer++;
        			if(q.peek().getLo()==location) {
        				return answer;
        			}
        			q.remove();
        		}else {
    				q.add(q.peek());
    				q.remove();
    			}
        	}
        	topScore=0;
        }
    }
    
	   
	    
	public static void main(String[] args) {
		System.out.println(new Solution4().solution());
	}
}
