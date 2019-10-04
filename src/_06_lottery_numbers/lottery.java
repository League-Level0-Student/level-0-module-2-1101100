package _06_lottery_numbers;

import java.util.Random;
import javax.swing.JOptionPane;

public class lottery {
public static void main(String[] args) {
	
	int rNum = new Random().nextInt(9);
	int rNum1 = new Random().nextInt(9);
	int rNum2 = new Random().nextInt(9);
	int rNum3 = new Random().nextInt(9);
	int rNum4 = new Random().nextInt(9);
	JOptionPane.showMessageDialog(null, "the lottery numbers are: " + rNum + rNum1 + rNum2+ rNum3+ rNum4);
	
}
}
