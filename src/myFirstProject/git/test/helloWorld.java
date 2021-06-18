package myFirstProject.git.test;

public class helloWorld {

	public static void main(String[] args) {
		
		String a=  "abc";
		 
		helloWorld h = new helloWorld();
		
		System.out.println("1.h.chagne(a) = "+h.change(a));

		System.out.println("2.a = "+a);
	}
	
	public String change(String a){
		a="def";
		
		return a;
		
	}
	
	
}
