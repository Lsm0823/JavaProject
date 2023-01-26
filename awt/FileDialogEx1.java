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
		openFile = new FileDialog(this, "���Ͽ���", FileDialog.LOAD);
		saveFile = new FileDialog(this, "��������", FileDialog.SAVE);
		Panel p = new Panel();
		p.add(openBtn = new Button("���Ͽ���"));
		p.add(saveBtn = new Button("��������"));
		add(p);
		openBtn.addActionListener(this);
		saveBtn.addActionListener(this);

	} //FileDialogEx1
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//.getSource : �̺�Ʈ �߻��ϴ� ������ �����ΰ�? �϶� ���, �ּҰ� ����
		
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