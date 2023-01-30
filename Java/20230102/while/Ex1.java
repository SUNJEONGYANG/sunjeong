package while_;

public class Ex1 {

	public static void main(String[] args) {
		int i = 0;
		while(i < 10) {
			System.out.println("안녕하세요");
			i++;
		}
		System.out.println(i);
		
		System.out.println("==================");
		// 1, 2, 3.....출력
		i = 1;
		while(i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		System.out.println("==================");
		// 2, 4, 6 ....... 출력
		i = 2; 
		while(i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}
		System.out.println();
		System.out.println("==================");
		//10, 9, 8.......
		i = 10;
		while(i >= 1) {
			System.out.print(i + " ");
			i--;
		}
	}

}
