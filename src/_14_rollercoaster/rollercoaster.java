package _14_rollercoaster;

import javax.swing.JOptionPane;

public class rollercoaster {
	
	public static void main(String[] args) {
		
		String height = JOptionPane.showInputDialog("enter your height in inches to ride the roller coaster");
		int tall = Integer.parseInt(height);
		if (tall > 48) {
			JOptionPane.showMessageDialog(null, "you can ride the coaster");
		}
		else {
			JOptionPane.showMessageDialog(null, "grow taller first before riding this coaster");
		}
	
	
	
	}
	
	
}
