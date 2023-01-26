package ch07;

import java.awt.Component;

abstract class Abstract1{ // 추상 클래스
	
	//추상 메소드
	abstract void prn();	// 사용자가 만들어야 한다.  강제적으로 오버라이딩 하게 만든다.
	
}

class Normal1 extends Abstract1{
	
	@Override
	void prn() {
	}
	
}


class MComponent extends Component{
	
	
	
}


public class AbstractEx1 {

	public static void main(String[] args) {
		
		Abstract1 a;					//타입으로는 존재 가능
//		a = new Abstract1();		//객체생성은 불가
		
		a = new Normal1();
		
	}

}
