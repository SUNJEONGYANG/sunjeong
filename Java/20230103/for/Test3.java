package for_;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0;  j < i+1 ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5-i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		System.out.println("=======================");
//		for(int i=1;i<=5;i++) { //i>=1로 바꾸고 j<=i; 이렇게 해줘도 된다 
// 			for(int j=1;j<=6-i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
//			for(int j=0;j<6-i;j++) {
//				System.out.print("*");
//			}
		}
		System.out.println("----------------------------------");
		for(int i=0;i<5;i++) {
			for(int j=0;j<4-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------------------");
		for(int i=0; i<5; i++) {
			for(int j=1; j<=i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------------------");
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print(" ");
			}
			System.out.println();

		}
		System.out.println("----------------------------------");
		//20230105풀이
//		Scanner sc = new Scanner(System.in);
//		int line = 10; 
//		int star = 1;
//		int space = line - star;
//		for(int i=1; i<=5; i++) { //행갯수
//			for(int j=1; j<=5-i; j++) { //공백찍기
//				System.out.print(" ");
//			}
//			for(int j=1; j<=i; j++) { //별찍기
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=0; i<line; i++) {
//			for(int j=0; j<space; j++) { //공백
//				System.out.print(" ");
//			}
//			for(int j=0; j<star; j++) { //별
//				System.out.print("*");
//			}
//			System.out.println();
//			star++;
//			space--;
//		}
		System.out.println("----------------------------------");
		int line = 7;
		int star = line;
		int space = 0;
		
		for(int i=0; i<line; i++) {
			for(int j=0; j<space; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<star; j++) {
				System.out.print("*");
			}
			System.out.println();
			star--;
			space++;
		}
	}

}
