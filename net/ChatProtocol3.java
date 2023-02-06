package net;

public class ChatProtocol3 {		
		//ID, CHAR, CHATALL, MESSAGE, CHATLIST
		
		// (C -> S) ID : aaa  정보 전달, 구분자 = :
		//(S ->C) CHATLIST:aaa;bbb;ccc;홍길동;
		public static final String ID = "ID";
		
		// (C -> S) CHAR:받는아이디;메세지 ex) CHAR:bbb;밥먹자
		// (S -> C) CHAR:받는아이디;메세지 ex) CHAR:aaa;밥먹자
		public static final String CHAR = "CHAR"; 
		
		// (C -> S) CHATALL:메세지
		// (S -> C) CHATALL:[보내는아이디]메세지
		public static final String CHATALL = "CHATALL";
		
		// (C -> S) MESSAGE:받는아이디;쪽지내용  ex) MESSAGE:bbb;밥먹자
		// (S -> C) MESSAGE:보내는아이디;쪽지내용 ex) MESSAGE:aaa;밥먹자
		public static final String MESSAGE = "MESSAGE"; 
		
		//(S ->C) CHATLIST:aaa;bbb;ccc;홍길동;
		public static final String CHATLIST = "CHATLIST"; 
		
		public static final String CHAT = "CHAT"; 
		
		public static final String MODE = ":";
		//(C->S) MSGLIST:id
		//(S->C) MSGLIST:fid,tid,msg;fid,tid,msg;...
		//(S->C) MSGLIST:aaa,bbb,밥먹자;bbb,ccc,하이...
		public  static final String MSGLIST = "MSGLIST";
		
		public static void main(String[] args) {
			
		}
}
