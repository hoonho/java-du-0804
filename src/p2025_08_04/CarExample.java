package p2025_08_04;
// p249
class Car{
	
	// 필드(field)
	// 필드는 Car클래스로 객체를 생성할때 heap 메모리상에 공간을 할당 받는다.
	String company = "현대 자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;	  // Car클래스로 객체를 생성할때 heap메모리에 공간을 할당 받으면서
				  // speed=0으로 초기화된다.

	public Car() {
		System.out.println("생성자 호출 성공");
	}

}

public class CarExample {

	public static void main(String[] args) {
		
		// Car 클래스로 객체를 생성
		Car 	mycar 		= 	new 	Car();
//      클래스   레퍼런스변수       연산자    생성자 호출
		
		System.out.println("제작회사:"+ mycar.company);
		System.out.println("모델명:"+ mycar.model);
		System.out.println("색깔:"+ mycar.color);
		System.out.println("최고속도:"+ mycar.maxSpeed);
		System.out.println("현재속도:"+ mycar.speed);			// 0
		
		// 필드값 변경
//		speed = 60;
		mycar.speed = 60;
		System.out.println("수정된 속도:"+ mycar.speed);      // 60
	}

}
