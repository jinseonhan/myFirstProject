package my.study.coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// 프로그래머스 선행스킬
public class exam6 {
	 public int solution(String skill, String[] skill_trees) {
        int answer = 0; // 가능한 스킬트리 갯수
        int count = 1; // 1부터 2..3.. 계속 더해가며 검증할 수
        
        ArrayList<Character> tree = new ArrayList<Character>();
        char temp[]= null;
        temp = skill.toCharArray();
        
        for(int i=0;i<temp.length;i++) {
        	tree.add(temp[i]);
        	count++;
        }
        
        
        for(int i=0;i<skill_trees.length;i++) {
        	count=0; // 초기화
        	 temp=skill_trees[i].toCharArray();
        	
        	for(int j=0;j<temp.length;j++) {
        		if(tree.get(count)==temp[j]) {
        			count++;        			
        		}//??
        	}
        	
        	// 검증로직
        	if(count>1) {
        		
        	}
        }
        
        
        //1. skill 로 들어온 순서대로 나와야한다.
        //2. skill 사이에는 아무거나 나와도 된다.
        //3. 단, 모두 나올 필요는 없지만, 하위 스킬부터 올라가야만한다.(가장 앞 문자는 무조건 있어야함)
        return answer;
	 }
	 
	 public static void main(String[] args) {
		 String[] str = {"BACDE","CBADF","AECB","BDA"};
		 System.out.println(new exam6().solution("CBD", str));
	 }
}
