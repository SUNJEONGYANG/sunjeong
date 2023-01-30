package operator;

public class Test4 {

	public static void main(String[] args) {
		/*
		 * 문자 ch에 대해 "대문자"와 "소문자" 판별, 
		 * 그 나머지는 "기타문자"*/
		
		// A유니코드 41 a유니코드 61
		char ch = 'a';
//		char c1 = (ch >= 41) ? 'A' : 'a'; // 1번
//		char ch2 = 'a';
		
//		char c1 = ch >= 61 ? ch : ch2; // 2번
		
//		'a' <= ch && ch <= 'z'
		
//		String c1 = 'a' <= ch && ch <= 'z' ? "대문자" : "소문자"; // 3번
//		String c1 = 'A' <= ch && ch <= 'Z' ? "소문자" : "대문자"; // 3번
		
//		String c1 = 'A' <= ch && ch <= 'Z' ? "대문자" : "소문자";
		
//		String s = 'A' <= ch && ch <= 'Z' ? "대문자" : 
//			       'a' <= ch && ch <= 'z' ? "소문자" : "기타문자";
		
		String s = 'A' <= ch && ch <= 'Z' ? "대문자" : 
		           (ch >= 'a' && ch <= 'z') ? "소문자" : "기타문자"; // 이렇게 적어주는 게 좋다 ch >=
		
		
		System.out.println(s);
		
		System.out.println("=================================================");
		/* <삼항연산자 활용>
		 * 뷔폐 요금 계산
		 * 1. 뷔폐의 기본요금(price)은 30000원 이다. 
		 * 2. 손님의 나이(age)에 따라 할인 조건이 적용된다 . 
		 * 3. 뷔폐 할인 조건 : 나이(age)가 5세 이하일 경우 70% 할인
		 *                  나이(age)가 65세 이상일 경우 50% 하일
		 * 4. 최종적으로 뷔폐요금 출력 */
		
		int price = 30000;
		int age = 55;
		//1번
//		int result = age <= 5 ? (int)(price*0.3) : 
//			         age >= 65 ? (int)(price*0.5) : price;
		//2번
//		int result = age > 5 && age < 65 ? price : 
//			         age <= 5 ?            (int)(price*0.3) : (int)(price*0.5);
		
		//3번 (int)(price*0.3)을 줄일 수 없나?
		// (int)(price*0.5) --> price/2 
		
//		int result = age > 5 && age < 65 ? price : 
//			         age <= 5 ? price*(3/10) : (5/10); 
		
		//강사님 풀이 
//		int result = (int)(price*0.3);
//		int result = (int)(price*0.5);
//		int result = price;
		
//		price = (int)(price*0.3);
//		price = (int)(price*0.5); // 아래처럼 복합연산자를 사용해서 줄일 수 있다 
		
//		price *= 0.3;
//		price *= 0.5;
		
//		price *= age <= 5 ? 0.3 :
//			     age >= 65 ? 0.5 : 1; // 이렇게 줄일 수 있다...
			     
		price *= age > 5 && age < 65 ? 1 :
			     age <= 5 ? 0.3 : 0.5;
		
		System.out.println(price);
		
	
		
	}

}
