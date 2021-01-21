package programers.codingtest.hash;

class Solution2 {
    
	public boolean solution() {
		String[] phone_book = {"119", "97674223", "1195524421"}; 
        boolean answer = true;
        int temp=0;
        // 가장 짧은 자릿수 구하기
        for(int i=0;i<phone_book.length;i++) {
        	if(phone_book[i].length()<phone_book[temp].length()) {
        		temp=i;
        	}
        }
        int temp2=0;
        for(int i=0;i<temp;i++) {
        	if(i!=temp) {
        		for(int j=0;j<phone_book[temp].length();j++) {
        			if(phone_book[temp].charAt(j)==phone_book[i].charAt(j)) {
        				temp2++;
        			}
        		}
        		if(temp2==temp) {
    				return answer=false;
    			}else {
    				temp2=0;
    			}
        	}
        }
        
        return answer;
    }
    
    
}