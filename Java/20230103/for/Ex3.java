package for_;

public class Ex3 {

	public static void main(String[] args) {
		for(int dan = 2; dan <= 9; dan++) {//단. alt+shift+r 변수 동시에 바꿀 수 있음
			System.out.println("< "+ dan + "단 >");
			for(int i = 1; i <= 9; i++) { //곱하는 수 
				System.out.println(dan + "*" + i + " = " + dan*i);
			}
			System.out.println();
				
		}
	}

}
