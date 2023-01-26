package ch09;

/* 내부(중첩)클래스
 * 내부클래스는 왜 사용하느가? -
 * 1. 클래스 안에 선언 (활용도 100%)
 * 2. 클래스 안에 선언 이지만, static 클래스로 선언 (활용도 1%)
 * 3. 메소드 안에 클래스 선언 (활용도 10%)
 * 4. 메소드 안에 선언을 하고 선언과 동시에 생성 익명 클래스 (활용도 100%) 
 */

interface Myinter{
	void prn();
}

class Outer1{
	
	class Inner1{}
	
	static class Inner2{	}
	
	// 메소드 안에 메소드 선언 불가
	public void prn() {
		class Inner3{}
		
		new Myinter() {	
			@Override
			public void prn() {
			}
		};
	
	}
	
	
} //Inner1


public class InnerEx1 {

	public static void main(String[] args) {

	}

} //main
