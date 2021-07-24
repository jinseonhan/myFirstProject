package my.study.coding;


// 프로그래머스 N개의 최소 공배수 구하기
public class exam11 {
	 public int solution(int[] arr) {
		 // Arrays.sort()를 이용하여 배열을 정렬하고 시작해도 됨(그러면 최소 공배수를 구할떄 a,b의 위치를 안바꾸어도됨)
	     int answer=arr[0];   
		
	     for(int i=1;i<arr.length;i++) {
	    	 answer = LCM( answer, arr[i]);
	     }
        
        return answer; // 배열 안의 모든 수의 최소 공배수
	 }
	 
	 // 최소 공배수를 구하는 메소드
	 public int LCM(int a, int b) {
		 
		 return a*b/GCD(a,b); // 최소 공배수
	 }
	 
	 // a,b 의 최소 공배수를 구하기 위한 최대 공약수
	 public int GCD(int a, int b) {
		 // a가 큰 수, b가 작은수로 만들기
		 if(a<b) {
			 int temp = b;
			 b=a;
			 a=temp;
		 }
		 
		 while(b!=0) {
			 int r= a%b;
			 a=b;
			 b=r;
		 }
		 return a; // 최대 공약수
		 
	 }
	 
	 public static void main(String[] args) {
		 int[] arr = {8,6,2,14,11};
		 System.out.println(new exam11().solution(arr));
	 }
}
