package switch_case;

public class test1 {

	public static void main(String[] args) {
		int score = 50;
//		int num = score/10;
		String grade = "";
		if(score >= 0 && score <= 100) {
			switch(score/10) {
			case 10:
				grade = "A학점";
				break;
			case 9:
				grade = "A학점";
				break;
			case 8:
				grade = "B학점";
				break;
			case 7:
				grade = "C학점";
				break;
			case 6:
				grade = "D학점";
				break;
			default:
				grade = "F학점";
				break;
				
			} 
			System.out.println(grade);
		} else {
			System.out.println("점수 입력 오류");
		}
//		grade += "학점";
	}

}
