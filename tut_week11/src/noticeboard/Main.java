package noticeboard;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		NoticeBoard noticeBoard = new NoticeBoard();
		SwingUtilities.invokeLater(noticeBoard);
		
	}

}
