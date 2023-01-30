package operator;

public class Ex1 {

	public static void main(String[] args) {
		int a = 10, b = 0;
		
//		b = b +a;   아래와 같은 코드 
		b +=a;
		System.out.println(b);
		
		System.out.println("==========================");
		b +=a;
		System.out.println(b);
		
		b -= a;
		System.out.println(b);
		
		b *= 10;
		System.out.println(b);
		
		b /= a;
		System.out.println(b);
		
		b %= a;
		System.out.println(b);
		
		// 복합 대입연산자는 연산시 자동형변환이 일어나지 않는다 
		short s = 10;
//		s = s + 10; // 자동 형변환이 일어나서 오류가 발생한다 
		s = (short)(s + 10);
		s +=10; // 복합 대입연산자는 자동 형변환이 일어나지 않아서 유용하게 쓰인다
		
		char ch = 'B';
//		ch = (char)(ch + 32);
		ch += 32;
		System.out.println(ch);
		
	}

}
