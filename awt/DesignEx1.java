package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class DesignEx1 extends MFrame {
	
	Panel p1,p2;
	Label label;
	Checkbox cb1, cb2, cb3;
	CheckboxGroup cbg;
	Button btn1, btn2;
	
	public DesignEx1() {
		super(250,150);
		setLayout(new BorderLayout()); 
		p1 = new Panel();
		p2 = new Panel();
		setTitle("디자인 예제1");
		label = new Label("과일중에 선택", label.CENTER);
		label.setBackground(Color.GREEN);
		add(label,"North");

		cbg = new CheckboxGroup();
		
		p2.add(cb1 = new Checkbox("사과",cbg,true));
		p2.add(cb1 = new Checkbox("딸기",cbg,true));
		p2.add(cb1 = new Checkbox("앵두",cbg,true));
				

		p1.add(btn1 = new Button("Start"));
		p1.add(btn2 = new Button("End"));

		add(p1, BorderLayout.SOUTH);
		add(p2, BorderLayout.CENTER);

		
		setResizable(true);
		validate();
	}
	

	

	public static void main(String[] args) {
		new DesignEx1();
	}

}

