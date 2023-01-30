package operator;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 삼항 연산자(조건 연산자)
		 * 
		 * <기본 문법>
		 * 조건식 ? 값1 : 값2
		 * */
		
		int num = 10;
		String result = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(result);
		
//		result = num % 2 == 0? "짝수" : 12;
		// : 기준으로 좌우 데이터 타입이 다르면 안 된다
		
//		 num % 2 == 0 System.out.println("짝수") : System.out.println("홀수");
		 // : 기준 좌우 실행문이 오면 안 된다 
		
		// Q. max에 30, min에 20 출력되게 
		System.out.println("================================");
		int a = 30;
		int b = 20;
		
//		int max = (a >= b) ? a : b;
//		int min = (a <= b) ? a : b;
		
		// 강사님 풀이. 하드 코딩을 피하자
		
		int max = (a > b) ? a : b;
		int min = (a < b) ? a : b;
		
		
		
		System.out.println(max);
		System.out.println(min);
		
		System.out.println("================================");
		
		
		// 반올림
		
		double d = 97.7;
		
		// 내꺼 
//		double round = Math.round(d);
//		double round = (Math.round(d) > d) ? 98 : 97;
		
		// 강사님 풀이
//		System.out.println((int)(d+1));
//		System.out.println((int)d);
//		System.out.println((int)(d * 10 % 10));
//		(int)(d * 10 % 10) > 5 ?
//		int round = (int)d; //  값 손실이 일어나더라도 강제로 형변환 
		
//		int round = (int)(d * 10 %10) > 5 ? (int)(d+1) : (int)d; // 좀 복잡해 보이니까 다시 해보자 
		
//		int round = d * 10 %10 > 5 ? (int)(d+1) : (int)d;
		
//		int round = 0;
//		round += d * 10 % 10 > 5 ? (d + 1) : d; // 이거도 다시 생각해보자. 아래에 다시 풀이 
		
		int round = (int)d; // 이미 98 or 97이 저장되어 있는 상태 
		round += d * 10 % 10 > 5 ? 1 : 0;
		// 둘 중에 하나가 실행되었을 것이다 
//		round += 1;
//		round += 0;
		
		// 강사님 코드에 있는 0.5 더한 방식은 좋은 방법은 아니다 
		
		System.out.println(round);
		System.out.println("====================================");
		
		int n = 3;
//		String r = n  == 0 ? "0" : n % 2 == 0 ? "짝수" : "홀수";
		String r = n  == 0    ? "0"   : 
				   n % 2 == 0 ? "짝수" : "홀수"; // 삼항연산자의 중첩은 잘 안 쓰긴 하지만 쓴다면 이렇게 정리해주면 좋다 
		
//		String r = n  == 0 ? "0" : n % 2 == 0 ? "0" : "홀수";
		System.out.println(r);
		
		
	
		
	}

}
