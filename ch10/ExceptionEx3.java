package ch10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {

	public static void main(String[] args) {
		Scanner s = null;
		
		try {
			int a, b;
			s = new Scanner(System.in);
			System.out.println("첫번째 숫자 :");
			a = s.nextInt();
			System.out.println("두번째 숫자");
			b = s.nextInt();
			System.out.println(a + "/" + b +"=" + (a/b));
	
			//다중 catch일때는 하위 Exception이 위에 옴.
//		} catch (Exception e) {
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("0으로 입력하면 안되요");
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력해야합니다.");
		}
		finally {
			s.close();
		}
		
	}

}
