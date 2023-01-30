package variable;

public class Ex3 {

	public static void main(String[] args) {
		System.out.printf("%d \n", 12345);
		
		String s1 = "java";
		String s2 = "프로그래밍";
		System.out.printf("%s %s\n", s1, s2); // 바인딩. %s 자리에 s1이 바인딩 되었다 라고 표현한다 
		System.out.println(s1 + " " + s2);
		
		String name = "양선정";
		int age = 30;
		System.out.printf("안녕하세요 제 이름은 %s 입니다. \n 제 나이는 %d세 입니다", name, age);
		System.out.println();
		System.out.println("안녕하세요 제 이름은 "+ name + " 입니다.");
		System.out.println(" 제 나이는 " + age + "세 입니다.");
	}

}
