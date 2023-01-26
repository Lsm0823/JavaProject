package awt;

import java.awt.Component;
import java.awt.Label;

public class LabelEx1  extends MFrame{
	
	//Label�� �븘�뱶濡� �꽑�뼵
		
	Label label[] = new Label[4];
	int pos[] = { Label.LEFT, Label.CENTER, Label.RIGHT, Label.LEFT };
	
	
	public LabelEx1() {
		super(200,200);
		setTitle("Label Example");
		String str = "오늘은 즐거운 수요일";
		
		for( int i = 0; i < label.length; i++) {
			label[i] = new Label(str, pos[i]);	
			label[i].setBackground(MColor.rColor());
			add(label[i]);
		}
		validate();
		
		/*
		 * label1 = new Label(str); 
		 * label2 = new Label(str, Label.CENTER); 
		 * label3 = new
		 * Label(str,Label.RIGHT); 
		 * label4 = new Label(str,Label.LEFT);
		 * 
		 * add(label1); add(label2); add(label3); add(label4);
		 */

	}


	public static void main(String[] args) {
		
		new LabelEx1();
		

	}

}
