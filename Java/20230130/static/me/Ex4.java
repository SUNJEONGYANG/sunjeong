package static_;

public class Ex4 {

	public static void main(String[] args) {
		Car c1 = Car.getInstance();
		Car c2 = Car.getInstance();
		System.out.println(c1 == c2);
	}

}



class Car {
	private static Car car = new Car();
	private Car() {} // 1. 외부에서 객체 생성 못 하도록 private 처리 
	static Car getInstance(){ // 리턴타입: Car 
//		if(car == null) { // 이렇게 new 생성해주어도 된다. 
//			car = new Car();
//		}
		return car;
	}
}




















