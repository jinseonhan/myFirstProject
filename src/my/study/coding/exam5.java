package my.study.coding;
// 연구소 K칸 점프, *2 순간이동 최소값 구하기
// 점프시 에너지 1씩 소모(ans +1), 순간이동은 에너지소모하지 않음
public class exam5 {
	public int solution(int n) {
        int ans = 0;
        // 경우의 수
        // 1.n= x*2+1 
        // 2.n= x*2
        // 이 작업을 n이 0이 될때까지 반복한다.(0->1이 되려면 무조건 에너지를 1을 소모해야한다.)
        while(n>0) {
	        if(n%2==0) {
	        	n=n/2;
	        }else {
	        	ans++;
	        	n=(n-1)/2;
	        }
        }
        

        return ans;
    }
	
	
	public static void main(String[] args) {
		System.out.println(new exam5().solution(6));
	}
}
