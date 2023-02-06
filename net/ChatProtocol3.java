package net;

public class ChatProtocol3 {		
		//ID, CHAR, CHATALL, MESSAGE, CHATLIST
		
		// (C -> S) ID : aaa  ���� ����, ������ = :
		//(S ->C) CHATLIST:aaa;bbb;ccc;ȫ�浿;
		public static final String ID = "ID";
		
		// (C -> S) CHAR:�޴¾��̵�;�޼��� ex) CHAR:bbb;�����
		// (S -> C) CHAR:�޴¾��̵�;�޼��� ex) CHAR:aaa;�����
		public static final String CHAR = "CHAR"; 
		
		// (C -> S) CHATALL:�޼���
		// (S -> C) CHATALL:[�����¾��̵�]�޼���
		public static final String CHATALL = "CHATALL";
		
		// (C -> S) MESSAGE:�޴¾��̵�;��������  ex) MESSAGE:bbb;�����
		// (S -> C) MESSAGE:�����¾��̵�;�������� ex) MESSAGE:aaa;�����
		public static final String MESSAGE = "MESSAGE"; 
		
		//(S ->C) CHATLIST:aaa;bbb;ccc;ȫ�浿;
		public static final String CHATLIST = "CHATLIST"; 
		
		public static final String CHAT = "CHAT"; 
		
		public static final String MODE = ":";
		//(C->S) MSGLIST:id
		//(S->C) MSGLIST:fid,tid,msg;fid,tid,msg;...
		//(S->C) MSGLIST:aaa,bbb,�����;bbb,ccc,����...
		public  static final String MSGLIST = "MSGLIST";
		
		public static void main(String[] args) {
			
		}
}
