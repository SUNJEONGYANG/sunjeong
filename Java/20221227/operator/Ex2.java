package operator;

public class Ex2 {

	public static void main(String[] args) {
		int a = 10, b = 5;
		System.out.println("a > b 인가? " + (a > b)); // true or false가 리턴
		System.out.println("a > b 인가? " + (a < b));
		System.out.println("a > b 인가? " + (a >= b));
		System.out.println("a > b 인가? " + (a <= b));
		System.out.println("a > b 인가? " + (a == b));
		System.out.println("a > b 인가? " + (a != b));
		
		System.out.println("===================================");
		
		System.out.println('A' > 'B');
//		System.out.println("A" > 'B'); // 문자열은 비교 불가
		System.out.println('A' == 65);
		
		System.out.println("===================================");
		
		System.out.println(3 == 3.0);
		System.out.println(0.1 == 0.1f); // 근사치 포현에 의해 서로 다른 값으로 취급된다 
		System.out.println((float)0.1 == 0.1f);
		
		System.out.println("==================================");
		
		String str1 = "abc";
		String str2 = "ab";
		String str3 = "c";
		String str4 = str2 + "c"; // 변수 + 리터럴
		String str5 = str2 + str3; // 변수 + 변수
		String str6 = "ab" + "c"; // 리터럴 + 리터럴
		
		System.out.println(str1);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		
		System.out.println("< 동등비교 연산자로 비교 >");
		System.out.println(str1 == str4); 
		System.out.println(str1 == str5);
		System.out.println(str1 == str6);
		// Heap이 가리키는 주소가 같을 경우에만 연산자로 비교가 가능하다. 주소를 비교한 것이다. 
		
		 System.out.println("< equals() 메서드로 비교 >");
		 System.out.println(str1.equals(str4));
		 System.out.println(str1.equals(str5));
		 System.out.println(str1.equals(str6));
		 // 여기선 주소가 아니라 데이터를 비교한 것 
		 
		 // 결론, 리터럴 사용시 "기본 데이터 타입 처럼" 사용 가능 
		
	}

}
