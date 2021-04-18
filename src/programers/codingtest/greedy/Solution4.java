package programers.codingtest.greedy;

import java.util.Arrays;

public class Solution4 {
	 public int solution(int[] people, int limit) {
	        int answer = 0;
	        int leng = people.length-1;
	        
	        // 1. 내림차순으로 만든다.
	        Arrays.sort(people);

	        // 2. 혼자만 탑승해야하는 사람들을 센다
	        for(int i=0;i<=leng;i++,answer++) {
	        	  while(leng > i && people[i] + people[leng--] > limit) 
	                  answer++;
	        }
	        
	        
	        
	        return answer;
	 }
	 
	 
	 
	 public static void main(String[] args) {
		 int people[] = {70,50,80,50};
		 System.out.println(new Solution4().solution(people,100));
	 }
}
