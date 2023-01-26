package ch07;

public class CastingEx1 {

	public static void main(String[] args) {
		int a = 1234567;
		short s = (short)a; // 명시적 형변환 
		System.out.println(s);
		System.out.println(a);
		long i = a; // 묵시적 형변환
		System.out.println(i);
		
	}

}
