package programers.codingtest.greedy;

import java.util.Arrays;
import java.util.Comparator;
///
public class camera {
	
	    public int solution(int[][] routes) {
	        int answer = 1;
	        
	        Arrays.sort(routes, new Comparator<int[]>(){
	           @Override
	            public int compare(int[] a, int[] b){
	                return a[0] - b[0];
	            }
	        });
	        
	        int min = routes[0][0];
	        int max = routes[0][1];
	        for(int i = 1 ; i < routes.length ; ++i){
	            int in = routes[i][0];
	            int out = routes[i][1];
	            
	            if(in > max || out < min) {
	                answer++;
	                min = in;
	                max = out;
	            } else {
	                min = in > min ? in : min;
	                max = max > out ? out : max;
	            }
	        }
	        
	        return answer;
	    }
	
	 
	 
	 
	 public static void main(String[] args) {
		 int[][] routes= {{-20,15},{-14,-5},{-18,-13},{-5,-3}};
		 System.out.println(new camera().solution(routes));
	 }
}
