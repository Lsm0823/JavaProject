package ch06;

import java.awt.Frame;

// java.awt.Frame에 paramString의 결과값을 출력하시오.





public class AccessEx5 extends Frame{
	
	public AccessEx5() {
	
		
	}
	
	public static void main(String[] args) {	
		
		AccessEx5 ac = new AccessEx5();
		System.out.println(ac.paramString());	
		
	}
}