package my.study.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class algorithm {
	Scanner sc = new Scanner(System.in);
	//  1. 체 알고리즘 : 소수를 효율적으로 구하는 알고리즘
	// 				n이라는 숫자까지의 소수는 n보다 큰 수 중 
	//              가까운 i*i의 값의 i까지만 소수를 지우고 2부터 i까지의 배수들을 모두 지우는 방식 	
	public void practice1() {
		// ArrayList로 구현
		ArrayList<Boolean> primeList;

		// 사용자로부터의 콘솔 입력
		int n = sc.nextInt();

		// n <= 1 일 때 종료
		if(n <= 1) return;

		// n+1만큼 할당
		primeList = new ArrayList<Boolean>(n+1);
		// 0번째와 1번째를 소수 아님으로 처리
		primeList.add(false); // 0번째
		primeList.add(false); // 1번째
		// 2~ n 까지 소수로 설정
		for(int i=2; i<=n; i++ )
			primeList.add(i, true); // arraylist의 i번째에 true를 넣는다.

		// 2 부터  ~ i*i <= n
		// 각각의 배수들을 지워간다.
		for(int i=2; (i*i)<=n; i++){
			if(primeList.get(i)){ // 이미 배수이기 떄문에 false로 된 경우 들어오지 않는다. ex) 2의 배수인 4는 2의 배수들에 포함
				for(int j = i*i; j<=n; j+=i) primeList.set(j, false);
				//i*i 미만은 이미 처리되었으므로 j의 시작값은 i*i로 최적화할 수 있다.
			}
		}
		StringBuffer sb = new StringBuffer();
		sb.append("{");
		for(int i=0; i<=n; i++){
			if(primeList.get(i) == true){
				sb.append(i);
				sb.append(",");
			}
		}
		sb.setCharAt(sb.length()-1, '}');

		System.out.println(sb.toString());

	}
	
	
	// 완전 탐색
	// 주어진 자연수를 연속된 자연수의 합으로 나타내는 방법의 수 구하기
	public int practice2(int n) {
		int answer=0;
		int sum; // 합계를 담을 변수
		
		for(int i=1;i<=n;i++) {
			sum=0; // sum 초기화
			for(int j=i;j<=n;j++) {	// 초기값이 1부터 시작하며 점차 증가한다.
				sum+=j;	// j부터 시작한 값을 담는다.
				if(sum==n) {	// j부터 시작한 값이 n과 같아지면 answer에 하나를 증가시킨다.
					answer++;
					break;
				}else if(sum>n) {	// j부터 증가해도 안되는 경우는 그냥 반복문을 빠져나간다.
					break;
				}
			}
		}
		
		return answer;
	}
}
