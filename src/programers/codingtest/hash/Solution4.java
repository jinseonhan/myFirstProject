package programers.codingtest.hash;

import java.util.HashMap;

public class Solution4 {
	 public int[] solution(String[] genres, int[] plays) {
	        int[] answer = {};
	        int[] out =new int[4];

	        HashMap<String, Integer> map = new HashMap<>(); // 장르, 횟수 저장하고
	        	        
	        // 1.해시 맵으로 옮기기
	        for(int i=0;i<plays.length;i++) {
	        	map.put(genres[i], plays[i]);
	        	
//	        	if(plays[i]>temp) {
//	        		
//	        		temp=plays[i]; // 가장 큰 값 구하기
//	        		str=genres[i];
//	        	}
	        }

	        // 1.속한 노래가 많이 재생된 장르를 먼저 수록
	        // 2.장르내에서 많이 재생된 노래를 먼저수록
	        // 3.장르 내에서 재생 횟수가 같은 노래중에서는 고유번호가 낮은 노래를 먼저 수록
	        
	        return answer;
	    }
}
