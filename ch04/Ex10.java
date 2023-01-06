package ch04;

public class Ex10 {

	public static void main(String[] args) {
		//중첩 for문을 이용하여 i와 j 의 합이 30이 넘으면 빠져나오시오.
		
		for(int i = 0; i< 20; i++ ) {
			for(int j=0; i<20; i++) {
				if(i+j >= 30) {
					break;
				}
			}
			break;
		}
		
		iot: // 라벨값 : 구역의 시작 위치
		for(int i = 0; i< 20; i++ ) {
			for(int j=0; i<20; i++) {
				if(i+j >= 30) {
					break iot;
				}
			}//for1
		}//for2
		

		
	}
}
