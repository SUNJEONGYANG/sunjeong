package while_;

public class Test1 {

	public static void main(String[] args) {
		//1~10 까지 정수의 합 sum을 계산하여 출력
		// 출력: 1~10까지의 합 : sum
//		int sum = 0;
//		int i = 1;
//		while(i <= 10) {
//			sum += i;
//			i++;
//		}
//		System.out.println("1~10까지의 합: " + sum);
		System.out.println("---------------");
		// 구구단 출력
		int dan = 7;
		int i = 1;
		System.out.println("< " + dan + "단 >");
		while(i<=9) {
			System.out.println(dan + "*" + i + " = " + (dan*i));
			i++;
		}
		System.out.println("==========================");
		//1~100 까지의 짝수/홀수의 합
		// odd(홀수), even(짝수) 
		// 1~100 까지의 짝수의 합 : , 1~100 까지의 홀수의 합: 
		int odd = 0;
		int even = 0;
		while(i <= 10) {
			if(i%2 == 0) {
				even += i;
			} else {
				odd += i;
			}
			i++;
		}
		System.out.println("1~100까지의 짝수의 합: " + even);
		System.out.println("1~100까지의 홀수의 합: " + odd);
	

	}	

}
