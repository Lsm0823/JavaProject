package ch05;

public class Ex2 {

	public static void main(String[] args) {
		//다차원 배열
	/*	int arr[][] = new int [2][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = i+j;
				System.out.println("arr[" + i + "]["+j+"]="+arr[i][j]);
			}
		}
		*/
		int arr2[][] = {{1,2},
							{3,4,5},
							{6},
							{1,2,3,4},
							{2,3,4}
							};
		int sum = 0;
		for(int i=0; i< arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				sum = sum + arr2[i][j];
			}
		}
		System.out.println(sum);
				
		
		double arr3[][] = {{1,0}, {2,3,3,4}, {4,5,6,2,4,3},{9,0}};
		int sum1 = 0;
		int count = 0;
		for (int i = 0; i < arr3.length; i++) {
			count += arr3[i].length;
			for (int j = 0; j < arr3[i].length; j++) {
			sum1+= arr3[i][j];
			}
		}
		double avg = 0;
		avg = sum1 / count;
		System.out.println(sum1);
		System.out.println(avg);
		}
}

