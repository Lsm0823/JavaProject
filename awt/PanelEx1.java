package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;

public class PanelEx1 extends MFrame{
	Label label[] = new Label[3];
	Button btn[] = new Button[3];
	String str1[] = {"첫번째", "두번째", "세번째"};
	String str2[] = {"Start", "Stop", "End"};
	
	public PanelEx1() {
		setLayout(new BorderLayout()); //동서남북 위치가 정해진 레이아웃, 디폴트 레이아웃
		Panel p1,p2;
		p1 = new Panel();
		p1.setBackground(MColor.rColor());
		
		
		for (int i = 0; i < label.length; i++) {
			p1.add(label[i] = new Label(str1[i],Label.CENTER));		
			label[i].setBackground(MColor.rColor());
		}
		
		p2 = new Panel();
		
		for (int i = 0; i < btn.length; i++) {
			p2.add(btn[i] = new Button(str2[i]));	
			btn[i].setBackground(MColor.rColor());
		}
		
		add(p1, BorderLayout.SOUTH);
		add(p2, BorderLayout.NORTH);
	}
	public static void main(String[] args) {
		new PanelEx1();
	}

}
