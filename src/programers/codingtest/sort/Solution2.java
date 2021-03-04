package programers.codingtest.sort;

public class Solution2 {
	
	// 주어진 수를 합쳐 큰수 만들기
	// 1. 숫자들을 이어붙여 가장 큰 수를 만든다.
	// 2. 자릿수를 비교한다.
	// 3. 작은 자릿수중 가장 큰수부터 문자열값으로 변경하여 앞으로 이어붙인다.
	// 4. 자릿수 가장 큰것까지 반복한다.
	
//	 문제
//	0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
//	예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 
//	이중 가장 큰 수는 6210입니다.
//	0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 
//	순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
	// a. string으로 바꾸어  chatAt[0] 비교하여 큰 숫자
	  public String solution(int[] numbers) {
		  	String answer = "";
	        StringBuilder sb = new StringBuilder();
		  	int temp=0;
	       
		  	
	        // 자릿수가 작을 수록 앞에 넣는다.
	        // charAt(0)을 비교하여 큰 수이면 앞으로 보낸다.
	        for(int i=0;i< numbers.length-1;i++) {
	        	for(int j=i+1;j<numbers.length;j++) {
	        		if(numbers[i]%10<=numbers[j]%10) {
	        			temp= numbers[i];
	        			numbers[i]=numbers[j];
	        			numbers[j]=temp;
	        		}
	        	}
	        	answer+=Integer.toString(numbers[i]);
	        }
	        	answer+=Integer.toString(numbers[numbers.length-1]);
	        return answer;
	    }
	
	
	  public static void main(String[] args) {
		 // int[] numbers = {6,10,2};
		  int[] numbers = {3,30,34,5,9};
		  System.out.println(new Solution2().solution(numbers));
	  }
}

