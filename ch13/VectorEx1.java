package ch13;

import java.util.Vector;

public class VectorEx1 {
	
	public static void main(String[] args) {
		Vector vlist = new Vector();				
		//System.out.println(vlist.size());
		//System.out.println(vlist.capacity());		//��Ұ� ���� �ϴ� ĭ
		vlist.add(new String("����"));
		vlist.add("����");
		vlist.add(Integer.valueOf(22));	//���� ��ȯ
		vlist.add(23);	//�ڵ� ���� ��ȯ
		System.out.println(vlist.size());
		System.out.println("----------------------------------------------------------------------------");
		//���� Vector �ؿ��� �׻� for
		for (int i = 0; i < vlist.size(); i++) {
			System.out.println(vlist.get(i));
		}
		System.out.println("=======================================");
		for (Object obj : vlist) {
			System.out.println(obj);
		}
	}

}
