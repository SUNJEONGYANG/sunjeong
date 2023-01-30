package static_;

public class Test4 {

	public static void main(String[] args) {
		Road nr = new Road(new int[] {70 ,80 ,60 ,20 ,30 ,50 ,10 ,80 ,77 ,89}); // 북쪽 도로
		Road sr =  new Road(new int[] {70 ,60 ,40 ,50 ,55 ,65 ,23 ,44 ,37 ,88}); // 남쪽 도로 
		Bridge b2 = new Bridge();
		Bridge b4 =  new Bridge();
		Bridge b6 =  new Bridge();
		int northSum = nr.sum(0, 2);
		int southSum = sr.sum(2, 9);
		System.out.println(northSum);
		System.out.println(southSum);
		b2.bridge(2);
		b4.bridge(4);
		b6.bridge(6);
		
		System.out.println(northSum + southSum);
	}

}


class Road { // 도로 클래스 
	int sum = 0;
	int[] arr = new int[10]; // 배열 생성과 선언 
	
	public Road(int[] arr) {
		this.arr = arr;
	}
	
	
	public int sum(int startIndex, int endIndex) { // 소요시간 총합 계산 메서드
		for(int i=startIndex; i<=endIndex; i++) {
			sum += arr[i];
			
		}
		return sum;
	}
}

class Bridge { // 다리번호 클래스 
	int index;
	int[] total = new int[3];
	public int bridge(int bridge) {
		
		return 0;
	}
}



















