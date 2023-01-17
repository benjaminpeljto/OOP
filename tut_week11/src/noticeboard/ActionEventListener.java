package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ActionEventListener implements ActionListener{
	JLabel label;
	JTextArea textArea;
	
	public ActionEventListener(JLabel j, JTextArea t) {
		this.label = j;
		this.textArea = t;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String tekst = this.textArea.getText();
		this.label.setText(tekst);
		this.textArea.setText("");
	}
	
	

}
