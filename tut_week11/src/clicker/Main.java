package clicker;

import javax.swing.SwingUtilities;

import clicker.applicationlogic.*;
import clicker.ui.*;

public class Main {

	public static void main(String[] args) {
		Calculator calc = new PersonalCalculator();
		
		UserInterface ui = new UserInterface(calc);
		SwingUtilities.invokeLater(ui);
	}

}
