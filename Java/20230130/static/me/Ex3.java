package static_;

public class Ex3 {
	
	int b = check(2);
	
	static int a = check(1);
	
	public static int check(int i) {
		System.out.println("call : " + i);
		return i;
	}

	public static void main(String[] args) {
		System.out.println("main() 메서드");
		System.out.println("main() 메서드");
		Ex3 ex = new Ex3();
	}
	
	static int c = check(3);

}
