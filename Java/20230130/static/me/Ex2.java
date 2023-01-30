package static_;

public class Ex2 {

	public static void main(String[] args) {
		StaticMethod2.staticMethod2();
	}

}

class StaticMethod2{
	static int staticVar2 = 20;
	public static void staticMethod2() {
		System.out.println(staticVar2);
	}
}
