package operator;

public class Ex3 {

	public static void main(String[] args) {
		boolean a = false;
		boolean b = true;
		
		System.out.println("a(false) && a(false) = " + (a && a));
		System.out.println("a(false) && b(true) = " + (a && b));
		System.out.println("b(true) && a(false) = " + (b && a));
		System.out.println("b(true) && b(ture) = " + (b && b));
		
		System.out.println("=======================================");
		
		System.out.println("a(false) || a(false) = " + (a || a));
		System.out.println("a(false) || b(true) = " + (a || b));
		System.out.println("b(true) || a(false) = " + (b || a));
		System.out.println("b(true) || b(ture) = " + (b || b));
		
		System.out.println("=======================================");
		System.out.println("!a(false) = " + (!a));
		System.out.println("!b(true) = " + (!b));
		System.out.println("=======================================");
		
		System.out.println("a(false) ^ a(false) = " + (a ^ a));
		System.out.println("a(false) ^ b(true) = " + (a ^ b));
		System.out.println("b(true) ^ a(false) = " + (b ^ a));
		System.out.println("b(true) ^ b(ture) = " + (b ^ b));
		
		System.out.println("=======================================");
		int i = 10;
		boolean result = i > 9 | i++ > 9; // |를 1개 쓰면 11, 2개 쓰면 10 
		System.out.println(i);
		
		
		
		
		
		

	}

}
