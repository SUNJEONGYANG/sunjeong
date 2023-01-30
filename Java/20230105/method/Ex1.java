package method;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("동생아! 불 좀 꺼라!");
		sister_1();
		System.out.println("동생이 불을 껐다!");
		System.out.println("---------------------------------");
		System.out.println("동생아! 물 좀 떠줘!");
		String result = sister_2();
		System.out.println("동생이 갖다준 것 : " + result);
		System.out.println("---------------------------------");
		System.out.println("동생아! 200원 줄테니 과자 사먹어라!");
//		sister_3(200); // 아래와 같은 코드임! 변수를 전달해줘도 ㄱㅊㄱㅊ
		int money = 2000;
		sister_3(money);
		System.out.println("---------------------------------");
		System.out.println("동생아! 1000원 줄테니 나도 새우깡 좀 사다줘!");
//		sister_4(1000); // 리턴값은 필요 없으면 저장 안 해줘도 된다. 필요하면 호출하면 된다.  
		String snack = sister_4(1000);
//		String snack = "새우깡";
		System.out.println("동생이 사다준 것 : " + snack);
	}
	
	public static void sister_1() {
		System.out.println("동생: 오빠가 불을 끄라고 시켜서 불을 껐다!");
	}

	public static String sister_2() {
		System.out.println("동생: 오빠가 물을 떠오라고 시켰다!");
		String result = "물";
		return result;
	}
	
	public static void sister_3(int money) {
		System.out.println("동생: 오빠가 과자 사먹으라고 " + money + "원을 줬다!");
		money -= 200;
		System.out.println("동생: 새우깡 사먹고 " + money + "원이 남았다!");
	}
	
	public static String sister_4(int money) {
		System.out.println("동생: 오빠가 과자 사오라고 " + money + "원을 줬다!");
		money -= 200;
		System.out.println("동생: 새우깡 사고 " + money + "원이 남았다!");
		return "새우깡"; // void가 아니면, 뭐라도 리턴을 해야 컴파일 오류가 발생하지 않는다. 
	}
}
