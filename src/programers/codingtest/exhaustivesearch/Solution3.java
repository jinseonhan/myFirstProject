package programers.codingtest.exhaustivesearch;


public class Solution3 {
	public int[] solution(int brown, int yellow) {
        
		int[] answer = new int[2];
		int temp=1;

		for(int i=1;i<=yellow;i++) {
        	if(yellow%i==0) { // i가 yellow의 세로의 길이가 가능한지 체크
        		temp=yellow/i; // yellow의 가로의 길이로 저장
        		// brown에 대입하기
        		if((brown+yellow)==(temp+2)*(i+2)) { // 전체 면적(brown의 가로*brown의 세로) = brown + yellow  
        			answer[1]=(temp+2); // brown의 세로의길이
        			answer[0]=(i+2);	// brown의 가로의 길이
        		}
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int brown = 8;
		int yellow = 1;
		
		int[] arr =new Solution3().solution(brown, yellow);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
