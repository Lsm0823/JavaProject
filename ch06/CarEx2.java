package ch06;

//클래스 선언 (필드 + 메소드로 구성) -> 객체생성(new, 필드 및 메소드 사용하는 목적)
class Car2{
	
	// 필드와 메소드 위치는 상관 없음 
	// 필드 다음 메소드, 메소드 다음 필드 가능
	// 객체 생성시 필드 먼저 생성 후 메소드 생성하기 때문에 순서 상관 없음
	// 메소드는 공유 형식으로 사용 (중복 제거를 위해 효율적으로 사용함)
	
	String name;
	int speed;
	int gear;
	
	void stop(){
		speed = 0;
	}
	
}

public class CarEx2 {

	public static void main(String[] args) {
		
		for(int i =0; i<100; i++) {
		Car2 c1 = new Car2();
		//System.out.println(c1.toString());
		}
		
		// 요청된 소문자를 대문자로 출력
		String s = new String("dsjakdjlaskjklsajdlk");
		System.out.println(s.toUpperCase()); // ~로 땡땡해 키워드 -> to
		// 32라는 10진수를 2진수로 출력하세요
		
		// Integer : 정수를 객체화 시킨 클래스
		int a = 32;
		System.out.println(Integer.toBinaryString(a));
		
		
		
	}

}
