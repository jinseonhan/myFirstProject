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
			primeList.add(i, true);

		// 2 부터  ~ i*i <= n
		// 각각의 배수들을 지워간다.
		for(int i=2; (i*i)<=n; i++){
			if(primeList.get(i)){
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
}
