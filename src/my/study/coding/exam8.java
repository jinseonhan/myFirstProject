package my.study.coding;

public class exam8 {
	
	public int[] solution(String[][] str) {
		int[] answer = new int[str.length];
		 
			 boolean chk =true;
			 int count=0; // 붙어있는 사람이 있는지 확인
			 
			 for(int i=0;i<str.length;i++) {
				 for(int j=0;j<str[i].length;j++) {
					 // p일때와, O일때 체크
					 String part= str[i][j];
					 
					 for(int k=0;k<part.length();k++) {
						 char idx=part.charAt(k);
						 if(idx=='P') { // 파티션일 때 count가 2이상되면 안됨
							// 빈공간 확인
							try {
								if(str[i][j+1].charAt(k)=='O') {
										count++;
								}
								if(str[i][j-1].charAt(k)=='O') {
										count++;
								}
								if(str[i][j].charAt(k+1)=='O') {
										count++;
								}
								if(str[i][j].charAt(k-1)=='O') {
										count++;
								}
								
								if(count>1) {
									chk=false;
									count=0; //count값 초기화;
									break;
								}
								count=0; //count값 초기화
							} catch (Exception e) {
								// TODO: handle exception
							}
						 }else if(idx=='O') { // 사람일 때 count가 1이상 되면 안됨
							 try {
									if(str[i][j+1].charAt(k)=='O') {
											count++;
									}
									if(str[i][j-1].charAt(k)=='O') {
											count++;
									}
									if(str[i][j].charAt(k+1)=='O') {
											count++;
									}
									if(str[i][j].charAt(k-1)=='O') {
											count++;
									}
									
									if(count>0) {
										chk=false;
										count=0; //count값 초기화;
										break;
									}
									count=0; //count값 초기화
								} catch (Exception e) {
									// TODO: handle exception
								}	 
						 }
					 
					 // boolean 값이 false일 경우 false를 반환하고 원래 메소드에서도 false를 반환하여 끝낸다.
					 count=0; // count값 초기화;
				 }
				 
					 if(chk==false) {
						 break;
					 }
				 
				 }
				 
				 if(chk==false) {
					 answer[i]=0;
				 }else {
					 answer[i]=1;
				 }
				 
				 chk=true; //chk초기화
			 }
			
		 return answer;
	 }


	 
	 
	 
	public static void main(String[] args) {
		String[][] str = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
		int [] answer =new exam8().solution(str);
		for(int i=0;i<answer.length;i++) {
			System.out.print(answer[i]+" ");
		}
		//	결과값 : [1, 0, 1, 1, 1] 
	}
}
