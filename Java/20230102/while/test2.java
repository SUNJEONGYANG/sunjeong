package while_;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		int i = 1;
		int odd = 0;
		int even = 0;
		while(i<=5) {
			if(i%2 == 0) {
				even += i;
			} else {
				odd += i;
			}
			i++;
		}
		System.out.println("1~100까지의 짝수의 합: " + even);
		System.out.println("1~100까지의 짝수의 합: " + odd);
		
		System.out.println("=============================");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
				
		int score = 71;
		String grade = "";
		if(score >= 0 && score <= 100) {
			switch(score/10) {
			case 10:
				grade = "A";
				break;
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default :
				grade = "F";
				break;
			}
			grade += "학점";
			System.out.println(grade);
					
		}
	}

}
