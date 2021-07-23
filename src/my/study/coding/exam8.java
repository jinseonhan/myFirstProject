package my.study.coding;
// 숫자의 표현(연속된 자연수 합의 갯수)
//Finn은 요즘 수학공부에 빠져 있습니다. 수학 공부를 하던 Finn은 자연수 n을 연속한 자연수들로 표현 하는 방법이 여러개라는 사실을 알게 되었습니다. 예를들어 15는 다음과 같이 4가지로 표현 할 수 있습니다.
//
//1 + 2 + 3 + 4 + 5 = 15
//4 + 5 + 6 = 15
//7 + 8 = 15
//15 = 15
//자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수를 return하는 solution를 완성해주세요.
//
//제한사항
//n은 10,000 이하의 자연수 입니다.
public class exam8 {
	public int solution(int n) {
        int answer = 0;
        
        int total = 1;
        int count = 1; // 연속된 숫자의 갯수 카운트
        
        do {
        	System.out.println("count : "+ count+", total : "+total);
	     	if(((n-total)%count)==0) {
	    		answer++;
	    	}
	     	count++;
	     	total=total+count;
   
        }while(total<=n);

        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(new exam8().solution(15));
	}
}
