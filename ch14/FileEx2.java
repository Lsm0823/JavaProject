package ch14;

import java.io.File;

public class FileEx2 {

	public static void main(String[] args) {
		//���丮�� [] �Ϲ� ������ �̸����θ� ���
		String dir = "C:/Windows";
		File fdir = new File(dir);
		if(fdir.isDirectory()) {
			System.out.printf("�˻� ���丮 %s \n" , dir);
			System.out.println("==========================");
			String list[] = fdir.list();
			for (int i = 0; i < list.length; i++) {
				File f = new File(dir + File.separator +list[i]);
				if(f.isDirectory()) {	//�������� ���丮���� Ȯ���ϴ� �޼ҵ� true = ���丮
					System.out.println("[" + list[i] + "]");
				}else {
					System.out.println(list[i]);
				}
			}
		}else {
			System.out.printf("������ %s �� ���丮�� �ƴմϴ�.", dir);
		}
	}

}
