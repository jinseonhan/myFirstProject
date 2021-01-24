package programers.codingtest.hash;

import java.util.HashMap;

class Solution3 {
    public int solution(String[][] clothes) {
        int answer = 0;
        
        
        // 1.key를 확인하며 없으면, 키를 추가한다.
        // 2.
        
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
       
        for(String s:clothes) {
        	if(!hm.containsKey(s[1])) {
        		hm.put(s[1],1);
        	}else {
        		hm.put(s[1], hm.get(s[1])+1);
        	}
        }
        
        
        
        
        return answer;
    }
}