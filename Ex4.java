
public class Ex4 {

	public static void main(String[] args) {
//		int a;
//		int b;
//		a = 1;
//		System.out.println(a+1);
////		System.out.println(b);
//		a = 2;
//		System.out.println(a+1);
		
		//선언과 초기화를 동시에
//		int a = 10;
//		int b = 20;
		
		//동시에 여러개 변수를 선언
//		int a, b;
//		a = 10;
//		b = 20;
		
		//동시에 여러개 변수를 선언과 동시에 초기화
		int a = 10, b = 20;
		
		//Q. a:20, b:10 출력
//		System.out.println("a: " + b);
//		System.out.println("b: " + a);
//		int tmp;
//		tmp = 20;
//		tmp = a;
//		a = b;
//		b = tmp;//a의 값이 tmp에 저장되어 있으니까 
		
//		int c;
//		c = a;
		int c = a;
		a = b;
		b = c;
		
		System.out.println("-------------------------------------------------");
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
//		System.out.println(a+b);
		
//		String name;
//		name = "양선정";
//		// String name = "양선정"; --> 이런건 안 되나? 나중에 블로그에 적어보기
//		System.out.println(name);
	}

}
