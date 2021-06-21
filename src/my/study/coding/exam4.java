package my.study.coding;


// 124 나라

// ex 1 -> 1 , 2->2, 3-> 4 , 4->11 , 5 ->12 , 6->14 , 7->21 , 8->22 , 9 -> 24 , 10 ->41
public class exam4 {
	 public String solution(int n) {
        String answer = "";
        int quo =0;
        
        
        // 3보다 몫이 작을떄까지 나눈다.
        while(n>0) { // 나머지가 0일떄까지 반복   //5, 1
        	quo=n%3; // 나머지를 담는다. //  temp = 2
        	n=n/3; // 몫 저장 //1
        
        	if(quo==0) {
        		n-=1;
        		quo=4;
        	}

        	answer = quo+ answer;
        }
        
        
        return answer;
    }
	 
	 
	public static void main(String[] args){
		System.out.println(new exam4().solution(10));
	}
}
