package programers.codingtest.exhaustivesearch;

import java.util.ArrayList;

public class Solution {
	
//	시험은 최대 10,000 문제로 구성되어있습니다.
//	문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
//	가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
	public int[] solution(int[] answers) {
        int[] answer= {};
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        int [] temp = new int[3]; // 각 수포자의 정답의 갯수를 담을 변수
       
        for(int i=0;i<answers.length;i++) { // 각 정답의 갯수 구하기
        	if(answers[i]==one[i%5]) { // 반복 주기 =5
        		temp[0]++;
        	}
        	if(answers[i]==two[i%8]) { // 반복주기 =8
        		temp[1]++;
        	}
        	if(answers[i]==three[i%10]) { // 반복주기 =10
        		temp[2]++;
        	}
        }
        
        // temp[0](1번 수포자) 기준으로 더 높은 점수가 있는지 비교한다.
        int high=temp[0];
        // 가장 높은 점수를 구함
        for(int i=0;i<temp.length;i++) {
        	if(temp[0]<=temp[i]) {
        		high=temp[i];
        	}
        }

        // 가장 높은 점수와 각 수포자들의 점수와 비교하여 가장 높은 점수를 받은 수포자들을 list에 담는다. 
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<temp.length;i++) {
        	if(temp[i]==high) {
        		list.add(i+1);
        	}
        }
        // list에 저장된 사이즈 만큼의 index 생성
        answer= new int[list.size()];
        
        // list의 값을 answer에 담는다.
        for(int i=0;i<list.size();i++) {
        	answer[i]=list.get(i);
        }
     
        // answer 에 담아 반환
        
        return answer;
        
    }
	
	public static void main(String[] args) {
//		int[] answers = {1,2,3,4,5};
//		int[] answers = {1,3,2,4,2};
		int[] answers = {1,4,5,2,1,3,4,1,2,3,4,1,2,3,4};
	
		int[] receive=new Solution().solution(answers);
		for(int m=0;m<receive.length;m++) {
			System.out.println(receive[m]);
		}
	}
	////
}
