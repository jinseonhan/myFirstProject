package programers.codingtest.greedy;

public class Solution2 {
    public int solution(String name) {
        int answer = 0;
        boolean result =true; // result가 true일 경우는 정방향 result가 false일 경우 역방향
        StringBuilder newName = new StringBuilder();
        for(int j=0;j<name.length();j++) {
        	newName.append('A');
        }
        
        if(name.equals(newName.toString())) {
        	return answer;
        }//////////
        //////////
        // 앞으로 갈지 뒤로 갈지 결정할 반복문/////        
        for(int i=0;i<name.length();i++) {
        	// 둘다 'A'일 경우
        	if(name.charAt(i+1)=='A'&&name.charAt(name.length()-i-1)=='A') {
        		i++;
        		continue;
        	}else if(name.charAt(i+1)!='A'&&name.charAt(name.length()-i-1)!='A') { // 둘다 다음 값이 i가 아닌경우는 정방향으로
        		result=true;
        		break;
        	}else if(name.charAt(i+1)=='A'&&name.charAt(name.length()-i-1)!='A') { //역방향
        		result=false;
        		break;
        	}else { // 정방향
        		result=true;
        		break;
        	}
        }
        
        // 처음 시작
        if(name.charAt(0)<='M') {
			answer+= name.charAt(0)-'A';
			newName.setCharAt(0, name.charAt(0));
		}else{
			answer+= 'Z'-name.charAt(0)+1;
			newName.setCharAt(0, name.charAt(0));
		}
		if(name.equals(newName.toString())) {
			return answer;
		}

        answer++;
    	
        if(result) { // 정방향으로 돌때
        	System.out.println("정방향");
    		for(int j=1;j<name.length();j++) {
    			if(name.charAt(j)<='M') {
        			answer+= name.charAt(j)-'A';
        			newName.setCharAt(j, name.charAt(j));
        		}else{
        			answer+= 'Z'-name.charAt(j)+1;
        			newName.setCharAt(j, name.charAt(j));
        		}
    			
    			if(name.equals(newName.toString())) {
    				break;
    			}

    			answer++;
    		}
    			
    	}else { // 역방향으로 돌때
    		System.out.println("역방향");
    		for(int j=name.length()-1;j!=0;j--) {
    			if(name.charAt(j)<='M') {
        			answer+= name.charAt(j)-'A';
        			newName.setCharAt(j, name.charAt(j));
        		}else{
        			answer+= 'Z'-name.charAt(j)+1;
        			newName.setCharAt(j, name.charAt(j));
        		}
    			
    			if(name.equals(newName.toString())) {
    				break;
    			}
    			answer++;
    		}
    		
    	}
        	
        return answer;
    }

    public static void main(String[] args) {
    	System.out.println(new Solution2().solution("JEROEN"));
//    	System.out.println(new Solution2().solution("JAN"));
    }
}
