package ch08;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame2 extends MFrame{
	
	Button btn;
	// 필드의 목적 : 객체의 속성, 메소드가 공유
	boolean flag = false; 
	
	public MyFrame2() {
		
		btn = new Button("Button");
		add(btn, BorderLayout.SOUTH);	// SOUTH(상수) = 오타방지, 명확한 의미를 확인하는 목적
		setBackground(Color.green);
		ActionListener ma = new MyAction();
		btn.addActionListener(ma);		
	}	
	class MyAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
		
			if(flag)
				setBackground(Color.green);
			else
				setBackground(Color.yellow);
			flag = !flag;
			
		}
	}

	public static void main(String[] args) {
		new MyFrame2();
	}

}
