package my.study.coding;


// 문자 2개가 연속될 경우 문자를 제거하고, 모든 문자를 제거할 수 있는지 확인하는 문제 

public class exam1 {	
    public int solution(String s){     
        boolean tf = true; // 반복문을 위한 boolean값
        String str = s; // 메소드를 이용하여 값을 변경할 변수
        do {
        	int count=0; // 하나라도 연속된 값일 경우 세는 변수
        	
        	// 문자열의 길이가 0이나 1일 경우는 더 이상 반복할 필요가 없다.
        	if(str.length()==0) { 
        		return 1;
        	}else if(str.length()==1) {
        		return 0;
        	}
        	
        	for(int i=str.length()-1;i>=0;i--) { // 뒤에서부터 연속된 값이 있는지 체크한다.
        		if(str.charAt(i)==str.charAt(i-1)) {
        			count++; 
        			tf=true; 
        			str =stringChange(str, i, i-1); // str값을 변경할 메소드
        			break;
        		}else {
        			tf=false; // 연속된 값이 없을 경우 반복을 더이상 할 필요가 없다.
        		}
        	}
        	     	if(count==0&&str.length()>0) {
        		return 0;
        	}
        	//
        }while(tf); 
        
        return 0;
    }
    
    // 연속된 문자열을 제거하는 메소드
    public String stringChange(String s, int a, int b) {
    	String changeStr= "";
    	StringBuilder str = new StringBuilder();
    	
    	for(int i=0;i<s.length();i++) {
    		if(i!=a&&i!=b) {
    			str.append(s.charAt(i));
    		}
    	}
    	changeStr=str.toString();
    	System.out.println(changeStr);
    	return changeStr;
    }
    
    public static void main(String[] args) {
    	System.out.println(new exam1().solution("cacca")); // 확인할 문자열
    }
	
}
