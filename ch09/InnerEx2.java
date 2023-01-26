package ch09;

class Outer2{
	
	int a = 22;
	
	void p() {
		System.out.println("a " + a);
	}
	
	class Inner2{
		int b = 23;
		void p1() {
			System.out.println("a + b" + a+b);
		}
	} // --inner2
}

public class InnerEx2 {

	public static void main(String[] args) {
		//일반적으로 내부 클래스는 다른 클래스에서 생성하고 사용하는 것은 거의 없음
		//제3의 클래스에 사용법
		Outer2 out = new Outer2();
		Outer2.Inner2 in = out.new Inner2();
		in.p1();
	}

}
