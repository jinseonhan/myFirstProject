package my.study.coding;

import java.util.Arrays;

// 최소 공배수 구하기
public class exam11 {
	 public int solution(int[] arr) {
	     int answer=1;   
		 int gcd=1; 
	        
	        
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++) {
        	int temp=1;
        	for(int j=1;j<=(arr[i]/2);j++) {
        		if(arr[i]%j==0 && gcd%j==0) {
        			temp=j;
        		}
        	}
        	if(temp>gcd) {
        		gcd=temp;
        	}
        }	        
        // 최대 공약수를 구한다.
        // 모든 수를 곱하고 최대공약수로 나눈다.
        for(int i=0;i<arr.length;i++) {
        	answer*=arr[i];
        }
        System.out.println("gcd : "+ gcd);
        answer/=gcd;
        
        return answer;
	 }
	 
	 public static void main(String[] args) {
		 int[] arr = {8,6,2,14};
		 System.out.println(new exam11().solution(arr));
	 }
}
