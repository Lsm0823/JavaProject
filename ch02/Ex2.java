package ch02;

public class Ex2 {

	public static void main(String[] args) {
		//변수는 위에 선언한 것은 밑에 사용 가능
		int a = 10;
		int b = a;
		System.out.println(a);
		System.out.println(b);
		if (a>10) {
			int c = 10;
		}
		// int d = c; 사용 불가  
	}

}
