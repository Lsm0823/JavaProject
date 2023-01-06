package ch02;

public class Ex8 {

	public static void main(String[] args) 
	throws Exception{ //예외문
		System.out.println("키보드를 입력하고 Enter 하세요.");
		
		while(true) {
		int keyCode = System.in.read();
		System.out.println("KeyCode : " + keyCode);
		
		if(keyCode == 113) {
			break;
		}
		}//--while
		System.out.println("종료");
	}

}
