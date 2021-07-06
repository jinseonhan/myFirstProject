package my.study.coding;

public class exam7 {
	
    public String solution(String p) {
        String answer = "";
        int count=0; // 정상으로 입력되었을 때는 숫자가 증가되지 않음
       
    	for(int i=0;i<p.length();i++) {    		
			
			if(p.charAt(i)=='(') {	
				answer+=')';
				count++;
			}else {
				answer+='(';
				count--;
			}
			
			
    	}
    
        return answer;
    }
    
    public static void main(String[] args) {
    	System.out.println(new exam7().solution("((())())"));
    }
	
}
