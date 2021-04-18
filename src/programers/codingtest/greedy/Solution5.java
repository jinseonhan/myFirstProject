package programers.codingtest.greedy;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution5 {
	  public int solution(int n, int[][] costs) {
	        int answer = 0;
	        
	        HashMap<Integer, Integer> parents = new HashMap<>(); // 트리를 확인하기위한 맵
	        ArrayList<Integer> arr = new ArrayList<>(); // 가중치 값들을 담아놓을 배열
	        int maximum = 0;	// 건설비용 최대값
	        int temp=1;
	        for(int i=0;i<n;i++) {
	        	if(maximum<costs[i][2]) {
	        		maximum=costs[i][2];
	        	}
	        	arr.add(costs[i][2]);	        	
	        	parents.put(i, i); // 0,0 1,1 2,2 3,3
	        }// 트리를 위한 초기값 세팅
	        // 노드가 연결되면 answer ++;
	        
	        // [i][2]의 가장 큰 값을 찾고, 1부터 그 가장 큰값까지 
	        for(int i=0;i<costs.length-1;i++){
        		for(int j=0;j<arr.size();j++) {
		        	if(parents.get(i)==parents.get(i+1)) {
	        			
	        		}
        		}
	        	if(answer==n-1) {
	        		break;
	        	}
	        }
	        
	        
	        return answer;

	  }
	  
	  public static void main(String[] args) {
		  int costs[][] = {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
		  new Solution5().solution(4, costs);
	  }

}