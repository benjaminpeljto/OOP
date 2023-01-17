package clicker.ui;

import clicker.applicationlogic.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class ClickListener implements ActionListener{
	Calculator calculator;
	JLabel label;
	
	public ClickListener(Calculator calculator, JLabel label) {
		this.calculator = calculator;
		this.label = label;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.calculator.increase();
		this.label.setText("" + this.calculator.giveValue());
		
	}
	
	

}
