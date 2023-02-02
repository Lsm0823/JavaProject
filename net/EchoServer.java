package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static final int PORT = 8000;	//포토설정 변경불가(final)
	
	public EchoServer() {
		try {
			int cnt = 0; //Client 접속 개수
			ServerSocket server = new ServerSocket(PORT);
			System.out.println("EchoServer Start.....");
			while(true) {
				//Client가 접속 할때까지 대기 상태
				Socket sock = server.accept(); //접속시 소켓이 생성 (정보를 주고받는 역할을 하는게 소켓)
				EchoThread et = new EchoThread(sock);	//서버객체 생성
				et.start();	//서버 실행 
				cnt++;
				System.out.println("Client" + cnt + "Socket");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	//EchoServer
	
	// 내부클래스로 스레드 생성
	// Client를 대응 관리하기 위한 Thread 상속 내부 클래스 선언
	class EchoThread extends Thread{
		BufferedReader in;
		PrintWriter out;
		Socket sock;
		
		public EchoThread(Socket sock) {
			try {
				this.sock = sock;
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				out = new PrintWriter(sock.getOutputStream(),true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		@Override
		public void run() {
			try {
				//클라이언트가 접속하면 처음으로 받는 메시지
				out.println("Hello Enter BYB to exit");		
				while(true) {
					// Client가 메세지 보낼때까지 대가
					String line = in.readLine();
					if(line == null) {
						break;
					}else {
						out.println("Echo : " + line);
						if(line.equalsIgnoreCase("BYB"))
							break;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	//서버 생성	
	public static void main(String[] args) {
		EchoServer server = new EchoServer();
		
	}

}
