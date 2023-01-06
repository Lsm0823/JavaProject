package ch04;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		//입력한 1 ~ 20 사이의 숫자중에 3,6,9 인지를 판단하세요.
		System.out.println("숫자를 입력하세요.");
		while(true) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			if(a >0 && a <=20) {
				if(a<10 && a%3 == 0) {
					System.out.println("박수");
				}
			
				if(a>10 && a %3 == 1) {
					System.out.println("박수");
				}
			
		// 3 6 9 13 16 19
			else
				System.out.println("숫자를 다시 입력하세요");
		}
	}
	}
}
