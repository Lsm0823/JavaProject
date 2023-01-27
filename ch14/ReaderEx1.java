package ch14;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderEx1 {

	public static void main(String[] args) {
	InputStream is =	System.in;
		//1byte 단위로 들어온 data를 문자단위로 변환
		Reader reader = new InputStreamReader(is);
		while(true) {
			try {
				int a = reader.read();	//main에서는 throws 사용 불가(try 사용),	내부적인 스레드 : 입력 전에 대기
				if(a== -1/*ctrl + z*/)break;	//터미널에서 사용 됨
				System.out.print((char)a);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("End");
	}

}
