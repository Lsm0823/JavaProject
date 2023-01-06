package ch04;

public class Ex7 {

	public static void main(String[] args) {
		int sum = 0;
		int sum1 = 0;
		for(int i = 1; i<=30; i++)
			if(i % 2 == 0) {
				sum = sum + i;
			}
			else if(i % 2 != 0) {
				sum1 = sum1 + i;
			}
		System.out.println("홀수의 합" + "=" +sum1);
		System.out.println("짝수의 합" + "=" + sum);
		
	}

}
