package my.study.coding;

public class exam4 {
	 public String solution(int n) {
	        String answer = "";
	        int quo =n;
	        String temp="";
	        
	        
	        // 3보다 몫이 작을떄까지 나눈다.
	        while(quo>=3) { // 나머지가 0일떄까지 반복   //5, 1
	        	temp+=Integer.toString(quo%3); // 나머지를 담는다. //  temp = 2
	        	quo=quo/3; // 몫 저장 //1
	        }
	        // 나머지 0을 먼저 담고
	        // 
	        temp+=Integer.toString(quo); // temp = 21
	        char change[] = temp.toCharArray(); // change = [2,1]

	        for(int i=change.length-1;i==0;i++) {  // 
	        	switch(change[i]) {
	        		case '0': answer+="1";break;
	        		case '1': answer+="2";break;
	        		case '2': answer+="4";break;
	        	}
	        }
	        System.out.println(answer);
	        return answer;
    }
	 
	 
	public static void main(String[] args){
		System.out.println(new exam4().solution(1));
	}
}
