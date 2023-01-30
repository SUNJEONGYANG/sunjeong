package break_continue;

import java.util.Random;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Random r = new Random(); // ctrl + space 눌러서 입력
		int target = r.nextInt(999) + 1;
		
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		
		int count = 0;
		int i = 1;
		for(i=1; i<=20; i++) {
			int n = sc.nextInt();
			count++;
			if(n < target) {
				System.out.println("UP");
//				continue;
			} else if (n > target) {
				System.out.println("DOWN");
//				continue;
			} else {
				System.out.println("정답 : " + target);
				System.out.println("횟수 : " + count);
				break;
			}
		}
		if(i>20) {
			System.out.println("실패! 정답: " + target);
		}
//		while(i<=20) {
//			i++;
//			count++;
//			if(n < target) {
//				System.out.println("UP");
//			} else if (n > target) {
//				System.out.println("DOWN");
//			} else {
//				System.out.println("정답 : " + target);
//			}
//			}
//		System.out.println("횟수 : " + count);
	}

}
