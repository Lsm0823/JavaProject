package ch03;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		/*
		int a = 10;
		int b = 3;
		int c = Math.max(a, b);
		System.out.println(a+b);
		System.out.println(a-b); 
		System.out.println(a*b); // 곱하기
		System.out.println(a%b); // 나머지
		System.out.println(a/b); //몫
		*/
		//입력한 값이 홀수 인가 짝수 인가 출력

		while(true) {
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
		if( i % 2 == 0) {
			System.out.println(i +" 는 짝수입니다");
		}
		else
			System.out.println(i + " 는홀수입니다");
		}
	}

}
