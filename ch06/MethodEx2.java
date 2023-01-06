package ch06;

class Method2{
	//    Method Over loading (오버로딩)
	// ->동일한 메소드 명으로 매개변수의 개수와 타입을 다르게 선언
	
	void prn(int a) {
		System.out.println(a);
	}
	
	void prn(int a, int b) {
		System.out.println(a + "\t" + b);
	}
	
	void prn(int a, int b, int c) {
		System.out.println(a + "\t" + b + "\t" + c);
	}
	
	void prn(int arr[]) {
		for (int i=0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t");
		}
	}
}

public class MethodEx2 {

	public static void main(String[] args) {
		//Method클래스에 abs 메소드는 절대값 리턴
		
		int a = Math.abs(-10);
		double d = Math.abs(3.14);
		
		Method2 m = new Method2();
		m.prn(10);
		m.prn(10, 20);
		m.prn(10, 20, 30);
		
		
	}

}
