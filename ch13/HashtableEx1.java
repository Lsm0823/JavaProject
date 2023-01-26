package ch13;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableEx1 {

	public static void main(String[] args) {
		Hashtable<String, String> ht1 =
				new Hashtable<String, String>();
		ht1.put("사과", "Apple");
		ht1.put("포도", "Grapes");
		ht1.put("딸기", "Strawberry");
//		ht1.put("딸기", "Erdbeeren");	//덮어쓰기
		ht1.put("a", "1111");	//덮어쓰기
		Enumeration<String> e = ht1.keys();
		while(e.hasMoreElements()){//요소가 있을때 까지{
		String key = e.nextElement();
		String value = ht1.get(key);
		System.out.println(key + " : " + value);
		}	//	while
	}	//	main
}	//	Hashtable
