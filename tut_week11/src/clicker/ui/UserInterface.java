package clicker.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

import clicker.applicationlogic.Calculator;

public class UserInterface implements Runnable{

	private JFrame frame;
	private Calculator calc;
	
	public UserInterface(Calculator calc) {
		this.calc = calc;
	}
	
	@Override
	public void run() {
		frame = new JFrame("Click Effect!");
		frame.setPreferredSize(new Dimension(250,200));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		createComponents(frame.getContentPane());
		frame.pack();
		frame.setVisible(true);
	}
	
	public void createComponents(Container container) {
		container.setLayout(new GridLayout(2,3));
		
		JLabel label = new JLabel("0");
		JButton button = new JButton("Click");
		
		button.addActionListener(new ClickListener(this.calc, label));
		
		container.add(new JLabel());
		container.add(label,BorderLayout.CENTER);
		container.add(new JLabel());
		container.add(new JLabel());
		container.add(button,BorderLayout.SOUTH);

	}
	
	public JFrame getFrame() {
		return this.frame;
	}

}
