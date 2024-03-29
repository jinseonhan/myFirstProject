package programers.codingtest.greedy;
// 큰수 만들기
//어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하려 합니다.
//예를 들어, 숫자 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있습니다. 이 중 가장 큰 숫자는 94 입니다.
//문자열 형식으로 숫자 number와 제거할 수의 개수 k가 solution 함수의 매개변수로 주어집니다. 
//number에서 k 개의 수를 제거했을 때 만들 수 있는 수 중 가장 큰 숫자를 문자열 형태로 return 하도록 solution 함수를 완성하세요.
public class Solution3 {
	
	// 1. 앞에서부터 k자리까지 가장 큰수를 찾는다.
	// 2. 가장 크수가 몇번째 자리인지 확인한다.
	// 3. k개를 제거했는지 확인하고 아니면 남은 자릿수만큼 반복한다.
	
	public String solution(String number, int k) {
        String answer = "";
        char[] arr = number.toCharArray();
        // 처음 반복문으로 앞에 자릿수를 자른다.
        int idx=0;
        int big=0;
        int count=k;
        int temp=0;
        while(count!=0) {
        	
	        for(int i=0;i<count;i++) {
	        	if(big<Integer.parseInt(String.valueOf(arr[temp]))) {
	        		big=Integer.parseInt(String.valueOf(arr[temp]));
	        		idx=temp;
	        	}
	        	temp++;
	        }
	        
	        answer+=arr[idx];
	        count--;
	        
//	        if(count==0) { // 남은 값들을 모두 담을 조건문
//	        	for(int a=idx+1;a<arr.length;a++) {
//	        		answer+=arr[a];
//	        	}
//	        }
	        big=0;
        }
        
        
        
        
        
//        while(count!=0) {        	
//	        for(int i=temp+1;i<arr.length-k+temp;i++) {
//	        	// 남은 숫자중 다음 가장 큰수 찾기
//	        	if(temp<Integer.parseInt(String.valueOf(arr[i]))){
//	        		temp=i;
//	        	}
//	        }
//	        // 처음나오는 가장 큰수를 answer에 담는다.
//	        answer+=arr[temp];
//	        count--;
//        }
//        // 남은 숫자 담기
//        for(int i=temp;i<arr.length;i++) {
//        	answer+=arr[temp];
//        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(new Solution3().solution("1324", 2));
	}
}
