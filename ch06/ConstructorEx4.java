package ch06;

class SuperClass4{
	
	
//	  public SuperClass4() {
//	  
//	  }
	 
	
	public SuperClass4(int i) {
		System.out.println("오류");
	}
}

class SubClass4 extends SuperClass4{
	public SubClass4() {
		// super 키워드는 상위클래스를 뜻한다 뒤에 ()가 생성자를 의미
		// super 키워드는 반드시 클래스 맨 위에 위치 (생략이 가능하지만 매개변수가 있는 생성자를 가르킬때는 표시)
		super(22); 
	}
}


public class ConstructorEx4 {

	public static void main(String[] args) {

	}

}
