package static_;

class Person {
	String name;
	int age;
}

public class Ex2_ {

	public static void main(String[] args) {
		new Person();
		StaticMethod sm =  new StaticMethod();
		sm.normalMethod();
//		sm.staticMethod(); // 오류는 아니지만 워닝 뜲
		StaticMember.staticMethod();
	}

}


class StaticMethod{
	int normalVar = 10; // 인스턴스 멤버변수(인스턴스 생성 시 로딩)
	static int staticVar = 20; // 클래스 멤버변수(클래스 로딩 시 로딩)
	
	public void normalMethod() {
		System.out.println("일반 메서드!");
		System.out.println("일반 메서드에서 인스턴스 변수 접근 : " + normalVar);
		System.out.println("일반 메서드에서 static 변수 접근 : " + staticVar);
	}
	
	public static void staticMethod() {
//		System.out.println("static 메서드!");
//		System.out.println("static 메서드에서 인스턴스 변수 접근 : " + normalVar);
		System.out.println("static 메서드에서 static 변수 접근 : " + staticVar);
	}
	
	public void setNormalVar(int normalVar) {
		this.normalVar = normalVar;
	}
	
	public static void setStaticVar(int staticVar) {
//		this.StaticVar = staticVar;
		StaticMethod.staticVar = staticVar; // this 사용 불가 
	}
}