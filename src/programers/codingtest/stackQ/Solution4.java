package programers.codingtest.stackQ;

public class Solution4 {
	
	    public int solution() {
	        int answer = 0;
	        int[] priorties = {1,1,1,1,1,4,1,2,4,2};
	        int location = 4;
	        int topIndex=0; // 그 인덱스를 담는다.
	        int topScore =0; // 가장 높은값을 찾는다
	        // 1. 우선순위가 높은 인덱스를 찾는다.
	        // 2-1. location이 우선순위보다 값이 크다면 [자기자신-우선순위+1] 
	        // 2-2. location이 우선순위보다 값이 작다면 [총길이-우선순위-자기자신+1]
	        // 2-3. location 자신이 우선순위가 가장 높다면 [1]로 반환
	        
	        // 먼저 우선순위가 가장 높은 index를 찾자
	        for(int i=0;i<priorties.length;i++) {
	        	if(topScore<priorties[i]) {
	        		topScore=priorties[i];
	        		topIndex=i; // 높은 인덱스 값을 담는다.
	        	}
	        }
	        System.out.println("topIndex의 값 : "+topIndex);
	        if(topIndex>location) {
	        	System.out.println("topIndex>location");
	        	answer=priorties.length-topIndex-location+1;
	        }else if(topIndex==location) {
	        	System.out.println("topIndex==location");
	        	answer=location-topIndex+1;
	        }else {
	        	System.out.println("topIndex<location");
	        	answer=1;
	        }  
	        return answer;
	    }
	public static void main(String[] args) {
		System.out.println(new Solution4().solution());
	}
}
