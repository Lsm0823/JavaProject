package ch06;

// final (마지막) : 클래스 , 필드(인스턴스 변수) , 메소드
// 1. 클래스 : 서브 클래스가 없는 클래스
// 2. 필드 : 상수 선언 (필드, 매개변수, 지역변수)
// 3. 메소드 :  오버라이딩 불가 
//				  (etc 오버라이딩 : 상위 클래스에서 정의한 메소드를 하위클래스에서 다시 재정의) 


final class Final1{
	
}

class Final3{
	
	static final int KIA = 1;
	final int SK = 2;
	int k;
	
	//필드 : 메소드와 공유의 목적으로 사용, 속성을 목적으로 사용
	
	public Final3() {
		//KIA = 2;
		System.out.println(k);
	}
	
	public void prn(final int a) {
		final int b = 10; //메소드 안에 생성되는 변수는 지역변수
	}
}

class Final4 {
	void prn1() {}
	final void prn2() {}
}

class Final5 extends Final4{
	@Override
	void prn1() {}
	
//	void prn2() {} //Final4 에서 final을 선언함으로 상속을 받았지만 사용불가
}

/* class Final2 extends Final1{} */


public class FinalEx1 {

	public static void main(String[] args) {
		
	}

}
