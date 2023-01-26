package ch11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);
		System.out.println(System.currentTimeMillis());
		// currentTimeMillis - 1970년 1월 1일 초 1/1000 , 파일 저장할 때 많이 사용
		
		//원하는 날짜 타입으로 출력
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); 
		String str = sdf.format(d);
		System.out.println(str);
		
		
	}

}
