package programers.codingtest.stackQ;
//int[] progresses : 진도값
//int[] speeds : 속도
//1. 연속된 수가 100이 나가는 조건
//2. 그 갯수 만큼 한번에 나가는 것을 카운트한 것을 값으로 저장
//3. 한번에 나가는 날짜의 갯수를 배열 인덱스로 저장
// 어렵다잉
import java.util.LinkedList;
import java.util.Queue;

/*기능개발
문제 설명
프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.

또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.

먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.

제한 사항
작업의 개수(progresses, speeds배열의 길이)는 100개 이하입니다.
작업 진도는 100 미만의 자연수입니다.
작업 속도는 100 이하의 자연수입니다.
배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정합니다. 예를 들어 진도율이 95%인 작업의 개발 속도가 하루에 4%라면 배포는 2일 뒤에 이루어집니다.
*/


public class Solution2 {
	public static void main(String[] args) {
		// 실행문
		new Solution2().solution();
	}
	
	public void solution() {
		Queue<Integer> q = new LinkedList<>(); // 반환할 변수에 담을 큐
		
		int[] progresses = {95,90,99,99,80,90}; // 주어진 변수
		int[] speeds = {1,1,1,1,1,1}; // 각 인덱스별 증가 값
		int[] answer= {};		// 반환할 변수
		
		int count=0; // 앞에서부터 100이상이 담긴 인덱스를 제거할 변수
		int out=0; // answer의 각 인덱스에 담을 변수

		// 마지막 인덱스가 100이 될때까지 반복될 반복문
		while(count<progresses.length) {
			// progresses[]에 speed[]를 더할 반복문
			for(int j=0;j<progresses.length;j++) {
				progresses[j]+=speeds[j];
			}
			
			// 남아 있는 인덱스 중 가장 앞에서부터 100이 연속되었는지 확인 시켜주고 그 숫자만큼 out변수에 담아줄 반복문
			for(int i=count;i<progresses.length;i++){
				if(progresses[i]>=100) {
					// [0] 값만 거르기
					out++;
				}else {
					// count와 out더한다.
					break;
				}
			}
			
			// 반복문으로 같은 회차에 연속된 100이상의 숫자의 갯수만큼 큐에 담고 구분 인덱스용 변수(count)를 증가시킬 조건문
			if(out!=0) {	
				q.offer(out); // 한번에 빠져나간 갯수를 q 에 담는다.
				count+=out; // 이미 빠진것을 제외시킴
				out=0; // out를 초기화
			}
		}
		// 반복문 종료 후 큐의 크기 = 반환할 배열변수와 같음
		answer = new int[q.size()]; // q의 사이즈가 지정이 되었기 때문에 출력용 answer의 크기를 지정할 수 있다.
		
		// 반복문을 통해 큐의 값들을 answer로 옮긴다.
		for(int z=0;z<answer.length;z++) {
			answer[z]=q.peek();
			q.poll();
		}
	}
}
