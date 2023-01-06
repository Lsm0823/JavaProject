package ch06;

/*
static : 필드, 메소드, 클래스(부분)
static 필드 및 메소드는 객체를 생성하지 않아도 사용가능
사용시점 : 클래스 이름으로 접근하기 때문에 그때 메모리에 로딩
*/

/*static*/ class Static1{
	static int i = 0;
	int j = 0;
	
	static void prn1() {}
	void prn2() {}
	
	static class Inner{} // 내부클래스 앞에는 static 올수 있음.
	
}


public class StaticEx1 {

	public static void main(String[] args) {
		
		int a = Math.abs(-6);
		int b = (int)Math.round(3.14);
		
		/*
		 * Integer i = new Integer(22); int c = i.parseInt("23");
		 */
		
		int d = Integer.parseInt("23");
		//Integer.parseInt는 문자를 정수형으로 바꿔주기 위한 키워드
		//객체 생성 없이 사용할 수 있는 곳에 static 사용 , 객체 생성해서 사용은 가능하지만 권장 하지 않음
		
		//반지름이 5인 원의 넓이를 구하시오.
		int r = 5;
		System.out.println(r * r * Math.PI);
	}

}