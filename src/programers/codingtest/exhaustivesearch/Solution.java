package programers.codingtest.exhaustivesearch;

import java.util.Arrays;

public class Solution {
	
//	시험은 최대 10,000 문제로 구성되어있습니다.
//	문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
//	가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
	public int[] solution(int[] answers) {
        
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        int temp1=0;
        int temp2=0;
        int temp3=0;
        // 1번 수포자 : 1~5 무한 반복
        // 2번 수포자 :index가 짝수,0일때  :2 / index가 홀수 일때 1,3,4,5 반복
        // 3번 수포자 : 3,3,1,1,2,2,4,4,5,5 반복
       
        for(int i=0;i<answers.length;i++) {
        	if(answers[i]==one[i%5]) {
        		temp1++;
        	}
        	if(answers[i]==two[i%4]) {
        		temp2++;
        	}
        	if(answers[i]==three[i%10]) {
        		temp3++;
        	}
        }
     // temp를 1~3으로 변환해야함
        int[] out = {};
        if(temp1==temp2&&temp1==temp3) {// 맞은 갯수가 같은 경우 오름차순 반환
        	int[] sorts = {temp1,temp2,temp3};
        	Arrays.sort(sorts);
        	out = sorts;
        }else if(temp1>temp2&&temp1>temp3) {
        	out =new int[1];
        	out[0]=1;
        }else if(temp2>temp1&&temp2>temp3){ 
        	out = new int[1];
        	out[0]=2;
        }else {
        	out = new int[1];
        	out[0]=3;
        }
        
        return out;
    }
	
	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
//		int[] answers = {1,3,2,4,2};
		int[] receive=new Solution().solution(answers);
		for(int m=0;m<receive.length;m++) {
			System.out.print(receive[m]);
		}
	}
	
}
