package my.study.coding;

// 1.0을 제거한다.
// 2.0을 제거한 1의 갯수의 수만큼을 다시 2진수로 만든다.
// 3. 이 작업을 1만 남을때까지 반복한다.
// 4. [작업을 반복한 횟수, 제거된 0의 갯수]

public class exam3 {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int repeat =0; // 작업을 반복한 횟수
        int remove= 0; // 제거된 0의 총 갯수
        
        char[] num = s.toCharArray();
        System.out.println(num.length);
        while(true) {
        	int number =0;
        	repeat++;
        	
        	for(int i=0;i<num.length;i++) {
        		if(num[i]=='1') { 
        			number++;
        		}else { // 제거된 0의 갯수
        			remove++;
        		}
        	}
        	
        	if(number==1) {
        		break;
        	}else {
        		// String형으로 변환
        		System.out.println("2진수 변환값은 ? "+Integer.toBinaryString(number));
        		num=Integer.toBinaryString(number).toCharArray();
        		System.out.println(num.length);
        	}
        }
        
        answer[0] = repeat;
        answer[1] = remove;
        
        return answer;
    }
    
    
    
    public static void main(String[] args) {
    	System.out.println(new exam3().solution("110010101001"));
    
    }
}
