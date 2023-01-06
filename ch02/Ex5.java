package ch02;

public class Ex5 {

	public static void main(String[] args) {
		//기본형의 형 변환
		int a = 10;
		long b = a;
		System.out.println(a);
		System.out.println(b);
		short c = (short)a; //명시적 형 변환
		a = 32768;
		c = (short)a;
		System.out.println(c);
	}

}
