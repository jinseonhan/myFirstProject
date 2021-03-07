package programers.codingtest.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.kh.practice5.Array;

public class Solution {
//	H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다. 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다. H-Index는 다음과 같이 구합니다.
//	어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index입니다.
//	어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때, 이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.
//	ex.이 과학자가 발표한 논문의 수는 5편이고, 그중 3편의 논문은 3회 이상 인용되었습니다. 그리고 나머지 2편의 논문은 3회 이하 인용되었기 때문에 이 과학자의 H-Index는 3입니다.( n=5, h=3)
//	citations	       return
//	[3, 0, 6, 1, 5]	      3
	
	// 1. 오름차순 정렬 ASC
	// 2. 중간 값 구하기 n/2
	// 3. 
	
	
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
 
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;
 
            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }
 
        return answer;
    }
	
	public static void main(String[] args) {
		int[] citations = {3,0,6,1,5};
		System.out.println(new Solution().solution(citations));
	}
}
