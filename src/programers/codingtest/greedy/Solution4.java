package programers.codingtest.greedy;

import java.util.Arrays;

public class Solution4 {
	 public int solution(int[] people, int limit) {
	        int answer = 0;
	        int leng = people.length-1;
	        
	        // 1. 내림차순으로 만든다.
	        Arrays.sort(people);

	        // 2. 남아있는 가장 작은 값을 가장 큰수부터 비교하여 limit보다 작거나 같은지 비교한 후
	        // 조건을 만족한다면 카운트하고, 최대값보다 더 큰값으로 치환하여 남은 숫자를 셀 때 카운트 하지 않도록 한다.
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
