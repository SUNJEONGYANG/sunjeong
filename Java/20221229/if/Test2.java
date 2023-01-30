package if_;

public class Test2 {

	public static void main(String[] args) {
//		int num = 0;
//		if(num >= 0) {
//			System.out.println(num + " : 양수!");
//		} else {
//			System.out.println(num + " : 음수!");
//		}
//		String result = num + " : ";
//		if(num >= 0) {
//			result += "양수!";		
//		} else {
//			result += "음수!";
//		}
//		
//		System.out.println(result);
		
//		int num = 20;
//		
//		String result = num >= 0 ? ": 양수!" : ": 음수";
//		// num >= 0 을 num < 0 으로 표현할수도 있다 
//		
//		System.out.println(num + result);
//		
//		System.out.println("===========================");
		
		char ch = 'F';
		if(ch >= 'a' && ch <= 'z') {
			ch -= 32;
		} else {
			ch += 32;
		}
//		ch += (ch >= 'a' && ch <= 'z') ? 32 : -32;
		System.out.println("ch = " + ch);
		
	}

}
