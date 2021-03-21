package programers.codingtest.exhaustivesearch;

import java.util.ArrayList;

//한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.
//각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.
// 1,0 제외
//numbers는 길이 1 이상 7 이하인 문자열입니다.
//numbers는 0~9까지 숫자만으로 이루어져 있습니다.
//"013"은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.

public class Solution2 {
	/*
	 * public int solution(String numbers) { // 떨어진 숫자가 몇개인지 확인 // 그 숫자들을 조합하여 소수를
	 * 만드는 방법 // 1,0을 제외한다. // 소수의 갯수를 반환한다. int answer=0; // 반환할 값 int hight=0; //
	 * 조합한 값 중 가장 큰값을 저장할 변수(몇 번 반복할 것인지 정하기 위해) ArrayList<Integer> list = new
	 * ArrayList<>(); // 조합한 값들을 넣을 list
	 * 
	 * // 1.조합할수 있는 값들을 arrayList에 담으면서 동시에 가장 큰 값을 저장한다.
	 * 
	 * 
	 * // 소수를 구하는 반복문에 if문+for문을 넣어 같은 숫자가 있는지 비교하고 // 같은 값이 있으면 answer를 1증가시키고 배열에서
	 * 그 것을 뺀다.(반복횟수 감소를 위해) return answer; }
	 *////////////////
	int count = 0; // 세야지//
	
	public int solution(String nums) { 
		int nums2[] = new int[nums.length()];
		for(int i=0;i<nums.length();i++) {
			nums2[i]=nums.charAt(i);
		}
		explore(nums2, new boolean[nums2.length], 0, nums2.length, 3); 
		return count; 
	} 
	void explore(int[] arr, boolean[] visited, int start, int n, int r) { 
		if(r == 0) { 
			int sum = 0; for(int i=0; i<n; i++) { 
				if(visited[i] == true) sum += arr[i]; 
			} 
			if(IsPrimeNumber(sum)) {
				count++; } return; 
			} else { 
				for(int i=start; i<n; i++) {
					visited[i] = true; 
					explore(arr, visited, i + 1, n, r - 1); 
					visited[i] = false; 
					} 
				} 
		} 
	boolean IsPrimeNumber(int n) { 
		int i = 0; 
		int last = n / 2; 
		if (n <= 1) { 
			return true; 
		} 
		for (i = 2; i <= last; i++) { 
			if ((n%i) == 0) { 
				return false; 
			} 
		} 
		return true; 
	}
	

   public static void main(String[] args) {
	   String numbers = "20";
	   System.out.println(new Solution2().solution(numbers));
   }
	   
}
