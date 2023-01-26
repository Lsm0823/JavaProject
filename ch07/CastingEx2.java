package ch07;

import java.util.Vector;

class Person2{
	String name;
	public Person2(String name) {
		this.name = name;
	}
} // class Person2

class Student2 extends Person2{
	String grade;
	
	public Student2(String name) {
		
		super(name);
	
	}
	
	
} //class Student2

public class CastingEx2 {

	public static void main(String[] args) {
		
		Person2 p;
		Student2 s = new Student2("홍길동");
		p = s;		//업캐스팅
		
		System.out.println(p.name);
//		System.out.println(p.grade);
		
		Student2 s2;
		Person2 p2 = new Person2("홍길자");
//		s2 = (Student2)p2; // DownCasting
		
		Vector v = new Vector();
		String str = new String();
		Student2 s3 = new Student2("장동건");
		v.add(str);
		v.add(s3);
		String str1 = (String)v.get(0);
		Student2 s4 = (Student2)v.get(1);
		
	}

}
