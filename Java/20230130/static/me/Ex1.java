package static_;

class StaticMember {
	static int a = 10;
	int b = 20;
	
	public void normalMethod() {
		System.out.println("일반 메서드!");
	}
	
	public static void staticMethod() {
		System.out.println("static 메서드!");
	}
}

public class Ex1 {

	public static void main(String[] args) {		
		StaticMember sm =  new StaticMember();
		sm.normalMethod();
		
//		System.out.println(s1.a); // 참조변수 선언 전 접근 불가능. 오류 
		System.out.println(StaticMember.a); // 클래스 명으로 접근 가능. 인스턴스 생성과 상관없다. 
		StaticMember s1 =  new StaticMember();
		StaticMember s2 =  new StaticMember();
		System.out.println("s1.a = " + s1.a + ", s2.a = " + s2.a);
		System.out.println("s1.b = " + s1.b + ", s2.b = " + s2.b);
		
//		s1.a = 99;
		StaticMember.a = 99; //  권장사항
		System.out.println("s1.a = " + s1.a + ", s2.a = " + s2.a);
		
		s2.b = 999;
		System.out.println("s1.b = " + s1.b + ", s2.b = " + s2.b);
		
		System.out.println("----------------------------------------------");
		
		s1.normalMethod();
		s2.normalMethod();
		StaticMember.staticMethod();
		
		
	}

}




































