package while_;

public class Test1 {

	public static void main(String[] args) {
		int i = 2;
		while(i<=9) {
			System.out.println("< "+i+"단 >");
			int j = 1;
			while(j<=9) {
				System.out.println(i+" * "+ j + " = " + i*j);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
