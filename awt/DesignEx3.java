package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class DesignEx3 extends MFrame{

	List list;
	Button b[] = new Button[4];
	String lab[] = {"�߰�","�����","��ü�����","����"};
	TextField tf;
	String food[] ={"¥���","«��","�쵿"};
	Panel p1,p2,p3;
	
	public DesignEx3() {
		super(300,200);
		setLayout(new BorderLayout()); 
		p1 = new Panel();
		setTitle("������ ����3");
		list = new List();
		for(int i = 0; i<food.length; i++) {
			list.add(food[i]);
		}
		
		p1.setLayout(new GridLayout(4,1));
		for(int i =0; i<b.length; i++) {
			p1.add(b[i] = new Button(lab[i]));
		}
		
		list.select(0);
		add(list);
		add(p1,BorderLayout.EAST);
		add(tf = new TextField(), BorderLayout.SOUTH);
		tf.requestFocus();
		validate();
		
	}

	public static void main(String[] args) {
		new DesignEx3();
	}
}








