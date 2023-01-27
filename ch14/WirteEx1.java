package ch14;

import java.io.OutputStream;

public class WirteEx1 {

	public static void main(String[] args) {
		int i = 'A';
		char c = 'b';
		char c1 = '공';	
		try {
		OutputStream writer = System.out;	//콘솔창에 출력스트림을 빨대로 꼽았다.
		writer.write(i);
		writer.write(c);
		writer.write(c1);
		writer.flush(); //스트림에 남아있는 데이터를 비운다.
		writer.close();//사용하지않는 스트림은 반드시 다는다!!
		} catch (Exception e) {}
	}
}
