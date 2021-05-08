package programers.codingtest.greedy;

import java.util.ArrayList;

public class camera {
	ArrayList<Integer> list = new ArrayList<>(); // 출구값들을 담아 놓을 arraylist
	
	 public int solution(int[][] routes) {
	        int answer = 0;
	        int input=0; // 입구값
	        int output=0; // 출구값
	        
	        for(int i=0;i<routes.length;i++) {
	        	if(input==0&&output==0) { // 처음 시작 값 담아주기
	        		input =routes[i][0];
	        		output=routes[i][1];
	        		answer++;
	        	}else {
	        		if(input<routes[i][0]||output>routes[i][1]) {
		        		if(input<routes[i][0]) {
		        			input=routes[i][0];
		        		}
		        		if(output>routes[i][1]) {
		        			output=routes[i][1];
		        		}
	        		}else {
	        			input=0;
	        			output=0;
	        			answer++;
	        		}
	        		
	        	}
	        }
	        answer++;
	        return answer;
	 }
	 
	 
	 
	 public static void main(String[] args) {
		 int[][] routes= {{-20,15},{-14,-5},{-18,-13},{-5,-3}};
		 System.out.println(new camera().solution(routes));
	 }
}
