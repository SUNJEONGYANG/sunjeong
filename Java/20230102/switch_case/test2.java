package switch_case;

public class test2 {

	public static void main(String[] args) {
		// 세 정수 n1, n2, n3 중 최대값 출력
		// ex) 최대값: 30
//	    int n1 = 30, n2 = 50, n3 = 10;
//	    String result = "최대값: ";
//	    if(n1>n2) { // n1이 더 큼
//	    	if(n1 > n3) {
//	    		System.out.println(result + n1);
//	    		result += n1;
//	    	} else {
//	    		System.out.println(result + n3);
//	    		result += n3;
//	    	}
//	    } else {
//	    	if(n2 > n3) {
//	    		System.out.println(result + n2);
//	    		result += n2;
//	    	} else {
//	    		System.out.println(result + n3);
//	    		result += n3;
//	    	}
//	    }
//	    System.out.println(result);
	    
	    //삼항연산자
		int n1 = 100, n2 = 300, n3 = 200;
		int max = (n1>n2) ? n1 : n2;
		max = (max>n3) ? max : n3;
		System.out.println("최대값: " + max);
	}

}
