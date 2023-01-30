package if_;

public class Test1 {

	public static void main(String[] args) {
// 내꺼
//		int num = -10;
//		if(num > 0 || num < 0) {
//			System.out.println("변수 num = " + num/num*num);
//		}
//		int num = -10;
//		if(num < 0) {
//			num = -num;
//		}
//		System.out.println("변수 num = " + num);
		
		int num = -10;
//		num = num < 0 ? -num : num;
		num *= num < 0? -1 : 1;
		System.out.println("변수 num = " + num);
		
		System.out.println("===================================");
		
		char ch = 'Z';
//		if(ch >= 'A' && ch <= 'Z') {
//			ch += 32;
//		}
		ch += (ch >= 'A' && ch <= 'Z') ? 32 : 0;
		System.out.println("ch = " + ch);
		
	}

}
