package ch05;

public class Ex1 {

	public static void main(String[] args) {
		int arr[]; // 배열 변수 선언
		arr = new int[5]; // 배열 크기 지정(불변)
		 //배열값 할당
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		for(int i =0; i< arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		int arr1[] = new int[3];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i*10;
			System.out.println(arr1[i]);
		}
		
		//값의 갯수에 따라 배열생성
		int arr2[] = {1,2,3,4,5,6}; 
		String str[] = {"JAVA", "JSP", "Anroid", "Spring"};
	}

}
