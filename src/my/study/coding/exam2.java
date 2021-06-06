package my.study.coding;
// DFS 공부하기
// 1.깊이 우선 탐색이란?
// 루트 노드(혹은 다른 임의의 노드)에서 시작해서 다음 분기(branch)로 넘어가기 전에 해당분기를 완벽하게 탐색하는 방법
// 모든 노드를 방문하고자 하는경우에 사용한다.
// 2.특징
// 자기 자신을 호출하는 순환 알고리즘의 형태를 가지고있다.
// 전위순회를 포함한 다른 형태의 트리 순회는 모두 DFS의 한 종류이다.
// 이 알고리즘을 구현할 때 가장 큰 차이점은, 그래프 탐색의 경우 어떤 노드를 방문했었는지 여부를 반드시 검사해야함
// (무한루프 방지)
// 3. 구현방법
// - 순환 호출

// - 명시적인 스택사용(명시적인 스택을 사용하여 방문한 정점들을 스택에 저장하였다가 다시 꺼내어 작업)
class exam2 {
    // 변수 접근을 위한 전역 변수들.
    static int numberOfArea; // 지역의 갯수
    static int maxSizeOfOneArea; // 가장 큰 지역의 갯수
    // 한 영역의 수를 저장하는 변수.
    static int temp_cnt = 0;
    // 좌표에서의 상,하,좌,우 탐색을 위한 배열.
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    
    // DFS 메소드
    public static void dfs(int x,int y, int[][] picture, boolean[][] check){
        // 6. 방문한 적 있는 좌표라면 DFS 종료.
        if(check[x][y]) return; // boolean의 기본 값은 false
        
        // 7. 처음 방문 시 방문처리.
        check[x][y] = true;
        // 8. 영역의 수 증가.
        temp_cnt++;
        
        // 9. 한 좌표에서 상,하,좌,우 탐색.
        for(int i =0;i<4;i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            // 10. picture 배열의 범위를 벗어나면 continue.
            if(nx<0 || nx>=picture.length || ny<0 || ny>=picture[0].length) continue;
            
            // 11. 현 좌표의 색 == 상,하,좌,우 좌표의 색 && 방문한적 없는 상,하,좌,우 좌표라면.
            if(picture[x][y] == picture[nx][ny] && !check[nx][ny]){                
                // 12. DFS를 위한 재귀호출.
                dfs(nx,ny,picture,check);
            }            
        }        
    }
    
    public int[] solution(int m, int n, int[][] picture) {
        // 1. 초기화 꼭! 하기.
        numberOfArea =0;
        maxSizeOfOneArea=0;
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        
        // 2. DFS시 방문여부를 체크 할 배열.
        boolean[][] check = new boolean[m][n];
        
        // 3. 주어진 picture 배열을 탐색.
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                // 4. 원소가 0이 아니고, 방문한 적이 없다면.
                if(picture[i][j] != 0 && !check[i][j]){
                    // 5. 영역의 수가 1개 증가하며 DFS 탐색 수행.
                    numberOfArea++;
                    dfs(i,j,picture,check);
                }
                // 13. 한 영역의 탐색이 모두 끝났다면, 조건에 따라 최대 영역의 수를 변경.
                if(temp_cnt > maxSizeOfOneArea) maxSizeOfOneArea = temp_cnt;
                // 14. 한 영역의 수는 다시 초기화.
                temp_cnt = 0;
            }
        }
        
        // 15. 각 값을 answer 배열에 담아주고 끝.
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    
    public static void main(String[] args) {
    	System.out.println(new exam2().solution(6, 4, new int[][]{{1,1,1,0},{1,1,1,0},{0,0,0,1},{0,0,0,1},{0,0,0,1},{0,0,0,1}})[0]);;
    	System.out.println(new exam2().solution(6, 4, new int[][]{{1,1,1,0},{1,1,1,0},{0,0,0,1},{0,0,0,1},{0,0,0,1},{0,0,0,1}})[1]);;
    }
}
