package if_;

public class Ex1 {

	public static void main(String[] args) {
		int score = -50;
		String grade = "";
		if(0 <= score && score <= 100) {
			if(score >= 90) {
				grade = "A학점";
			} else if (score >= 80) {
				grade = "B학점";
			} else if (score >= 70) {
				grade = "C학점";
			} else if (score >= 60) {
				grade = "D학점";
			} else {
				grade = "F학점";
			}
			System.out.println(grade);
		} else {
			System.out.println("점수 입력 오류");
		}
	}

}
