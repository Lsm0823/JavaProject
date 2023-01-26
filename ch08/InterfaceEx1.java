package ch08;


interface Calc{
	void puls(int a, int b);		// 자동 추상 메소드
}

class Function implements Calc{
	// Calc 인터페이스에 추상 메소드가 있기 때문에 오버라이딩 써야 함. 추상메소드는 오버라이딩 강제 
	@Override
	public void puls(int a, int b) {
	}
	
}

class Graphics implements Calc{
	@Override
	public void puls(int a, int b) {
	}
}

public class InterfaceEx1 {

	public static void main(String[] args) {

	}

}
