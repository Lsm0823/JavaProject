package awt;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileDialogEx1 extends MFrame
implements ActionListener{


	FileDialog openFile, saveFile;
	Button openBtn, saveBtn;
	
	public FileDialogEx1() {
		openFile = new FileDialog(this, "파일열기", FileDialog.LOAD);
		saveFile = new FileDialog(this, "파일저장", FileDialog.SAVE);
		Panel p = new Panel();
		p.add(openBtn = new Button("파일열기"));
		p.add(saveBtn = new Button("파일저장"));
		add(p);
		openBtn.addActionListener(this);
		saveBtn.addActionListener(this);

	} //FileDialogEx1
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//.getSource : 이벤트 발생하는 원인이 누구인가? 일때 사용, 주소값 리던
		
		if(e.getSource() == openBtn) {
			openFile.setVisible(true);
		}else if(e.getSource() == saveBtn){
			saveFile.setVisible(true);
		}
	}	//actionPerformed
	
	
	public static void main(String[] args) {
		new FileDialogEx1();
	}

}
