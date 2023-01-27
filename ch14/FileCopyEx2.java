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
			openDialog  = new FileDialog(this, "파일열기",FileDialog.LOAD);
			openDialog.setVisible(true);
			String dir , file;
			dir = openDialog.getDirectory();
			file = openDialog.getFile();
			fileReader(dir + file);
		}else if(obj==save) {
			saveDialog = new FileDialog(this, "파일저장", FileDialog.SAVE);
			saveDialog.setVisible(true);
			String dir, file;
			dir = saveDialog.getDirectory();
			file = saveDialog.getFile();
			fileWriter(dir + file);
		}
	}
	
	//선택된 파일의 내용이 ta에 append 해야함
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
	
	//ta에 오픈된 텍스트를 지정한 파일로 저장 해야함
	public void fileWriter(String file){
		
		try {
			FileWriter wr = new FileWriter(file);
			wr.write(ta.getText());
			for(int i = 5;  i  > 0; i--) {
				ta.setText("파일이 저장되었습니다 " + i + "초후에 사라집니다");
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










