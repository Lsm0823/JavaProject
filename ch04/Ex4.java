package ch04;

public class Ex4 {

	public static void main(String[] args) {
		// for문을 이용하여 1~10 까지의 합을 구하는 코드
		int sum =0;
		for(int i=1, j=0; i<11; i++, j++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
