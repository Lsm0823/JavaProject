package ch08;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends MFrame
implements ActionListener{
	
	Button btn;
	// 필드의 목적 : 객체의 속성, 메소드가 공유
	boolean flag = false; 
	
	public MyFrame() {
		
		btn = new Button("Button");
		add(btn, BorderLayout.SOUTH);	// SOUTH(상수) = 오타방지, 명확한 의미를 확인하는 목적
		setBackground(Color.ORANGE);
		//actionPerformed : 연결메소드
		// 내자신이 ActionListener 타입이므로 this가 가능
		//버튼을 클릭을 하면 ActionEvent 객체가 내부적 생성됨
		btn.addActionListener(/* ActionListener */ this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(flag)
			setBackground(Color.orange);
		else
			setBackground(Color.pink);
		flag = !flag;
	}
	

	public static void main(String[] args) {
		new MyFrame();
	}

}
