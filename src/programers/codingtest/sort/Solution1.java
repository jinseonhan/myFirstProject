package programers.codingtest.sort;

//배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
//
//예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
//
//array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
//1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
//2에서 나온 배열의 3번째 숫자는 5입니다.
//배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때,
//commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요

public class Solution1 {
	 public int[] solution() {
			int[] array= {1,5,2,6,3,7,4}; // 검색할 배열
			int[][] commands= {{2,5,3},{4,4,1},{1,7,3}}; // 시작값, 끝값, 정렬후 반환할 값
		 	int[] answer = {};  // 반환할 변수
		 	int[] temp= null; // 임시로 저장할 매체
		 	int count=0; // temp를 0부터 담게할  count변수
		 	int answerCount=0; // answer를 0부터 담게할 count 변수
		 	int changeTemp=0; // 자리를 교환할 숫자를 임시로 저장할 변수
		 	
		 	answer = new int[commands.length]; // 변수 answer의 크기 지정
		 	
		 	for(int i=0;i<commands.length;i++) {
		 		
		 		temp= new int[commands[i][1]-commands[i][0]+1]; // 변수들의 크기 지정
		 		// 검색할 배열에서 떼어내기
		 		for(int j=commands[i][0]-1;j<commands[i][1];j++) {
		 			temp[count]=array[j];
		 			count++;
		 		}
		 		
		 		// 정렬시작
		 		if(temp.length>=2) {
			 		for(int j=0;j<temp.length-1;j++) {
			 			for(int k=j+1;k<temp.length;k++) {
			 				if(temp[j]>temp[k]) {
			 					changeTemp=temp[j];
			 					temp[j]=temp[k];
			 					temp[k]=changeTemp;
			 				}
			 			}
			 		}
		 		}
		 		
		 		answer[answerCount]=temp[commands[i][2]-1]; // 원하는 값 answer에 담기
		 		count=0; // 초기화
		 		temp=null; // 초기화
		 		answerCount++; // answer index로 변경
		 	}
		 	
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		System.out.println(new Solution1().solution()); 
	 }
}
