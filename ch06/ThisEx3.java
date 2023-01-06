package ch06;

import java.lang.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

//MFrame는 Frame를 상속받았기 때문에 ThisEx2도 사용가능
public class ThisEx3 extends MFrame
implements ActionListener{  
	Button btn;
	
	Random r;
	
	public ThisEx3() {
		r = new Random(); //랜덤 객체
		btn = new Button("my Button");
		add(btn, "South");
		btn.addActionListener(this);		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		// System.out.println("보이나요?");
		MDialog md = new MDialog(this, "보이나요");
	}
	
	class MDialog extends Dialog
	implements ActionListener{
		
		Button mbtn;
		ThisEx3 f;
		
		public MDialog(ThisEx3 f, String title) {
			super(f, title, true);
			this.f = f;
			setLayout(new FlowLayout());
			setSize(150, 100);
			mbtn = new Button("Click~~");
			mbtn.addActionListener(this);
			add(mbtn);
			
			
			setVisible(true);
		}
		
		public void actionPerformed(ActionEvent e) {
			mbtn.setBackground(rColor());
			f.btn.setBackground(rColor());	
		}
		
		public  Color rColor(){
			int rr,gg,bb;
			rr = r.nextInt(256);
			gg = r.nextInt(256);
			bb = r.nextInt(256);
			return new Color(rr,gg,bb);
		}
	}
	
	
	
	public static void main(String[] args) {
		new ThisEx3();
		
	}

}
