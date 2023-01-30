package if_;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
//1번
		int num1 = -10;
		if(num1 > 0) {
			System.out.println(num1 + "은 양수!");
		} else if(num1 < 0) {
			System.out.println(num1 + "은 음수!");
		} else {
			System.out.println(num1 + "은 0이다!");
		}
		System.out.println("=========================");
//2번	
		int num2 = 7;
		if(num2  == 0) {
			System.out.println(num2 + "은 0이다!");
		} else if(num2 %2 == 1) {
			System.out.println(num2 + "은 홀수!");
		} else {
			System.out.println(num2 + "은 짝수!");
		}
		System.out.println("=========================");
//3번		
		char ch = 'A';
		if(ch >= 'a' && ch<= 'z') {
			ch -= 32;
			System.out.println("ch = " + ch);
		} else if(ch >= 'A' && ch <= 'Z') {
			ch += 32;
			System.out.println("ch = " + ch);
		} else {
			System.out.println(ch + "는 영문자가 아닙니다!");
		}
		//boolean isUpperCase 변수를 활용할 수 있다 
		System.out.println("======================");
//4번	
		//콘솔에서 입력받기 
		Scanner sc = new Scanner(System.in); 
		int score = sc.nextInt();
//		int score = 91;
//			if(score >= 90) {
//				System.out.println("A학점");
//			} else if (score >= 80) {
//				System.out.println("B학점");
//			} else if (score >= 70) {
//				System.out.println("C학점");
//			} else if (score >= 60) {
//				System.out.println("D학점");
//			} else {
//				System.out.println("F학점");
//			}
		String result4 = "";
		if(score >= 90 && score <= 100) { //  score >= 90으로도 적을 수 있다 
			result4 = "A";
		} else if (score >= 80 && score <= 89) {
			result4 = "B";
		} else if (score >= 70 && score <= 79) {
			result4 = "C";
		} else if (score >= 60 && score <= 69) {
			result4 = "D";
		} else {
			result4 = "F";
		}
			result4 += "학점";
			
		System.out.println(result4);
		
	}

}
