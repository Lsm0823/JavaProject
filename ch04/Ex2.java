package ch04;

import java.util.Scanner;

//switch문 예제

public class Ex2 {

	public static void main(String[] args) {
		
		// 1~ 12중 입력 숫자에 따른 계절 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("Month를 입력하세요.");
		int m = sc.nextInt();
		
		if(m==12 || m==1 || m==2) {
			System.out.println("겨울 입니다");
		}
		else if(m==3 || m==4 || m==5) {
			System.out.println("봄 입니다.");
		}
		else if(m==6 || m==7 || m==8) {
			System.out.println("여름 입니다.");
		}
		else if(m==9 || m==10 || m==11) {
			System.out.println("가을 입니다.");
		}
		else {
			System.out.println("해당되는 계절이 없습니다.");
		}
		
switch(m) {
	case 12: case 1 : case 2 :
			System.out.println("겨울입니다.");
			break;
	case 3: case 4 : case 5 :
		System.out.println("봄 입니다.");
		break;
	case 6: case 7 : case 8 :
		System.out.println("여름 입니다.");
		break;
	case 9: case 10 : case 11 :
		System.out.println("가을 입니다.");
		break;
		}
	}
}
