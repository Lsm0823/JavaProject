package ch13;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("���� ����");
		list.add("���� ����");
		list.add("���� ����");
		list.add(2, "������ ����");
		list.set(3, "���屹��");		// 3��° ��ҿ� String �߰�

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}	//for

		System.out.println("--------------------------");
		
		Iterator<String> e = list.iterator();
		while(e.hasNext()) {
			System.out.println(e.next());
		}	//while
	}	//main
}	//ArrayListEx1
