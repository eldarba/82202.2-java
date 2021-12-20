package b;

import javax.swing.JOptionPane;

public class Tar3 {

	public static void main(String[] args) {
		
		
		while (true) {
			try {
				int a = Integer.parseInt(JOptionPane.showInputDialog("enter 1st number"));
				int b = Integer.parseInt(JOptionPane.showInputDialog("enter 2nd number"));
				JOptionPane.showMessageDialog(null, "res: " + (a+b));
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "error: " + e.getMessage());
			}
		}

	}

}
