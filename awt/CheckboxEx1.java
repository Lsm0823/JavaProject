package awt;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckboxEx1 extends MFrame
implements ItemListener{
	
	Checkbox cb1, cb2, cb3;
	Checkbox rb1, rb2, rb3;
	CheckboxGroup grp;
	
	public CheckboxEx1() {
		// TODO Auto-generated constructor stub
		super(220,250);
		add(cb1 = new Checkbox("����1", false));
		add(cb2 = new Checkbox("����2", true));
		add(cb3 = new Checkbox("����3", false));
		
		grp = new CheckboxGroup();
		
		add(rb1 = new Checkbox("����1", grp, true));
		add(rb2 = new Checkbox("����2", grp, true));
		add(rb3 = new Checkbox("����3", grp, true));
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		
		rb1.addItemListener(this);
		rb2.addItemListener(this);
		rb3.addItemListener(this);
		setResizable(true);
		validate();
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		Checkbox cb = (Checkbox)e.getSource();
		String str = cb.getLabel() + " : " + cb.getState();
		setTitle(str);
	}


	public static void main(String[] args) {
		new CheckboxEx1();
	}

}