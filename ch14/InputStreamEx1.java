package ch14;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {

	public static void main(String[] args) {
		InputStream is = System.in;	//Ű���忡 ����� ����
		while(true) {
			try {
				int a = is.read();	//main������ throws ��� �Ұ�(try ���),	�������� ������ : �Է� ���� ���
				if(a== -1)break;
				System.out.print((char)a);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
