package ch14;

import java.io.File;

public class FileEx2 {

	public static void main(String[] args) {
		//디렉토리는 [] 일반 파일은 이름으로만 출력
		String dir = "C:/Windows";
		File fdir = new File(dir);
		if(fdir.isDirectory()) {
			System.out.printf("검색 디렉토리 %s \n" , dir);
			System.out.println("==========================");
			String list[] = fdir.list();
			for (int i = 0; i < list.length; i++) {
				File f = new File(dir + File.separator +list[i]);
				if(f.isDirectory()) {	//파일인지 디렉토리인지 확인하는 메소드 true = 디렉토리
					System.out.println("[" + list[i] + "]");
				}else {
					System.out.println(list[i]);
				}
			}
		}else {
			System.out.printf("지정한 %s 는 디렉토리가 아닙니다.", dir);
		}
	}

}
