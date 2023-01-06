package ch06;

class Constructor5{
	
	int a;
	String str;
	
	public Constructor5() {

//		중복된 기능
		
	}
	
	public Constructor5(int i) {
		this();
		a = i;
//		중복된 기능
	}
	
	public Constructor5(String s) {
		this();
		str = s;
		
//		중복된 기능
	}
	
} // Constructor5

class Constructor5_1{
	int a;
	String str;
	
	public Constructor5_1() {

//		중복된 기능
		
	}
	
	public Constructor5_1(int i) {
		// 자신의 디폴트 생성자를 호출, 반드시 생성자의 첫번째 라인에 위치 즉, super()와 같이 사용 불가
		this();
		a = i;
	}
	
	public Constructor5_1(String s) {
		this();
		str = s;
	}
} // Constructor5_1


public class ConstructorEx5 {

	public static void main(String[] args) {


	}
} //main
