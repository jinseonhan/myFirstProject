package programers.codingtest.stackQ;
//int[] progresses : 진도값
//int[] speeds : 속도
//1. 연속된 수가 100이 나가는 조건
//2. 그 갯수 만큼 한번에 나가는 것을 카운트한 것을 값으로 저장
//3. 한번에 나가는 날짜의 갯수를 배열 인덱스로 저장
// 어렵다잉
import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
	public static void main(String[] args) {
		new Solution2().solution();
	}
	
	public void solution() {
		Queue<Integer> q = new LinkedList<>(); // 갯수를 담을 변수
		
		int[] progresses = {95,90,99,99,80,90};
		int[] speeds = {1,1,1,1,1,1};
		int[] answer= {};
		int[] speedsUp = speeds.clone();
		
		int count=0;
		int out=0;
		
		// i라는 변수를 증가시켜서 앞에를 쳐내고
		// que에  담는다.
		
		// speed를 증가
		while(count<progresses.length) {
			// speed를 더할 변수
			for(int i=count;i<progresses.length;i++) {
				speedsUp[i]+=speeds[i];
				if(progresses[i]+speedsUp[i]>=100) { // -1도 포함됨 , 연속되지를 않네
					// 연속되게 만들어야함
					if(i==0) {
						out++;
					}
					else if(i>=0&&progresses[i-1]+speedsUp[i-1]>=100) {
						out++;						
					}					
				}
			}
			if(out!=0) {	
				q.offer(out); // 한번에 빠져나간 갯수를 q 에 담는다.
			}
			count+=out; // 이미 빠진것을 제외시킴
			out=0; // out를 초기화
		}
		answer = new int[q.size()]; // q의 사이즈가 지정이 되었기 때문에 출력용 answer의 크기를 지정할 수 있다.
		
		System.out.println("q의 사이즈는? "+q.size());
		for(int z=0;z<answer.length;z++) {
			
			answer[z]=q.peek();
			System.out.println("q의 값 나열 : "+answer[z]);
			q.poll();
		}
	}
	
}
