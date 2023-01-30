package for_;

public class Ex1 {

	public static void main(String[] args) {
		//Hello, World 10번 출력
		for(int i=0;i<10;i++) {
			System.out.println(i + ": Hello, World!");
		}
		System.out.println("==================");
		//짝수만 출력
		for(int i=2;i<=10;i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("==================");
		//제어변수 i가 10~1까지 감소 
		for(int i=10;i>=1;i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("==================");
		//for문에서 구성요소 제외 가능 예. 근데 잘 안 씀
		int i = 1;
		for(; i<=10;i++) {
			System.out.print(i + " ");
		}
	}

}
