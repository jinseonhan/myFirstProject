package programers.codingtest.hash;

import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        String temp="";
        // 1. 정렬한다.
        // 2. 순서에 알맞지 않으면 그 값이 없는 값이다.
        // 3. 그 값을 answer에 담아 반환한다.
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i=0;
        while(i<participant.length) {
        	if(!participant[i].equals(completion[i])) {
        		temp=participant[i];
        		break;
        	}else {
        		i++;
        	}
        }
        // 4. participant의 마지막이 없을경우 ""로 temp에 담기는 것 방지
        if(!temp.equals("")) {
        	answer=temp;
        }else {
        	answer=participant[participant.length-1];
        }
        
        return answer;
    }
}