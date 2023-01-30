package break_continue;

public class Ex1 {

	public static void main(String[] args) {
		int i = 1;
		
		while(i < 10) {
			System.out.println(i);
			
			if(i == 5) {
				break;
			}
			i++;
		}
		System.out.println("while문 종료 후 i: " + i);
		System.out.println("===========================");
		
		for(i=1; i<=10; i++) {
			if(i%2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("===========================");
		//while문에서 continue; 쓸 때 무한루프 주의 
		i = 0;
		while(i <= 10) {
			
			i++;
			if(i%2 ==1) {
				continue;
			}
			
			System.out.println(i);
		}
	}

}
