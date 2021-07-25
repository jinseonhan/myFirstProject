package my.study.coding;
// 프로그래머스 2단계 - 방문길이  

// 점을 기준으로 하면 안됨, 선을 기준으로 해야함,3차원 배열을 만들어 받는 얘 기준으로 들어온 기록이 있다면 answer를 +1하지 않고 받기만 한다.
public class exam12 {
	// 좌표의 범위를 넘어갔는지 확인할 메소드, 축과 상관없이 받은 값에 +1과, -1만 계산
	public int postion(int point, int cal) {
		
		if(point+cal<11&&point+cal>-1) {
			point = point+cal;
		}
		
		return point;
	}
	
	// 처음가는 길인지 확인할 메소드
	
	
	public int solution(String dirs) {
        int answer = 0; // 중복되지 않는 거리
        int x = 5; // x축의 default 값
        int y = 5; // y축의 default 값
        int target = 0; // 변경할 값인지 확인
        boolean[][][] check= new boolean[10][10][4]; // default = 0;
        
        // 1. 좌표를 이동한다.
        // 2. 좌표를 이동하였을 때, 범위 밖을 넘어갔는지 안넘어갔는지 확인하고 다음 좌표값을 입력한다.
        // 3. answer가 +1이 안되는 경우,
        // 3-1. 이미 지나간 곳
        // 3-2. 좌표 밖을 나가서 제자리일 경우
        for(int i=0; i<dirs.length();i++) {
        	// 현재 위치 기억
        	
        	switch(dirs.charAt(i)) {
        	case 'L' : x=new exam12().postion(x, -1); target=0;break; // X-1, 들어온 곳 기준 오른쪽 선분 생성할지 안할지 결정해야함
        	case 'R' : x=new exam12().postion(x, +1); target=1;break; // X+1, 들어온 곳 기준 왼쪽 선분 생성
        	case 'D' : y=new exam12().postion(y, -1); target=2;break; // Y-1, 들어온 곳 기준 위쪽 선분 생성
        	case 'U' : y=new exam12().postion(y, +1); target=3;break; // Y+1, 들어온 곳 기준 아래쪽 선분 생성
        	}
        	
        	if(!check[x][y][target]) { // check[x][y][target]가 false일때 들어옴
        		check[x][y][target] = true;
        		answer++;
        	}
        }
       
        
        
        return answer;
    }
	
	public static void main(String[] args) {
//		System.out.println(new exam12().solution("ULURRDLLU")); // 예제1번
		System.out.println(new exam12().solution("LULLLLLLU")); // 예제1번
		
	}
}
