package programers.codingtest.hash;

class Solution2 {
	public static void main(String[] args){
		
		new Solution();

	}  
	
	public boolean solution() {
		String[] phone_book = {"119", "97674223", "1195524421"}; 
		boolean answer = true;
		// 문자열.startsWith(비교 문자열) : prefix값으로 시작하는지 확인하고 false/true로 반환
		for(int i=0; i<phone_book.length;i++) {
			for(int j=i+1; j<phone_book.length;j++) {
				if(phone_book[i].startsWith(phone_book[j]))
					return false;
				if(phone_book[j].startsWith(phone_book[i]))
					return false;
			}
		}

		return answer;
	}


}