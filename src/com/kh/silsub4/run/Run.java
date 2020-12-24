package com.kh.silsub4.run;

import com.kh.silsub4.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Student[] st = {new Student(1, 3, "홍길동", 130.1, 'M'),new Student(2, 2, "김철수", 154.1, 'M'),new Student(3, 6, "김아름", 140.1, 'F')};
		
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i].information());
		}
	}
}
