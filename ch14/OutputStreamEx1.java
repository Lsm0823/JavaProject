package ch14;

import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;

public class OutputStreamEx1 {

	public static void main(String[] args) {
		
		int i = 'A';
		char c = 'b';
		char c1 = '��';
		
		try {
		OutputStream os =	System.out;	//�ܼ�â�� ��½�Ʈ���� ����� �žҴ�.
		os.write(i);
		os.write(c);
		os.write(c1);
		os.flush(); //��Ʈ���� �����ִ� �����͸� ����.
		os.close();//��������ʴ� ��Ʈ���� �ݵ�� �ٴ´�!!
		} catch (Exception e) {}
	}

}
