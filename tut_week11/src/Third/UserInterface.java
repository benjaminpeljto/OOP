package Third;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable{
private JFrame frame;
	
	public UserInterface() {
	}
	
	@Override
	public void run() {
		frame = new JFrame("Survey");
		frame.setPreferredSize(new Dimension(250,200));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		createComponents(frame.getContentPane());
		frame.pack();
		frame.setVisible(true);
	}
	
	public void createComponents(Container container) {
		
		BoxLayout b = new BoxLayout(container, BoxLayout.Y_AXIS);
		container.setLayout(b);
		
		JLabel t1 = new JLabel("Are you?");
		JLabel t2 = new JLabel("Why");
		
		JCheckBox jcb1 = new JCheckBox("Yes!");
		JCheckBox jcb2 = new JCheckBox("No!");
		
		JRadioButton jrb1 = new JRadioButton("No reason.");
		JRadioButton jrb2 = new JRadioButton("Because it is fun!");
		
		JButton jb1 = new JButton("Done");
		
		ButtonGroup bg1 = new ButtonGroup();
		ButtonGroup bg = new ButtonGroup();
		
		bg1.add(jcb1);
		bg1.add(jcb2);
		bg.add(jrb1);
		bg.add(jrb2);
		
		

		container.add(t1);
		container.add(jcb1);
		container.add(jcb2);
		container.add(t2);
		container.add(jrb1);
		container.add(jrb2);
		container.add(jb1);


	}
	
	public JFrame getFrame() {
		return this.frame;
	}
}
