package programers.codingtest.hash;

import java.util.HashMap;

public class Solution4 {
	 public int[] solution(String[] genres, int[] plays) {
	        int[] answer = {};
	        int[] out =new int[4];
	        int temp=0;
	        int sum=0;
	        String str = "";
	        int a=0;
	        // 1.장르의 갯수를 알아야함 key 에 넣고 없으면 저장
	        HashMap<str, a> map = new Hashmap();
	        // 2.장르별 가장 많이 재생 된 노래를 2개씩 저장
	        
	        for(int i=0;i<plays.length;i++) {
	        	if(plays[i]>temp) {
	        		
	        		temp=plays[i]; // 가장 큰 값 구하기
	        		str=genres[i];
	        	}
	        }
	        
	        for(int i=0;i<out.length;i++) {
	        }
	        
	        
	        return answer;
	    }
}
