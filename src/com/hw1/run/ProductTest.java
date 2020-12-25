package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {
	public static void main(String[] args) {
		// 매개변수 생성자를 이용하여 3개의 객체 생성 후 출력 setter메소드를 이용하여 값 수정 후 출력
		// get메소드를 이용하여 부가세 포함 가격 출력
		
		Product p1= new Product("ssgnote20", "갤럭시노트20", "경기도 수원", 130000, 0.1);
		Product p2= new Product("lgnote5", "LG스마트폰", "경기도 평택", 950000, 0.07);
		Product p3= new Product("apple", "iPhone12Pro", "california", 1200000, 0.03);
		
		// 각 객체의 가격을 모두 120으로 변경
		p1.setPrice(1200000);
		p2.setPrice(1200000);
		
		// 객체가 가진 필드 값 출력 확인
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		
		// 각 객체의 가격에 부가세율을 적용한 실제 가격을 계산해서 출력
		// 실제가격 = 가격+(가격*부가세율)
		System.out.println("p1의 부가세를 포함한 가격 : "+(int)(p1.getPrice()+(p1.getPrice()*p1.getTax())));
		System.out.println("p2의 부가세를 포함한 가격 : "+(int)(p2.getPrice()+(p2.getPrice()*p2.getTax())));
		System.out.println("p3의 부가세를 포함한 가격 : "+(int)(p3.getPrice()+(p3.getPrice()*p3.getTax())));
		
	}
}
