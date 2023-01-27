package ch14;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyEx2 extends MFrame 
implements ActionListener{
	
	Button open, save;
	TextArea ta;
	FileDialog openDialog, saveDialog;
	String sourceDir;
	String sourceFile;
	
	public FileCopyEx2() {
		super(400,500);
		setTitle("FileCopyEx2");
		add(ta = new TextArea());
		Panel p = new Panel();
		p.add(open = new Button("OPEN"));
		p.add(save = new Button("SAVE"));
		ta.setEditable(true);
		open.addActionListener(this);
		save.addActionListener(this);
		add(p,BorderLayout.SOUTH);
		validate();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==open) {
			openDialog  = new FileDialog(this, "���Ͽ���",FileDialog.LOAD);
			openDialog.setVisible(true);
			String dir , file;
			dir = openDialog.getDirectory();
			file = openDialog.getFile();
			fileReader(dir + file);
		}else if(obj==save) {
			saveDialog = new FileDialog(this, "��������", FileDialog.SAVE);
			saveDialog.setVisible(true);
			String dir, file;
			dir = saveDialog.getDirectory();
			file = saveDialog.getFile();
			fileWriter(dir + file);
		}
	}
	
	//���õ� ������ ������ ta�� append �ؾ���
	public void fileReader(String file){

		try {
			FileReader br = new FileReader(file);
			int a;
			String s = "";
			while((a = br.read()) != -1) {
				s += (char)a;
			}
			ta.setText(s);
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//ta�� ���µ� �ؽ�Ʈ�� ������ ���Ϸ� ���� �ؾ���
	public void fileWriter(String file){
		
		try {
			FileWriter wr = new FileWriter(file);
			wr.write(ta.getText());
			for(int i = 5;  i  > 0; i--) {
				ta.setText("������ ����Ǿ����ϴ� " + i + "���Ŀ� ������ϴ�");
				Thread.sleep(1000);
			}
			ta.setText("");
			wr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new FileCopyEx2();
	}
}









