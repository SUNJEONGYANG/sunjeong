package method;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("1. 매개변수x, 리턴값x 메서드");
		hello();
		System.out.println("------------------------------------------");
		System.out.println("2. 매개변수o. 리턴값x 메서드");
		hello2("안녕하세요", 5); // hello2에 전달해줌 
		System.out.println("------------------------------------------");
		System.out.println("3. 매개변수x, 리턴값o");
//		sum();
		int result = sum();
		System.out.println(result);
		System.out.println("------------------------------------------");
		System.out.println("4. 매개변수o, 리턴값o");
//		int total = 10;
//		sum2(total); //내꺼
		int result2 = sum2(100);
		System.out.println(result2);
	}
	
	public static void hello() { // 1. 
		for(int i=0; i<10; i++) {
			System.out.println("Hello, World!");
		}
	}
	
	public static void hello2(String str, int count) { // 2. 
		for(int i=0; i<count; i++) {
			System.out.println(str);
		}
//		System.out.println("안녕하세요");
//		hello = 10;
	}
	public static int sum() { // 3.
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
//		System.out.println(sum);
		return sum;
	}
	
	public static int sum2(int total) { // 4. 이거 나중에 수정하기 
		System.out.println(total + "을 전달받았다");
		int sum2 = 0;
		for(int i=0; i<total; i++) {
			sum2 += i;
		}
		return sum2;
	}

}
