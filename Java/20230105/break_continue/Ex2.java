package break_continue;

public class Ex2 {

	public static void main(String[] args) {
		OUTTER: //레이블1
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("< " + dan + "단 >");
			
			INNER: //레이블2
			for(int i = 1; i <= 9; i++) {
				
				if(dan == 6) {
//					break INNER;
//					continue INNER;
					
//					break OUTTER;
					continue OUTTER;
				}
				System.out.println(dan + " * " + i + " = " + (dan*i));
			}
			System.out.println();
		}
	}

}
