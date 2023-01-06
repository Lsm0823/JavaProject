package ch04;

public class Ex6 {

	public static void main(String[] args) {
		int sum = 0;		
		for(int i = 1; i <= 30; i++) {
			if( i % 3 == 0) {
			sum = i + sum; 
			}
		}
		System.out.println(sum);
	}

}
