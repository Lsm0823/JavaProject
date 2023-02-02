package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static final int PORT = 8000;	//���伳�� ����Ұ�(final)
	
	public EchoServer() {
		try {
			int cnt = 0; //Client ���� ����
			ServerSocket server = new ServerSocket(PORT);
			System.out.println("EchoServer Start.....");
			while(true) {
				//Client�� ���� �Ҷ����� ��� ����
				Socket sock = server.accept(); //���ӽ� ������ ���� (������ �ְ�޴� ������ �ϴ°� ����)
				EchoThread et = new EchoThread(sock);	//������ü ����
				et.start();	//���� ���� 
				cnt++;
				System.out.println("Client" + cnt + "Socket");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	//EchoServer
	
	// ����Ŭ������ ������ ����
	// Client�� ���� �����ϱ� ���� Thread ��� ���� Ŭ���� ����
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
				//Ŭ���̾�Ʈ�� �����ϸ� ó������ �޴� �޽���
				out.println("Hello Enter BYB to exit");		
				while(true) {
					// Client�� �޼��� ���������� �밡
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
	
	
	
	//���� ����	
	public static void main(String[] args) {
		EchoServer server = new EchoServer();
		
	}

}
