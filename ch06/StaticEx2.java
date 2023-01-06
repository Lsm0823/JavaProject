package ch06;

public class StaticEx2 {

	static int a = 10;
	int b = 10;
	
	static void prn1() {
		System.out.println(a);
		//static 메소드에는 non-static 사용불가
		//System.out.println(b);
	}
	
	void prn2() {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		StaticEx2 st = new StaticEx2();
		st.prn1();
		st.prn2();
	}

}
