package Event;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventEx3 extends MFrame
implements KeyListener{
	
	public KeyEventEx3() {
		super(500,300, new Color(100,200,300));
		this.addKeyListener(this);
		
	}
	
	public static void main(String[] args) {
		new KeyEventEx3();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		Graphics g = getGraphics();
		g.setFont(new Font("Dialog", Font.BOLD, 20));
		g.setColor(Color.BLUE);
		g.drawString("code값 : " + (int)e.getKeyChar(), 30, 150);
		g.drawString("문자값 : " + e.getKeyChar(), 30, 180);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		Graphics g = getGraphics();
		g.setFont(new Font("Dialog", Font.BOLD, 20));
		g.setColor(Color.WHITE);
		g.clearRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.RED);
		g.drawString("code값 : " + e.getKeyCode(), 30, 30);
		g.drawString("문자값 : " + e.getKeyChar(), 30, 110);
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	
}
