package ch04;

public class Ex8 {

public static void main(String[] args) {
		int sum = 0;
		int sum1 = 0;
		for(int i = 1; i<=50; i++) {
			int a = i%10;
			if(a % 3 == 0 && a != 0) {
				sum = sum + i;
			}
			else if(a==0 && a == 30) {
				sum = sum + i;
			}
			else if(i / 10 == 3 && a % 3 !=0) {				
				sum = sum + i;				
			}
		}
		System.out.println(sum);
}
}
