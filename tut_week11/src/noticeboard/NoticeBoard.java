package noticeboard;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class NoticeBoard implements Runnable{

	private JFrame frame;
	
	public NoticeBoard() {
	}
	
	@Override
	public void run() {
		frame = new JFrame("Copy Machine");
		frame.setPreferredSize(new Dimension(300,300));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		createComponents(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public void createComponents(Container container) {
		container.setLayout(new GridLayout(3,1));
		
		JTextArea jta = new JTextArea("Write text to be copied.");
		JButton jb = new JButton("Copy");
		JLabel jl = new JLabel();
		
		jb.addActionListener(new ActionEventListener(jl,jta));
		
		container.add(jta);
		container.add(jb);
		container.add(jl);
		
		
	}
	
	
	
	
	
}
