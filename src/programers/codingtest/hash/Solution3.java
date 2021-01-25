package programers.codingtest.hash;

import java.util.HashMap;
import java.util.Set;

class Solution3 {
    public int solution(String[][] clothes) {
        int answer = 1; // 1. 곱셈을 위해 1로 선언
        
        HashMap<String,Integer> clothesMap = new HashMap<>();
        // 2. map 구하기   
        for(int i=0; i<clothes.length; i++) {
        	// 3. 의상 종류, 갯수
        	clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1], 0)+1);
        }
        
        // 4. 조합
        Set<String> keySet =clothesMap.keySet();
        
        for(String key:keySet) {
        	answer*=clothesMap.get(key)+1;
        }
        
        return answer-1; // answer에서 아무것도 안입었을 경우의 수를 제거
    }
}