package Second;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class SwingOn implements Runnable{

	private JFrame frame;
	
	public SwingOn() {
	}
	
	public void run() {
		frame = new JFrame("Swing On!");
		frame.setPreferredSize(new Dimension(400,200));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		createComponents(frame.getContentPane());
		frame.pack();
		frame.setVisible(true);
	}
	
	public void createComponents(Container container) {
		JLabel t1 = new JLabel("Hi");
		container.add(t1);
	}
	
	public JFrame getFrame() {
		return this.frame;
	}

}
