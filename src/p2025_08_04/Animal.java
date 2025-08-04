package p2025_08_04;

public class Animal {
//           사용자 정의 클래스(자료형)	
	
	int age;					// 멤버변수, 필드(field) : heap 메모리 영역에 저장
								// : 메소드 바깥쪽에 정의되는 변수	
	
	public Animal() {       	// 기본 생성자(Default Constructor)
								// : 매개변수가 없는 생성자	
		System.out.println("생성자 호출 성공");
	}

	public static void main(String[] args) {
		int a = 30;				// 지역변수 : stack 메모리 영역에 저장
		
		String  str =           new        String("자바");
//		클래스   레퍼런스변수       연산자       생성자 호출
		
		Animal    a1 		=  new 		Animal();
//		클래스    레퍼런스변수      연산자    생성자 호출
		
//		System.out.println(age);        // 에러발생

		// Animal 클래스에 있는 age필드는 new 연산자로 객체를 생성할때 heap메모리 공간을 할당 받으면서
		// age=0 으로 초기화가 된다.		
		System.out.println(a1.age);      // 0 
		
		a1.age = 5;						// age값을 5로 수정
		System.out.println(a1.age);     // 5  
		
		Animal a2 = new Animal();
		System.out.println(a2.age);      // 0 
		
		if(a1 == a2) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}

	}

}
