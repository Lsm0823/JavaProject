package ch14;

import java.io.OutputStream;

public class WirteEx1 {

	public static void main(String[] args) {
		int i = 'A';
		char c = 'b';
		char c1 = '��';	
		try {
		OutputStream writer = System.out;	//�ܼ�â�� ��½�Ʈ���� ����� �žҴ�.
		writer.write(i);
		writer.write(c);
		writer.write(c1);
		writer.flush(); //��Ʈ���� �����ִ� �����͸� ����.
		writer.close();//��������ʴ� ��Ʈ���� �ݵ�� �ٴ´�!!
		} catch (Exception e) {}
	}
}
