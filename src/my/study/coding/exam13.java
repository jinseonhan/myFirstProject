package my.study.coding;

import java.util.ArrayList;
import java.util.Collections;

//문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를
//"(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
//예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.


//s        	         return
//"1 2 3 4"      	"1 4"
//"-1 -2 -3 -4" 	"-4 -1"
//"-1 -1"	        "-1 -1"
public class exam13 {
    public String solution(String s) {
        String answer = "";
        String temp = "";
        String tempNum = "";
        ArrayList<Integer> arr = new ArrayList<>();
        s+=" ";
        for(int i =0;i<s.length();i++) {
        	// 1.임시 문자열에 str 값으로 담는다.
        	// 2." " 공백이 있는 경우 더이상 str에 담는것을 중단하고 arr에 숫자형으로 변환하여 담는다.
        	if(s.charAt(i)!=' ') {
        		temp += s.charAt(i);
        	}else {
        		arr.add(Integer.parseInt(temp));
        		temp = "";
        	}
        	
        }

        // arr를 collections.sort로 정렬한다.
        Collections.sort(arr);
        // 처음것을 작은값에 담고, 마지막값을 큰값에 담고 반환한다.
        
        answer = arr.get(0)+" "+arr.get(arr.size()-1);
        
        return answer;
    }
    
    
    public static void main(String[] args) {
    	 System.out.println("1번 결과 : "+new exam13().solution("1 2 3 4" ));
    	 System.out.println("2번 결과 : "+new exam13().solution("-1 -2 -3 -4" ));
    	 System.out.println("3번 결과 : "+new exam13().solution("-1 -1" ));
    }
}
