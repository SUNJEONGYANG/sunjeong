package operator;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println(10 + 2);
		System.out.println(10 - 2);
		System.out.println(10 * 2);
		System.out.println(10 / 3);
		System.out.println(10 % 3);
		
		
		System.out.println("============================");
		
		byte b1 = 10, b2 = 20, b3;
		
//		b3 = b1 + b2; // 연산을 하면 결과는 int가 된다. 연산 결과의 기준은 int라는 말 
		b3 = (byte)(b1 + b2);
		System.out.println(b3);
	}

}
