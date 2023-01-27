package ch14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileEx3 {
	public static void main(String[] args) {
		copyFileByStream("ch14/aaa.pdf", "ch14/bbb.pdf");
	}
	
	public static void copyFileByStream(String sourcePath, 
		String targetPath) {
		File source = new File(sourcePath);
		File target = new File(targetPath);
		if(!source.exists()) {
			return;
		}
		if(!target.getParentFile().exists()) {
			target.getAbsoluteFile().mkdirs();	//상위폴더가 없어도 만들어줌
//			target.getAbsoluteFile().mkdir();	//상위폴더가 없어도 만들어줌
			try {
				InputStream is = new FileInputStream(source);
				OutputStream os = new FileOutputStream(target);
				int temp = 0;
				byte[] data = new byte[1024];
				while((temp=is.read())!= -1) {
					os.write(data,0,temp);
				}
				os.close();
				is.close();
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}
	

}
