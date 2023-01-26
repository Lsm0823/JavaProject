package ch07;

import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.Frame;

//가장 일반적인 경우
class MFrame2 extends Frame{
	public MFrame2() {
		
	}
	public MFrame2( Color c, int w, int h, boolean flag) {
		setBackground(c);
		setSize(w,h);
		setVisible(true);
		
	}
}

public class inheritanceEx2 {

	public static void main(String[] args) {
		MFrame2 m = new MFrame2();
		m.setBackground(Color.YELLOW);
		m.setSize(300,300);
		m.setVisible(true);
		MFrame2 m2 =
				new MFrame2(Color.red, 200, 150, true);
	}

}
