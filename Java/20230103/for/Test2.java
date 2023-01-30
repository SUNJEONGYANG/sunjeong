package for_;

public class Test2 {

	public static void main(String[] args) {
		int a = 0;
		int b = 10;
		int sum = 0;
		for(int i=a;i<=b;i++) {
			if(i%3==0) {
				sum += i;
			}
		}
		System.out.println(a + " ~ "+ b + " 까지 3의 배수의 합: " + sum);
		System.out.println("==============================");
		
		for(int i=1;i<=100;i++) {
			int num = i%10;
			if(num == 3 || num == 6 || num == 9) {
				System.out.print("짝 ");
			} else {
				System.out.print(i + " ");			
			}
		}
		System.out.println();
		System.out.println("==============================");
		//7의 갯수를 카운트. ex) 7의 갯수 
//		int n = 247427723;
//		int num = n/100;
//		int num2 = num%10;
//		int num3 = n/1000;
//		int num4 = num3%10;
//		int num5 = n/1000000;
//		int num6 = num5%10;
//		System.out.println(num);
//		System.out.println(num2);
//		System.out.println(num3);
//		System.out.println(num4);
//		System.out.println(num5);
//		System.out.println(num6);
//		int result = 0;
//		for(int i=1;i<=3;i++) {
//			if(num2 == 7 || num4 == 7 || num6 == 7) {
//				result += 1;
//			} 
//		}
//		System.out.println("7의 갯수: " + result);
		//디버깅 모드로 조건식 찾아내기 
		int n = 247427723;
		int count = 0;
		while(n != 0) {//n>0 으로 바꿔도 됨
			if(n %10 == 7) {
				count++;
			}
			n /= 10;
		}
		System.out.println("7의 갯수: " + count);
	}

}
