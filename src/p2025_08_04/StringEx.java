package p2025_08_04;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String 객체 생성
		String str1 = "자바";
		String str2 = "자바";
		String str3 = new String("자바");
		String  str4 		= 	new 		String("자바");
//		클래스   레퍼런스변수       연산자        생성자 호출
		
		// 비교 연산자(==)로 참조하는 주소를 비교
		if(str1 == str2) {
			System.out.println("같은 주소");				// 같은 주소
		}else {
			System.out.println("다른 주소");
		}
		if(str3 == str4) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");				// 다른 주소
		}
		
		// 참조하는 값(데이터)을 비교
		// boolean  equals()
		if(str1.equals(str2)) {
			System.out.println("참조하는 값이 같다.");		// 참조하는 값이 같다.
		}else {
			System.out.println("참조하는 값이 다르다.");
		}
		if(str3.equals(str4)) {
			System.out.println("참조하는 값이 같다.");		// 참조하는 값이 같다.
		}else {
			System.out.println("참조하는 값이 다르다.");
		}
		
		
	}

}
