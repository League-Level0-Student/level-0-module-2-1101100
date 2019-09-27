//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;
import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"	
	int rNum = 0;
	rNum = new Random().nextInt(4);
	// 3. Print out this variable
	System.out.println(rNum);
	// 4. Get the user to enter a question for the 8 bal
	JOptionPane.showInputDialog("ask the 8 ball a yes or no question");
	// 5. If the random number is 0
	if (rNum == 0) {
	// -- tell the user "Yes"
		JOptionPane.showMessageDialog(null, "yes");
	}
	// 6. If the random number is 1
	if (rNum == 1) {
	// -- tell the user "No"
		JOptionPane.showMessageDialog(null, "no");
	}
	// 7. If the random number is 2
	if (rNum == 2) {
	// -- tell the user "Maybe you should ask Google?"
		JOptionPane.showMessageDialog(null, "ask google");
	}
	// 8. If the random number is 3
	if (rNum == 3) {
	// -- write your own answer
		JOptionPane.showMessageDialog(null, "maybe");
	}
}
}
