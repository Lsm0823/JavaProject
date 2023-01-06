package ch06;

class Method3{
	void prn(int...arr) { // 가변인수 선언
		for (int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}


public class MethodEx3 {

	public static void main(String[] args) {
		Method3 m = new Method3();
		m.prn(1);
		m.prn(1,2);
		m.prn(1,2,3);
		m.prn(1,2,3,4);
		m.prn(1,2,3,4,5);
		
		System.out.printf("%s", "하하"); // 가변인수 printf 사용법
	}

}
