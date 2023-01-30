package variable;

public class Ex1 {

	public static void main(String[] args) {
		byte b = 127;
		System.out.println(b);
		
//		b = 128;
		
		short s = 128;
		System.out.println(s);
		
//		s = 32768;
		
		int i = 32768;
		System.out.println(i);
		
//		i = 2147483648;
		
		long l = 2147483648L; 
		System.out.println(l);
		
		l = 100L;
//		i = 100L;
		
		float f = 3.14f;
		System.out.println(f);
		
		double d = 3.14;
		System.out.println(d);
		
		char c = 'A' + 1; // 문자 유니코드. 문자는 연산을 만나게 되면 정수로 취급 
		System.out.println(c);
		
		boolean bool = true;
		System.out.println(bool);
	}

}
