package my.study.coding;

public class exam9 {
	public int solution(int n, int a, int b){
        int answer = 0; // 라운드는 1라운드 부터 시작
        boolean equals = true;
        
        if(a!=b) {
	        while(equals) {
	        	a=(int)Math.ceil(((double)a/2));
	        	b=(int)Math.ceil(((double)b/2));
	        	answer++;
	        	if(a==b) {
	        		equals=false;
	        	}
	        	System.out.println("a : "+a+", b : "+b);
	        }
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(new exam9().solution(16, 4, 11));
	}
}
