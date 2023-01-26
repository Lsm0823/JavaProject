package ch09;

interface MyInter1{
	void prn();
}

abstract class MyAbst1{
	abstract void prn();
}

class A implements MyInter1{
	@Override
	public void prn() {
		System.out.println("일반적인 구현 방법");
	}
}

class B extends MyAbst1{
	
	public void prn() {	}
}

public class AnonymaousEx1 {

	public static void main(String[] args) {

		A a = new A();
		a.prn();
		B b = new B();
		b.prn();
		
		new MyInter1() {
			
			@Override
			public void prn() {
				System.out.println("익명클래스 구현 방법");
			}
		}.prn();;
		
		new MyAbst1() {
			
			@Override
			void prn() {
				System.out.println("익명클래스 구현 방법2");
			}
		};
		
	}

}
