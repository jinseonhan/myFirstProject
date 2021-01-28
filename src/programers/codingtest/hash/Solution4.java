package programers.codingtest.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 문자열 배열이 주어지고 중복되는 문자열을 걸러야 로직을 작성해야할 경우 해시를 주로 사용한다.(특히 그 문자열을 다시 반환하지 않을 경우 사용)
public class Solution4 {
	
	public static void main(String[] args) {

		String[] genres = { "classic", "pop", "classic", "classic", "pop", "dance", "k-pop",
				"k-pop", "k-pop" };
		int[] plays = { 500, 600, 150, 800, 2500, 1000, 2000, 3000, 500 };

		
	}
	
	 public int[] solution(String[] genres, int[] plays) {
	        int[] answer = {};
	        int[] out =new int[4];

	        Map<String, Integer> map = new HashMap<>(); // 장르, 횟수 저장하고
	        	        
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
