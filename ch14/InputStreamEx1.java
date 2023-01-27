package ch14;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {

	public static void main(String[] args) {
		InputStream is = System.in;	//키보드에 연결된 빨대
		while(true) {
			try {
				int a = is.read();	//main에서는 throws 사용 불가(try 사용),	내부적인 스레드 : 입력 전에 대기
				if(a== -1)break;
				System.out.print((char)a);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
