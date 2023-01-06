package ch06;

class Method1{
	int abs(int num) { // 선언부
		if(num < 0)	//절대값 구하는 공식
			num = -num;
		return num;
	}
	
	void prn(int a, int b) {
		int c = a + b;
		
		System.out.println(a + " + " + b + " = " + c);
	}
	
}

public class MethodEx1 {

	public static void main(String[] args) {
		Method1 me = new Method1();
		int a = me.abs(-10); // return형이 있는 메서드이라도 반드시 값을 받을 필요는 없다.
		System.out.println(a);
		me.prn(10,20);
		
	}

}
