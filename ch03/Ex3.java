package ch03;

public class Ex3 {
	public static void main(String[] args) {
		
		
		//배열은 동일한 데이터타입을 하나의 변수로 묶어 놓은 기능
		int a = 1;
		int b = 2;
		int c = 3;
		
		int arr[] = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		for(int i=0; i<3; i++) {
			System.out.println(arr[i]);
		}
	}
}
