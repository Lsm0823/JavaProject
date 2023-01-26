package ch13;

import java.util.Vector;

public class VectorEx1 {
	
	public static void main(String[] args) {
		Vector vlist = new Vector();				
		//System.out.println(vlist.size());
		//System.out.println(vlist.capacity());		//요소가 들어가야 하는 칸
		vlist.add(new String("하하"));
		vlist.add("하하");
		vlist.add(Integer.valueOf(22));	//정수 변환
		vlist.add(23);	//자동 정수 변환
		System.out.println(vlist.size());
		System.out.println("----------------------------------------------------------------------------");
		//배멸과 Vector 밑에는 항상 for
		for (int i = 0; i < vlist.size(); i++) {
			System.out.println(vlist.get(i));
		}
		System.out.println("=======================================");
		for (Object obj : vlist) {
			System.out.println(obj);
		}
	}

}
