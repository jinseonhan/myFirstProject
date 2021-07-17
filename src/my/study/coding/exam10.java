package my.study.coding;

public class exam10 {
	int solution(int[][] land) {
        int answer = 0; // 각 행을 더한 후 반환할 값
        int colNext=-1; // 이전의 col을 저장할 값
        int temp=0;
        int colTemp=-1;
        for(int i=land.length-1;i>=0;i--) {
        	for(int j=land[i].length-1;j>=0;j--) {
        		if(j!=colNext) {
        			if(temp<land[i][j]) {
        				temp=land[i][j];
        				colTemp=j;
        			}
        		}
        	}
        	answer+=temp;
        	temp=0;
        	colNext=colTemp;
        	colTemp=-1;
        }
        
        

        return answer;
    }
	public static void main(String[] args) {
		int[][] land = {{9, 5, 2, 3}, {9, 8, 6, 7}, {8, 9, 7, 1}, {100, 9, 8, 1},{101,9,8,1}};
//		int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		
		System.out.println(new exam10().solution(land));
	}
}
