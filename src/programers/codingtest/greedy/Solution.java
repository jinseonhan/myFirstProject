package programers.codingtest.greedy;

public class Solution {
	public static void main(String[] args) {
		int n = 5; int[] lost= {2,4}; int [] reserve = {1,3,5};
		System.out.println(new Solution().solution(n, lost, reserve));
		
	}
	
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        answer = n-lost.length; // 전체 학생수 - 체육복을 잃어버린 학생수 = 여벌옷을 제외하고 체육복을 입을 수 있는 사람의 수
        
        // 여벌체육복을 가지고 왔지만 체육복을 하나 잃어버려 여벌옷을 자신이 입어야할 경우
        // ***반복문을 따로 만든 이유 : 여벌옷을 빌려줄 때 한치수 큰 체육복을 빌려입을 학생한태 빌려주고 나면 자신이 입을수 없는 상황이 발생하기 때문에
        // 						 먼저 자신의 여벌 체육복을 먼저 입게 만들어야한다.
        for(int j=0;j<lost.length;j++) {
        	for(int k=0; k<reserve.length;k++) {
	        	if(lost[j]==reserve[k]) {
	    			answer++; // 체육복을 입을 수 있는 사람 더해주기
	    			lost[j]=-1; // 다음 반복문이 실행될 때 다시 카운트 하지 않기 위해 값 변경
	    			reserve[k]=-1; // 여벌 옷을 빌려주었기 때문에, 더이상 카운트 하지 않기 위해 값 변경
	    			break; 
	    		}
        	}
        }
        
        // 여벌의 체육복을 입게할 반복문
        for(int j=0;j<lost.length;j++) { // 잃어버린 사람 기준의 반복문
        	for(int k=0; k<reserve.length;k++) {
        		// case 1 : 한 치수 작은 체육복을 입을 경우
        		if(lost[j]==reserve[k]+1) {
        			answer++; // 체육복을 입을 수 있는 사람 더해주기
        			reserve[k]=-1; // 여벌 옷을 빌려주었기 때문에, 더이상 카운트 하지 않기 위해 값 변경
        			break;
        		}
        		
        		// case 2 : 한 치수 큰 체육복을 입을 경우
        		if(lost[j]==reserve[k]-1) {
        			answer++; // 체육복을 입을 수 있는 사람 더해주기
        			reserve[k]=-1; // 여벌 옷을 빌려주었기 때문에, 더이상 카운트 하지 않기 위해 값 변경
        			break;
        		}
        		
        	}
        }
        	
        return answer;
    }
}