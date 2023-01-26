package ch12;

public class ThreadEx1 extends Thread {
	
	String name;
	
	public ThreadEx1(String name) {
		this.name = name;
	}//	ThreadEx1������
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(200);	//0.02��
				System.out.println(name + " : " + i);
			} catch (Exception e) {
			}
		}
	}	//run�޼ҵ�
	
	public static void main(String[] args) {
		
		ThreadEx1 t1 = new ThreadEx1("ù��°");
		ThreadEx1 t2 = new ThreadEx1("�ι�°");
		t1.start();
		t2.start();
	}

}	//ThreadEx1 Ŭ����
