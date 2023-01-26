package ch12;

class NoThread2{
	String name;
	
	public NoThread2(String name) {
		this.name = name;
	}//	ThreadEx1持失切
	
	public void run() {

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(200);	//0.02段
				System.out.println(name + " : " + i);
			} catch (Exception e) {
			}
		}
	}	//run五社球
	
	public void start() {
		run();
	}	//start
}


public class ThreadEx2 extends Thread {
	
	public ThreadEx2() {
		
	}
	
	public static void main(String[] args) {
		NoThread2 n1 = new NoThread2("First");
		NoThread2 n2 = new NoThread2("Second");
		n1.start();
		n2.start();
		
		
	}

}
