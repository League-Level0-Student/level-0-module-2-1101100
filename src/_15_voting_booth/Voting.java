package _15_voting_booth;

import javax.swing.JOptionPane;

public class Voting {
	
	public static void main(String[] args) {
		
		String age = JOptionPane.showInputDialog("enter your age for voting");
		int old = Integer.parseInt(age);
		if (old >= 18) {
			JOptionPane.showInputDialog("vote for the next president");
		}
		else {
			JOptionPane.showMessageDialog(null, " 'If they are younger, tell them nobody cares what they think' - L.E.A.P");
		}
	
	
	
	}
	
	
}
